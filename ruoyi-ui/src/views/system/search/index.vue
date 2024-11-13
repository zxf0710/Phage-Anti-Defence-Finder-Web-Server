<template>
    <div style="text-align: center ; width: 100%;font-family: 'Times New Roman'" >
      <div style="width: 70% ; margin-left :  15%; box-shadow: 0 2px 4px rgba(0,0,0,0.4), 0 0 6px rgba(0, 0, 0, .04);border: 1px #f1f1f1 solid;">
        <div style="margin-top: 20px; text-align: center ; font-size: xx-large ; font-family: 'Times New Roman' ;font-weight: bolder">
          Advanced Conditional Search
        </div>
        <section  v-for="(value, index) in searchList" :key="index">
          <section style="margin:20px;" v-if="index === 0">
            <el-row>
              <el-col :span="3">
                <el-select style="visibility: hidden" v-model="searchList[index].condition"  >
                  <el-option
                    v-for="item in andors"
                    :key="item.value"
                    :label="item.label"
                    :value="item.value">
                  </el-option>
                </el-select>
              </el-col>
              <el-col :span="6">
                <el-select v-model="searchList[index].category" placeholder="Please Select Category" >
                  <el-option
                    v-for="item in optionsTemp"
                    :key="item.value"
                    :label="item.label"
                    :value="item.value">
                  </el-option>
                </el-select>
              </el-col>
              <el-col :span="12">
                <el-input v-model="searchList[index].content" placeholder="Please Enter Content" clearable />
              </el-col>
              <el-col :span="3" v-if="index < 7">
                <el-button
                  :disabled="isdisabled"
                  type="primary" icon="el-icon-plus" plain style="margin-left:10px;" circle
                  @click="addsearchList(index, '1')"/>
              </el-col>
            </el-row>
          </section>
          <section v-show="isDisplay" style="margin:20px;" v-if="index > 0 && index < 7">
            <!-- 添加的子项目 -->
            <el-row >
              <el-col :span="3">
                <el-select v-model="searchList[index].condition"
                           placeholder="AND">
                  <el-option
                    v-for="item in andors"
                    :key="item.value"
                    :label="item.label"
                    :value="item.value">
                  </el-option>
                </el-select>
              </el-col>
              <el-col :span="6">
                <el-select
                  v-model="searchList[index].category"
                  placeholder="Please Select Category"
                >
                  <el-option
                    v-for="item in options"
                    :key="item.value"
                    :label="item.label"
                    :value="item.value">
                  </el-option>
                </el-select>
              </el-col>
              <el-col :span="12">
                <el-input
                  v-model="searchList[index].content"
                  placeholder="Please Enter Content"
                  clearable
                  @keyup.enter.native="addsearchList(index, '1')"/>
              </el-col>
              <el-col :span="3">
                <el-button type="danger"
                           icon="el-icon-delete"
                           plain
                           style="margin-left:10px;"
                           circle
                           @click="rmsearchList(searchList[index].category,index, '1')"/>
              </el-col>
            </el-row>
          </section>
        </section>
        <el-button @click="searchProteins" type="warning" style="margin: 0 20px  20px 0 " icon="el-icon-search">Search</el-button>
        <el-button v-show="isDown" @click="isDisplay = true ; isDown = false ; isUp = true ; isdisabled = false" type="primary" style="margin: 0 0  20px 0 " icon="el-icon-arrow-down">unfold</el-button>
        <el-button v-show="isUp" @click="isDisplay = false  ; isDown = true ; isUp = false ; isdisabled = true" type="primary" style="margin: 0 0  20px 0 " icon="el-icon-arrow-up">fold</el-button>
      </div>
      <div v-if="isResult" style="margin: 20px 0">
        <div style="margin: 20px 0; text-align: center ; font-size: xx-large ; font-weight: bolder">
          Search Results
          <el-radio v-model="radio" label="1">Verified</el-radio>
          <el-radio v-model="radio" label="2">Predicted</el-radio>
