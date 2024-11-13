<template>
  <div style="margin-top: 0 ; padding-top: 0 ; !important;font-family: 'Times New Roman'">
    <div style="margin: 0 0 20px 0; font-size: xx-large ;width: 40%;float: left; font-weight: bolder">
      <el-radio v-model="radio" label="1">Protein</el-radio>
      <el-radio v-model="radio" label="2">Genome</el-radio>
      <el-radio v-model="radio" label="3">Anti-defense Gene Cluster</el-radio>
    </div>
    <div v-show="plshow">
      <div style="text-align:right ; margin-left: 70%;margin-top: 0px;padding-top: 0 ; width: 30%;margin-bottom: 10px;">
        <el-input placeholder="Please Enter" v-model="searchCondition" style="width: 60%; !important;"  class="input-with-select">
        </el-input>
        <el-button-group>
          <el-dropdown :hide-on-click="false">
            <el-button size="medium"  icon="el-icon-s-grid" type="success"></el-button>
            <el-dropdown-menu slot="dropdown">
              <el-dropdown-item>
                <el-checkbox v-model="pSearch.systemFamily">System family</el-checkbox>
              </el-dropdown-item>
              <el-dropdown-item>
                <el-checkbox v-model="pSearch.proteinIds">ID</el-checkbox>
              </el-dropdown-item>
              <el-dropdown-item>
                <el-checkbox v-model="pSearch.protein">protein</el-checkbox>
              </el-dropdown-item>
              <el-dropdown-item>
                <el-checkbox v-model="pSearch.inhibitedType">Inhibited Type</el-checkbox>
              </el-dropdown-item>
              <el-dropdown-item>
                <el-checkbox v-model="pSearch.phage">Phage accession number</el-checkbox>
              </el-dropdown-item>
              <el-dropdown-item>
                <el-checkbox v-model="pSearch.host">Host</el-checkbox>
              </el-dropdown-item>
              <el-dropdown-item>
                <el-checkbox v-model="pSearch.spare1">Sequence</el-checkbox>
              </el-dropdown-item>
              <el-dropdown-item>
                <el-checkbox v-model="pSearch.spare2">Protein accession</el-checkbox>
              </el-dropdown-item>
              <el-dropdown-item>
                <el-checkbox v-model="pSearch.length">Length</el-checkbox>
              </el-dropdown-item>
              <el-dropdown-item>
                <el-checkbox v-model="pSearch.spare3">Phage</el-checkbox>
              </el-dropdown-item>
            </el-dropdown-menu>
          </el-dropdown>
          <el-button size="medium"  icon="el-icon-search" type="success" @click="mhselect"></el-button>
        </el-button-group>
      </div>
      <el-table v-loading="loading" :data="predictedList" stripe>
        <el-table-column v-if="pSearch.proteinIds"   label="ID"  align="center" prop="proteinIds">
          <template slot-scope="scope">
            <el-button
              type="text"
              @click="displayDetail(scope.row.proteinIds)"
            >{{scope.row.proteinIds}}</el-button>
          </template>
        </el-table-column>
        <el-table-column v-if="pSearch.systemFamily" sortable  label="System family" align="center" prop="systemFamily" />
        <el-table-column v-if="pSearch.inhibitedType"  sortable label="Inhibited Type" align="center" prop="inhibitedType" />
        <el-table-column v-if="pSearch.protein" sortable  width="100" label="Protein"  align="center" prop="protein" />
        <el-table-column v-if="pSearch.spare2" sortable label="Protein accession"  align="center" prop="spare2" />
        <el-table-column v-if="pSearch.spare1" sortable label="Sequence"  align="center" prop="spare1"   :show-overflow-tooltip="true" />
        <el-table-column v-if="pSearch.phage" sortable width="210" label="Phage accession number"  align="center" prop="phage" />
        <el-table-column v-if="pSearch.spare3" sortable label="Phage"  align="center" prop="spare3" />
        <el-table-column v-if="pSearch.host" sortable label="Host" align="center" prop="host" />
        <el-table-column v-if="pSearch.length" sortable label="Length"  align="center" prop="length" />
      </el-table>

      <pagination
        v-show="total>0"
        :total="total"
        :page.sync="queryParams.pageNum"
        :limit.sync="queryParams.pageSize"
        :page-sizes="[10,25,50,100]"
        @pagination="mhselect"
      />
    </div>

    <div v-show="pgshow">
      <div style="text-align:right ; margin-left: 70%;margin-top: 0px;padding-top: 0 ; width: 30%;margin-bottom: 10px;">
        <el-input placeholder="Please Enter" v-model="gsearchCondition" style="width: 60%; !important;"  class="input-with-select">
        </el-input>
        <el-button-group>
          <el-dropdown :hide-on-click="false">
            <el-button size="medium"  icon="el-icon-s-grid" type="success"></el-button>
            <el-dropdown-menu slot="dropdown">
              <el-dropdown-item>
                <el-checkbox v-model="gSearch.phageGenomeAccession">Phage Accession</el-checkbox>
              </el-dropdown-item>
              <el-dropdown-item>
                <el-checkbox v-model="gSearch.host">Host</el-checkbox>
              </el-dropdown-item>
              <el-dropdown-item>
                <el-checkbox v-model="gSearch.antiDenfenceSystemNumbers">Phage</el-checkbox>
              </el-dropdown-item>
              <el-dropdown-item>
                <el-checkbox v-model="gSearch.spare1">System Numbers</el-checkbox>
              </el-dropdown-item>
              <el-dropdown-item>
                <el-checkbox v-model="gSearch.spare2">Size(Kb)</el-checkbox>
              </el-dropdown-item>
            </el-dropdown-menu>
          </el-dropdown>
          <el-button size="medium"  icon="el-icon-search" type="success" @click="gmhselect"></el-button>
        </el-button-group>
      </div>
      <el-table v-loading="gloading" :data="genomeList" stripe  @sort-change="sortChange" >
        <el-table-column v-if="gSearch.phageGenomeAccession" sortable="custom" label="Phage Accession" align="center" prop="phageGenomeAccession" >
          <template slot-scope="scope">
            <el-button
              type="text"
              @click="displayGlist(scope.row.phageGenomeAccession)"
            >{{scope.row.phageGenomeAccession}}</el-button>
          </template>
        </el-table-column>
        <el-table-column v-if="gSearch.spare1" sortable="custom"
                         label="System Numbers" align="center"  prop="spare1" />
        <el-table-column v-if="gSearch.antiDenfenceSystemNumbers" sortable="custom" label="Phage" align="center" prop="antiDenfenceSystemNumbers"/>
        <el-table-column v-if="gSearch.host" sortable="custom" label="Host" align="center" prop="host" />
        <el-table-column v-if="gSearch.spare2" sortable="custom"  label="Size(Kb)" align="center" prop="spare2" />
      </el-table>
      <pagination
        v-show="gtotal>0"
        :total="gtotal"
        :page.sync="gqueryParams.pageNum"
        :limit.sync="gqueryParams.pageSize"
        :page-sizes="[10,25,50,100]"
        @pagination="gmhselect"
      />
    </div>
    <div v-show="xlshow">
      <div style="text-align:right ; margin-left: 70%;margin-top: 0px;padding-top: 0 ; width: 30%;margin-bottom: 10px;">
        <el-input placeholder="Please Enter" v-model="asearchCondition" style="width: 60%; !important;"  class="input-with-select">
        </el-input>
        <el-button-group>
          <el-dropdown :hide-on-click="false">
            <el-button size="medium"  icon="el-icon-s-grid" type="success"></el-button>
            <el-dropdown-menu slot="dropdown">
              <el-dropdown-item>
                <el-checkbox v-model="aSearch.phageId">ID</el-checkbox>
              </el-dropdown-item>
              <el-dropdown-item>
                <el-checkbox v-model="aSearch.systemNumbers">System Numbers</el-checkbox>
              </el-dropdown-item>
              <el-dropdown-item>
                <el-checkbox v-model="aSearch.host">Host</el-checkbox>
              </el-dropdown-item>
              <el-dropdown-item>
                <el-checkbox v-model="aSearch.phage">Phage</el-checkbox>
              </el-dropdown-item>
              <el-dropdown-item>
                <el-checkbox v-model="aSearch.size">Size(Kb)</el-checkbox>
              </el-dropdown-item>
            </el-dropdown-menu>
          </el-dropdown>
          <el-button size="medium"  icon="el-icon-search" type="success" @click="amhselect"></el-button>
        </el-button-group>
      </div>
      <el-table v-loading="aloading" :data="antiList" @sort-change="sortChange" stripe>
        <el-table-column v-if="aSearch.phageId" sortable="custom" label="Phage Accession" align="center" prop="phageId" >
          <template slot-scope="scope">
            <el-button
              type="text"
              @click="displayAlist(scope.row.phageId)"
            >{{scope.row.phageId}}</el-button>
          </template>
        </el-table-column>
        <el-table-column v-if="aSearch.systemNumbers" sortable="custom" label="System Numbers" align="center"  prop="systemNumbers" />
        <el-table-column v-if="aSearch.phage" sortable="custom"  label="Phage" align="center" prop="phage" />
        <el-table-column v-if="aSearch.host" sortable="custom" label="Host" align="center" prop="host" />
        <el-table-column v-if="aSearch.size" sortable="custom" label="Size(Kb)" align="center" prop="size" />
      </el-table>

      <pagination
        v-show="atotal>0"
        :total="atotal"
        :page.sync="aqueryParams.pageNum"
        :limit.sync="aqueryParams.pageSize"
        :page-sizes="[10,25,50,100]"
        @pagination="amhselect"
      />
    </div>



    <el-dialog :title="pdTitle" style="margin-top: 10vh;" :visible.sync="pdDialog" width="95%" >
      <el-table  :data="pdList" stripe>
        <el-table-column  sortable label="ID" align="center" prop="pID" />
        <el-table-column sortable label="System" align="center" prop="systemFamily" />
        <el-table-column sortable label="Protein" align="center" prop="protein" />
        <el-table-column sortable label="Protein Accession" align="center" prop="phageGenomeAccession" />
        <el-table-column sortable label="E-value" align="center" prop="spare4" />
        <el-table-column sortable label="Score" align="center" prop="spare5" />
      </el-table>
      <pagination
        style="text-align: center"
        v-show="pdTotal>0"
        :total="pdTotal"
        :page.sync="gdqueryParams.pageNum"
        :limit.sync="gdqueryParams.pageSize"
        :page-sizes="[10,25,50,100]"
        @pagination="displayDGlist"
      />
    </el-dialog>
    <el-dialog :title="adTitle" style="margin-top: 10vh;" width="95%" :visible.sync="adDialog">
      <el-table  :data="adList" stripe>
      <el-table-column  sortable label="ID" align="center" prop="aID" />
      <el-table-column sortable label="System" align="center" prop="systemName" />
      <el-table-column sortable label="Protein" align="center" prop="protein" />
      <el-table-column sortable label="Protein ID" align="center" prop="proteinId" />
      <el-table-column sortable label="E-value" align="center" prop="eValue" />
      <el-table-column sortable label="Score" align="center" prop="scorePoint" />
      </el-table>
      <pagination
        style="text-align: center"
        v-show="adTotal>0"
        :total="adTotal"
        :page.sync="adqueryParams.pageNum"
        :limit.sync="adqueryParams.pageSize"
        :page-sizes="[10,25,50,100]"
        @pagination="displayDAlist"
      />
    </el-dialog>


  </div>
