<template>
  <div style="width: 100%;font-family: 'Times New Roman'">
    <div style="text-align:right ; margin-left: 70%;margin-top: 0px;padding-top: 0 ; width: 30%;margin-bottom: 10px;">
      <el-input placeholder="Please Enter" v-model="searchCondition" style="width: 60%; !important;"  class="input-with-select">
      </el-input>
      <el-button-group>
        <el-dropdown :hide-on-click="false">
          <el-button size="medium"  icon="el-icon-s-grid" type="success"></el-button>
          <el-dropdown-menu slot="dropdown">
            <el-dropdown-item>
              <el-checkbox v-model="systemFamily">System family</el-checkbox>
            </el-dropdown-item>
            <el-dropdown-item>
              <el-checkbox v-model="proteinIds">ID</el-checkbox>
            </el-dropdown-item>
            <el-dropdown-item>
              <el-checkbox v-model="protein">protein</el-checkbox>
            </el-dropdown-item>
            <el-dropdown-item>
              <el-checkbox v-model="inhibitedType">Inhibited Type</el-checkbox>
            </el-dropdown-item>
            <el-dropdown-item>
              <el-checkbox v-model="phage">Phage</el-checkbox>
            </el-dropdown-item>
            <el-dropdown-item>
              <el-checkbox v-model="host">Host</el-checkbox>
            </el-dropdown-item>
            <el-dropdown-item>
              <el-checkbox v-model="spare1">Molecular mechanisms</el-checkbox>
            </el-dropdown-item>
            <el-dropdown-item>
              <el-checkbox v-model="spare2">Protein accession</el-checkbox>
            </el-dropdown-item>
            <el-dropdown-item>
              <el-checkbox v-model="spare3">Modified proteins</el-checkbox>
            </el-dropdown-item>
            <el-dropdown-item>
              <el-checkbox v-model="lenth">Length</el-checkbox>
            </el-dropdown-item>
            <el-dropdown-item>
              <el-checkbox v-model="cankaowenxian">reference(s)</el-checkbox>
            </el-dropdown-item>
          </el-dropdown-menu>
        </el-dropdown>
        <el-button size="medium"  icon="el-icon-search" type="success" @click="mhselect"></el-button>
      </el-button-group>
    </div>
    <el-table v-loading="loading" :data="verifiedList" stripe >
      <el-table-column v-if="proteinIds"  label="ID" sortable align="center" prop="proteinIds">
        <template slot-scope="scope">
          <el-button
            type="text"
            @click="displayDetail(scope.row.proteinIds)"
          >{{scope.row.proteinIds}}</el-button>
        </template>
      </el-table-column>
      <el-table-column v-if="systemFamily" sortable label="System family" align="center" prop="systemFamily" />
      <el-table-column v-if="inhibitedType" sortable label="Inhibited Type" align="center" prop="inhibitedType" />
      <el-table-column v-if="protein" sortable label="Protein" align="center" prop="protein" />
      <el-table-column v-if="spare2" sortable label="Protein accession" align="center" prop="spare2" />
      <el-table-column v-if="phage" sortable label="Phage" align="center" prop="phage" />
      <el-table-column v-if="host" sortable label="Host" align="center" prop="host" />
      <el-table-column v-if="lenth" sortable label="Length" align="center" prop="lenth" />
      <el-table-column v-if="spare1" sortable width="200" label="Molecular mechanisms" align="center" prop="spare1"  :show-overflow-tooltip="true"/>
      <el-table-column v-if="cankaowenxian" sortable label="reference(s)" align="center" prop="cankaowenxian"  >
        <template style="padding: 0 ; margin: 0 ; !important;" slot-scope="scope">
          <el-button  v-for="item in scope.row.cankaowenxian"
            type="text"
            @click="change(item)"
          >{{item}};</el-button>
        </template>
      </el-table-column>
    </el-table>

    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      :page-sizes="[10,25,50,100]"
      @pagination="nextPage"
    />
  </div>