<!--          <el-dropdown :hide-on-click="false">-->
<!--            <el-button size="small"  icon="el-icon-s-grid" round ></el-button>-->
<!--            <el-dropdown-menu slot="dropdown">-->
<!--              <el-dropdown-item>-->
<!--                <el-checkbox v-model="systemFamily">System family</el-checkbox>-->
<!--              </el-dropdown-item>-->
<!--              <el-dropdown-item>-->
<!--                <el-checkbox v-model="proteinIds">ID</el-checkbox>-->
<!--              </el-dropdown-item>-->
<!--              <el-dropdown-item>-->
<!--                <el-checkbox v-model="protein">protein</el-checkbox>-->
<!--              </el-dropdown-item>-->
<!--              <el-dropdown-item>-->
<!--                <el-checkbox v-model="inhibitedType">Inhibited Type</el-checkbox>-->
<!--              </el-dropdown-item>-->
<!--              <el-dropdown-item>-->
<!--                <el-checkbox v-model="phage">Phage</el-checkbox>-->
<!--              </el-dropdown-item>-->
<!--              <el-dropdown-item>-->
<!--                <el-checkbox v-model="host">Host</el-checkbox>-->
<!--              </el-dropdown-item>-->
<!--              <el-dropdown-item>-->
<!--                <el-checkbox v-model="length">Length</el-checkbox>-->
<!--              </el-dropdown-item>-->
<!--              <el-dropdown-item>-->
<!--                <el-checkbox v-model="cankaowenxian">reference(s)</el-checkbox>-->
<!--              </el-dropdown-item>-->
<!--            </el-dropdown-menu>-->
<!--          </el-dropdown>-->
        </div>

        <div class="isVerified" v-show="visVerified">
          <el-table v-loading="loading" :data="verifiedList" stripe @sort-change="vsortChange">
            <el-table-column v-if="systemFamily" :sortable="'custom'" label="System family" align="center" prop="systemFamily" />
            <el-table-column v-if="proteinIds" :sortable="'custom'" label="ID"  align="center" prop="proteinIds">
              <template slot-scope="scope">
                <el-button
                  type="text"
                  @click="vdisplayDetail(scope.row.proteinIds)"
                >{{scope.row.proteinIds}}</el-button>
              </template>
            </el-table-column>
            <el-table-column v-if="protein" :sortable="'custom'" label="protein" align="center" prop="protein" />
            <el-table-column v-if="inhibitedType" :sortable="'custom'" label="Inhibited Type" align="center" prop="inhibitedType" />
            <el-table-column v-if="phage" :sortable="'custom'" label="Phage" align="center" prop="phage" />
            <el-table-column v-if="host" :sortable="'custom'" label="Host" align="center" prop="host" />
            <el-table-column v-if="lenth" :sortable="'custom'" label="Length" align="center" prop="lenth" />
            <el-table-column v-if="spare1" :sortable="'custom'" width="200" label="Molecular mechanisms" align="center" prop="spare1"  :show-overflow-tooltip="true"/>
            <el-table-column v-if="spare2" :sortable="'custom'" label="Protein accession" align="center" prop="spare2" />
            <el-table-column v-if="spare3" :sortable="'custom'" label="Modified proteins" align="center" prop="spare3" />
            <el-table-column v-if="cankaowenxian" :sortable="'custom'" label="reference(s)" align="center" prop="cankaowenxian"  >
              <template style="padding: 0 ; margin: 0 ; !important;" slot-scope="scope">
                <el-button  v-for="item in scope.row.cankaowenxian"
                            type="text"
                            @click="changev(item)"
                >{{item}};</el-button>
              </template>
            </el-table-column>
          </el-table>

          <pagination
            v-show="vtotal>0"
            :total="vtotal"
            :page.sync="vselectParams.pageNum"
            :limit.sync="vselectParams.pageSize"
            :page-sizes="[10,25,50,100]"
            @pagination="selectVerifiedList"
          />
        </div>
        <div class="isPredicted" v-show="visPredicted">
          <el-table v-loading="loading" :data="predictedList" stripe @sort-change="psortChange">
            <el-table-column v-if="systemFamily" :sortable="'custom'" label="System family" align="center" prop="systemFamily" />
            <el-table-column v-if="proteinIds"   :sortable="'custom'" label="ID"  align="center" prop="proteinIds">
              <template slot-scope="scope">
                <el-button
                  type="text"
                  @click="displayDetail(scope.row.proteinIds)"
                >{{scope.row.proteinIds}}</el-button>
              </template>
            </el-table-column>
            <el-table-column v-if="protein" :sortable="'custom'" label="protein"  align="center" prop="protein" />
            <el-table-column v-if="inhibitedType" :sortable="'custom'" label="Inhibited Type" align="center" prop="inhibitedType" />
            <el-table-column v-if="phage" :sortable="'custom'" label="Phage"  align="center" prop="phage" />
            <el-table-column v-if="host" :sortable="'custom'" label="Host" align="center" prop="host" />
            <el-table-column v-if="spare1" :sortable="'custom'" label="Sequence"  align="center" prop="spare1"   :show-overflow-tooltip="true" />
            <el-table-column v-if="spare2" :sortable="'custom'" label="Protein accession"  align="center" prop="spare2" />
            <el-table-column v-if="length" :sortable="'custom'" label="Length"  align="center" prop="length" />
            <el-table-column v-if="cankaowenxian" :sortable="'custom'" label="reference(s)" align="center" prop="cankaowenxian" >
              <template slot-scope="scope">
                <el-button
                  type="text"
                  @click="changep(scope.row.cankaowenxian)"
                >{{scope.row.cankaowenxian}}</el-button>
              </template>
            </el-table-column>
          </el-table>
          <pagination
            v-show="total>0"
            :total="total"
            :page.sync="selectParams.pageNum"
            :limit.sync="selectParams.pageSize"
            :page-sizes="[10,25,50,100]"
            @pagination="selectPredictedList"
          />
        </div>
      </div>
    </div>