</template>

<script>
  import { listPredicted,mhselectListPredicted } from "@/api/system/predicted";
  import { listGenome,mhselectListGenome } from "@/api/system/genome";
  import {listAnti, mhselectListAnti,} from "@/api/system/anti";
  import {listBasic} from "@/api/system/basic";
  import {listDetail} from "@/api/system/detail";

  export default {
    name: "predictedFront",
    data() {
      return {
        // 遮罩层
        loading: true,
        gloading: true,
        aloading: true,
        // 总条数
        total: 0,
        gtotal: 0,
        atotal: 0,

        pList:[],
        gList:[],
        aList:[],
        // 【请填写功能名称】表格数据
        predictedList: [],
        genomeList:[],
        antiList:[],


        ppageinfo: {
          page: 1,
          size: 10,
          total: 0,
        },
        gpageinfo: {
          page: 1,
          size: 10,
          total: 0,
        },
        apageinfo: {
          page: 1,
          size: 10,
          total: 0,
        },


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
          length: null,
          cankaowenxian: null,
          spare1: null,
          spare2: null,
          spare3: null,
          spare4: null,
          spare5: null
        },
        gqueryParams: {
          pageNum: 1,
          pageSize: 10,
          phageName: null,
          phageGenomeAccession: null,
          antiDenfenceSystemNumbers: null,
          host: null,
          spare1: null,
          spare2: null,
          spare3: null,
          spare4: null,
          spare5: null
        },
        aqueryParams: {
          pageNum: 1,
          pageSize: 10,
          phageId: null,
          systemNumbers: null,
          host: null,
          phage: null,
          size: null,
        },
        radio:'1',
        plshow:true,
        pgshow:false,
        xlshow:false,
        //定时器
        timer: null,
        //模糊查询
        searchCondition:null,
        pSearch:{
          systemFamily: true,
          proteinIds: true,
          protein: true,
          inhibitedType: true,
          phage: true,
          host: true,
          spare1: true,
          spare2: true,
          spare3: true,
          length: true,
        },
        gsearchCondition:null,
        gSearch:{
          phageGenomeAccession: true,
          host: true,
          antiDenfenceSystemNumbers: true,
          spare1: true,
          spare2: true,
        },
        asearchCondition:null,
        aSearch:{
          phageId: true,
          systemNumbers: true,
          host: true,
          phage: true,
          size: true,
        },
        gdqueryParams: {
          pageNum: 1,
          pageSize: 10,
          phageGenomeAccession: null,
          systemFamily: null,
          proteinIds: null,
          protein: null,
          inhibitedType: null,
          phage: null,
          host: null,
          length: null,
          spare1: null,
          spare2: null,
          spare3: null,
          spare4: null,
          spare5: null,
          molecularWeight: null,
          hydrophobicity: null,
          isoelectricPoint: null,
        },
        adqueryParams: {
          pageNum: 1,
          pageSize: 10,
          phageId: null,
          systemName: null,
          proteinId: null,
          protein: null,
          eValue: null,
          scorePoint: null
        },

        pdList:[],
        adList:[],
        pdTotal:0,
        adTotal:0,
        pdTitle:null,
        adTitle:null,
        pdDialog:false,
        adDialog:false,
        currentIndex: 0,
        acurrentIndex: 0,
        gdindex : 1 ,
        adindex : 1 ,
        labelStyle: { 'width': '250px' ,'font-weight': '600','font-size': '50','color':'#000000' },
      };
    },

    created() {
      this.getList();
      this.getgList();
      this.getaList();
      clearInterval(this.timer)
      this.timer = null
      this.setTimer()
    },
    methods: {
      sortChange(column) {
        // 确保有排序字段和排序类型
        if (!column.prop || !column.order) return;

        // 获取字段名称和排序类型
        const fieldName = column.prop;
        const isDescending = column.order === 'descending';

        // 定义一个比较函数，根据字段类型和排序类型来比较两个值
        const compare = (a, b) => {
          const valA = a[fieldName];
          const valB = b[fieldName];

          // 尝试将值转换为数字进行比较
          const numA = Number(valA);
          const numB = Number(valB);

          // 如果两个值都是数字，则按数字比较
          if (!isNaN(numA) && !isNaN(numB)) {
            return isDescending ? numB - numA : numA - numB;
          }

          return isDescending ? valB.localeCompare(valA) : valA.localeCompare(valB);
        };
        this.antiList.sort(compare);
        this.genomeList.sort(compare)
      },





      /** 查询【请填写功能名称】列表 */
      async getList() {
        this.loading = true;
        await listPredicted(this.queryParams).then(response => {
          this.predictedList = response.rows;
          this.total = response.total;
          this.loading = false;
        });
      },
      getgList() {
        this.gloading = true;
        listGenome(this.gqueryParams).then(response => {
          this.genomeList = response.rows;
          this.gtotal = response.total;
          this.gloading = false;
        });
      },
      getaList() {
        this.aloading = true;
        listAnti(this.aqueryParams).then(response => {
          this.antiList = response.rows;
          this.atotal = response.total;
          this.aloading = false;
        })
      },
      //展示不同结果
      changeRadio() {
        if(this.radio == '1'){
          this.plshow = true ;
          this.pgshow = false ;
          this.xlshow = false ;
        }
        else if(this.radio == '2'){
          this.plshow = false ;
          this.pgshow = true ;
          this.xlshow = false ;
        }
        else if(this.radio == '3'){
          this.xlshow = true ;
          this.plshow = false ;
          this.pgshow = false  ;
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
      //predicted
      displayDetail(proteinId){
        let routeUrl = this.$router.resolve({
          //路径
          path: "/system/frontpdetail",
          query: {id: proteinId}
        });
        window.open(routeUrl.href, '_blank');
      },

      change(cankaowenxian){
        window.open('https://pubmed.ncbi.nlm.nih.gov/' + cankaowenxian)
      },
      //genome
      detail(phageGenomeAccession){
        let routeUrl = this.$router.resolve({
          //路径
          path: "/system/frontgenome",
          query: {phageGenomeAccession: phageGenomeAccession}
        });
        window.open(routeUrl.href, '_blank');
      },

      async displayGlist(phageGenomeAccession){
        this.gdqueryParams.proteinIds = phageGenomeAccession
        await listBasic(this.gdqueryParams).then(response => {
          console.log(response)
          this.pdList = response.rows;
          this.pdTotal = response.total;
          this.pdTitle = "Details of the proteins contained in the " + phageGenomeAccession + " genome:"
          this.pdDialog = true;
        })
      },
      async displayDGlist(){
        await listBasic(this.gdqueryParams).then(response => {
          console.log(response)
          this.pdList = response.rows;
          this.pdTotal = response.total;
          this.pdTitle = "Details of the proteins contained in the " + phageGenomeAccession + " genome:"
          this.pdDialog = true;
        })
      },
      async displayAlist(phageId){
        this.adqueryParams.phageId = phageId
        await listDetail(this.adqueryParams).then(response => {
          console.log(response)
          this.adList = response.rows;
          this.adTotal = response.total;
          this.adTitle = "Details of the proteins contained in the " + phageId + " genome:"
          this.adDialog = true;
        })
      },
      async displayDAlist(phageId){
        await listDetail(this.adqueryParams).then(response => {
          console.log(response)
          this.adList = response.rows;
          this.adTotal = response.total;
          this.adTitle = "Details of the proteins contained in the " + phageId + " genome:"
          this.adDialog = true;
        })
      },
      //模糊查询
      mhselect(){
        if(this.searchCondition != null && this.searchCondition != ""){
          mhselectListPredicted(this.searchCondition).then(response => {
            this.predictedList = response.rows;
            this.total = response.total;
            this.loading = false;
          });
        }else {
          listPredicted(this.queryParams).then(response => {
            this.predictedList = response.rows;
            this.total = response.total;
            this.loading = false;
          });
        }
      },
      gmhselect(){
        if(this.gsearchCondition != null && this.gsearchCondition != ""){
          mhselectListGenome(this.gsearchCondition).then(response => {
            this.genomeList = response.rows;
            this.gtotal = response.total;
            this.gloading = false;
          });
        }else {
          listGenome(this.gqueryParams).then(response => {
            this.genomeList = response.rows;
            this.gtotal = response.total;
            this.gloading = false;
          });
        }
      },
      amhselect(){
        if(this.asearchCondition != null && this.asearchCondition != ""){
          mhselectListAnti(this.asearchCondition).then(response => {
            this.antiList = response.rows;
            this.atotal = response.total;
            this.aloading = false;
          });
        }else {
          listAnti(this.aqueryParams).then(response => {
            this.antiList = response.rows;
            this.atotal = response.total;
            this.aloading = false;
          })
        }
      },
      gsortChange({ column, prop, order }) {
        if (!order) {
          this.$refs.table.sort("spare1", "ascending");
        }
      },
      asortChange({ column, prop, order }) {
        if (!order) {

          this.$refs.table.sort("systemNumbers", "ascending");
        }
      },
    },





  };
</script>
<style scoped>
.my-custom-dialog .el-dialog__footer {
  text-align: left; /* 重置默认的居中对齐 */
  padding: 0; /* 移除默认的内边距，因为我们将在自定义 footer 中设置 */
}

.dialog-footer {
  display: flex;
  justify-content: space-between; /* 使按钮在水平方向上两端对齐 */
  align-items: center; /* 使按钮在垂直方向上居中对齐 */
  height: 100%; /* 尝试使 footer 容器填满模态框的剩余高度，但可能需要根据实际情况调整 */
  box-sizing: border-box; /* 包含 padding 和 border 在内的高度计算 */
  padding: 20px; /* 根据需要设置内边距 */
  background-color: #fff; /* 根据需要设置背景颜色，确保与模态框其他部分一致 */
}

.left-button,
.right-button {
  /* 这两个类在此示例中可能并不需要额外的样式，因为 flex 布局已经完成了对齐工作 */
}

/* 如果模态框内容高度较小，导致 footer 并未填满剩余空间，可以尝试以下方法： */
/* 为 .el-dialog__body 设置一个最小高度，或者为 .el-dialog 设置一个固定高度，以确保 footer 有足够的空间进行垂直居中 */
/* 但请注意，这可能会影响到模态框在不同屏幕尺寸下的响应式布局 */
</style>