</template>
<script>
import {listVerified, mhSelectListVerified, sortListVerified} from "@/api/system/verified";
  export default {
    name: "index",
    data() {
      return {
        // 遮罩层
        loading: true,
        // 总条数
        total: 0,
        // 【请填写功能名称】表格数据
        verifiedList: [
        ],
        // 查询参数
        queryParams: {
          pageNum: 1,
          pageSize: 10,
          systemFamily: null,
          proteinIds: null,
          protein: null,
          inhibitedType: null,
          phage: null,
          host: null,
          lenth: null,
          cankaowenxian: null,
          spare1: null,
          spare2: null,
          spare3: null,
          spare4: null,
          spare5: null
        },
        // 模态框开关
        dialogVisible:false,
        // 蛋白质详情
        verifiedDetail:{},
        systemFamily: true,
        proteinIds: true,
        protein: true,
        inhibitedType: true,
        phage: true,
        host: true,
        lenth: true,
        cankaowenxian: true,
        spare1: true,
        spare2: true,
        spare3: true,
        searchCondition: null,
      };
    },
    created() {
      this.getList();
    },
    methods: {
      /** 查询【请填写功能名称】列表 */
      getList() {
        if(this.$route.query.condition != undefined){
          var condition = this.$route.query.condition.replace(/\(\d+\)/, '');
          this.queryParams.systemFamily = condition
        }
        this.loading = true;
        listVerified(this.queryParams).then(response => {
          var templist = response.rows;
          for(var i = 0 ; i < templist.length ; i ++ ){
            var a = templist[i].cankaowenxian;
            var arr = [];
            arr  = a.split(';')
            templist[i].cankaowenxian = arr ;
          }
          this.verifiedList = templist;
          this.total = response.total;
          this.loading = false;
        });
      },
      displayDetail(proteinId){
        let routeUrl = this.$router.resolve({
          //路径
          path: "/system/frontvdetail",
          query: {id: proteinId}
        });
        window.open(routeUrl.href, '_blank');
      },
      change(cankaowenxian){
        window.open('https://pubmed.ncbi.nlm.nih.gov/' + cankaowenxian)
      },
      sortChange(column){
        if(column.order == null){
          this.getList()
        }else{
          this.queryParams.spare1 = column.prop
          this.queryParams.spare2 = column.order
          sortListVerified(this.queryParams).then(response => {
            var templist = response.rows;
            for(var i = 0 ; i < templist.length ; i ++ ){
              var a = templist[i].cankaowenxian;
              var arr = [];
              arr  = a.split(';')
              templist[i].cankaowenxian = arr ;
            }
            this.verifiedList = templist;
            this.total = response.total;
            this.loading = false;
            this.queryParams.spare1 = null;
            this.queryParams.spare2 = null;
          });
        }
      },
      mhselect(){
        if(this.searchCondition != null && this.searchCondition != " "){
          mhSelectListVerified(this.searchCondition).then(response => {
            var templist = response.rows;
            for(var i = 0 ; i < templist.length ; i ++ ){
              var a = templist[i].cankaowenxian;
              var arr = [];
              arr  = a.split(';')
              templist[i].cankaowenxian = arr ;
            }
            this.verifiedList = templist;
            this.total = response.total;
            this.loading = false;
            this.searchCondition = null ;
          });
        }else {
          listVerified().then(response => {
            var templist = response.rows;
            for(var i = 0 ; i < templist.length ; i ++ ){
              var a = templist[i].cankaowenxian;
              var arr = [];
              arr  = a.split(';')
              templist[i].cankaowenxian = arr ;
            }
            this.verifiedList = templist;
            this.total = response.total;
            this.loading = false;
            this.queryParams = {
              pageNum: 1,
              pageSize: 10,
              systemFamily: null,
              proteinIds: null,
              protein: null,
              inhibitedType: null,
              phage: null,
              host: null,
              lenth: null,
              cankaowenxian: null,
              spare1: null,
              spare2: null,
              spare3: null,
              spare4: null,
              spare5: null
            } ;
          });
        }
      },
      nextPage(){
        this.loading = true;
        listVerified(this.queryParams).then(response => {
          var templist = response.rows;
          for(var i = 0 ; i < templist.length ; i ++ ){
            var a = templist[i].cankaowenxian;
            var arr = [];
            arr  = a.split(';')
            templist[i].cankaowenxian = arr ;
          }
          this.verifiedList = templist;
          this.total = response.total;
          this.loading = false;
        });
      }
    }
  };
</script>

<style lang="scss" scoped>

</style>