</template>
<script>
  import { selectPredictedList } from "@/api/system/predicted";
  import { selectVerifiedList} from "@/api/system/verified";

  export default {
        name: "index",
        data(){
          return{
            count : 0 ,
            searchList: [
              {   category:'',
                  content:'',
                  condition :''
              }],
            options: [{
              value: 'system_family',
              label: 'System Family'
            }, {
              value: 'protein_ids',
              label: 'ID'
            }, {
              value: 'protein',
              label: 'Protein'
            }, {
              value: 'inhibited_type',
              label: 'Inhibited Type'
            }, {
              value: 'phage',
              label: 'Phage'
            }, {
              value: 'host',
              label: 'Host'
            },{
              value: 'length',
              label: 'Length'
            }],
            optionsTemp: [{
              value: 'system_family',
              label: 'System Family'
            }, {
              value: 'protein_ids',
              label: 'ID'
            }, {
              value: 'protein',
              label: 'Protein'
            }, {
              value: 'inhibited_type',
              label: 'Inhibited Type'
            }, {
              value: 'phage',
              label: 'Phage'
            }, {
              value: 'host',
              label: 'Host'
            },{
              value: 'length',
              label: 'Length'
            }],
            andors: [{
              value: 'and',
              label: 'AND'
            }, {
              value: 'or',
              label: 'OR'
            }],
            //禁用添加条件按钮
            isdisabled:false,
            //是否展示搜索结果
            isResult : false,
            selectParams : {
              pageNum: 1,
              pageSize: 10,
              systemFamily: null,
              proteinIds: null,
              protein: null,
              inhibitedType: null,
              phage: null,
              host: null,
              length: null,
              cankaowenxian: null,
              spare1: null,
              spare2: null,
              spare3: null,
              spare4: null,
              spare5: null
            },
            vselectParams : {
              pageNum: 1,
              pageSize: 10,
              systemFamily: null,
              proteinIds: null,
              protein: null,
              inhibitedType: null,
              phage: null,
              host: null,
              length: null,
              cankaowenxian: null,
              spare1: null,
              spare2: null,
              spare3: null,
              spare4: null,
              spare5: null
            },
            ///////已证实查询结果
            // 遮罩层
            vloading: true,
            // 总条数
            vtotal: 0,
            // 【请填写功能名称】表格数据
            verifiedList: [],
            // 模态框开关
            vdialogVisible:false,
            // 蛋白质详情
            verifiedDetail:{},

            //////待预测查询结果
            // 遮罩层
            loading: true,
            // 总条数
            total: 0,
            // 【请填写功能名称】表格数据
            predictedList: [],
            // 模态框开关
            dialogVisible:false,
            // 蛋白质详情
            predictedDetail:{},
            //结果选择按钮
            radio: '1',
            visVerified : true ,
            visPredicted : false ,
            //定时器
            timer: null,
            //收起或者放下条件框
            isDisplay:true ,
            isDown : false ,
            isUp : false ,
            systemFamily: true,
            proteinIds: true,
            protein: true,
            inhibitedType: true,
            phage: true,
            host: true,
            lenth: true,
            spare1: true,
            spare2: true,
            spare3: true,
            spare4: true,
            spare5: true,
            cankaowenxian: true,
          }
        },
      created: function () {
          clearInterval(this.timer)
          this.timer = null
      },
      methods:{
      addsearchList(index, type) {
        this.count ++ ;
        if(this.count == 6){
          this.isdisabled = true
        }
        for(var i = 0 ; i < this.searchList.length; i ++){
          for(var j = 0 ; j < this.options.length ; j++){
            if(this.searchList[i].category == this.options[j].value){
              this.options.splice(j ,1)
            }
          }
        }
        if (type === '1'&& this.count < 7 ) {
          this.searchList.push({category:'', content:'',condition:''})
        }
      },
      rmsearchList(label,index, type) {
        if(label != '') {
          for(var i = 0 ; i < this.searchList.length; i ++){
            if(this.searchList[i].category == label ){
              this.searchList.splice(i,1)
            }
          }
          var j = 0 ;
          for( j = 0 ; j < this.options.length ; j++){
            if(this.options[j].value == label){
              j = -1;
              break;
            }
          }
          if(j != -1){
            this.options.push({value: label , label: label})
          }
        }
        if(label == ''){
          this.searchList.splice(this.searchList.length - 1 ,1)
        }
        this.count --  ;
        if(this.count != 6){
          this.isdisabled = false
        }
        this.$message.success('The Removal Was Successful!')
      },
      //查询表单
      searchProteins(){
        if(this.searchList.length == 1 && this.searchList[0].category == '' ){
          this.$message.warning("Please Enter The Search Criteria!")
        }else{
          this.isResult = true
          let conditionList = this.searchList[0].category + ' like ' + '\'%' + this.searchList[0].content + '%\'' + ' '
          for(var i = 1 ; i < this.searchList.length ; i ++ ){
            if(this.searchList[0].content != '')
              conditionList += this.searchList[i].condition + ' ' + this.searchList[i].category + ' like ' + '\'%' + this.searchList[i].content + '%\''
          }
          this.selectParams.spare1 = conditionList
          this.vselectParams.spare1 = conditionList
          this.selectPredictedList()
          this.selectVerifiedList()
          this.setTimer()
          if(this.searchList.length > 1){
            this.isUp = true
            this.isDown = false
          }
        }
      },
      //检索待预测目录
      selectPredictedList(){
        selectPredictedList(this.selectParams).then(response => {
          this.isResult =true
          this.loading = true;
          this.predictedList = response.rows;
          this.total = response.total;
          this.loading = false;
          this.selectParams.spare2 = null;
          this.selectParams.spare3 = null;
        });
      },
        //检索已证实目录
      selectVerifiedList(){
        selectVerifiedList(this.vselectParams).then(response => {
          this.isResult =true
          this.vloading = true;
          var templist = response.rows;
          for(var i = 0 ; i < templist.length ; i ++ ){
            var a = templist[i].cankaowenxian;
            var arr = [];
            arr  = a.split(';')
            templist[i].cankaowenxian = arr ;
          }
          this.verifiedList = templist;
          this.vtotal = response.total;
          this.vloading = false;
          this.vselectParams.spare2 = null;
          this.vselectParams.spare3 = null;
        });
      },
      //展示详情
      //待预测
      displayDetail(proteinId){
        let routeUrl = this.$router.resolve({
          //路径
          path: "/system/frontpdetail",
          query: {id: proteinId}
        });
        window.open(routeUrl.href, '_blank');
      },
      //已证实
      vdisplayDetail(proteinId){
        let routeUrl = this.$router.resolve({
          //路径
          path: "/system/frontvdetail",
          query: {id: proteinId}
        });
        window.open(routeUrl.href, '_blank');
        // getVdetailByProteinIds(proteinId)
        //   .then(response => {
        //     this.verifiedDetail = response.data
        //     if(response.data != null){
        //       this.vdialogVisible = true;
        //     }
        //   })
      },
      //展示不同结果
      changeRadio() {
        if(this.radio == '1'){
          this.visVerified = true ;
          this.visPredicted = false ;
        }
        else if(this.radio == '2'){
          this.visVerified = false ;
          this.visPredicted = true ;
        }
      },
      //设置定时器
      setTimer() {
        if(this.timer == null) {
          this.timer = setInterval( () => {
            this.changeRadio()
          }, 500)
        }
      },
      //跳转参考文献
      changev(cankaowenxian){
        window.open('https://pubmed.ncbi.nlm.nih.gov/' + cankaowenxian)
      },
      changep(cankaowenxian){
        window.open('https://pubmed.ncbi.nlm.nih.gov/' + cankaowenxian)
      },
      //根据列表项排序
        //verified
      vsortChange(column){
        if(column.order == null){
          this.searchProteins()
        }else{
          this.vselectParams.spare2 = column.prop
          this.vselectParams.spare3 = column.order
          this.selectVerifiedList();
        }
      },
        //predicted
      psortChange(column){
        if(column.order == null){
          this.searchProteins()
        }else{
          this.selectParams.spare2 = column.prop
          this.selectParams.spare3 = column.order
          this.selectPredictedList();
        }
      }
    },
      destroyed: function () {
        // 每次离开当前界面时，清除定时器
        clearInterval(this.timer)
        this.timer = null
      },

    }
</script>

<style scoped>

</style>
