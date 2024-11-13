<template>
  <div class="app-container" style="font-family: 'Times New Roman'">
    <div style="width: 80%; margin: 10px 10%;font-size: larger ; font-weight: bolder">
        {{title}}
    </div>
    <div style="width: 80%;margin: 0 10%">
      <el-table v-loading="loading" :data="basicList" stripe :default-sort = "{prop: 'date', order: 'descending'}">
        <el-table-column v-if="false" label="basicId" align="center" prop="basicId" />
        <el-table-column sortable label="System Family" align="center" prop="systemFamily" />
        <el-table-column sortable label="ID"  align="center" prop="proteinIds">
          <template slot-scope="scope">
            <el-button
              type="text"
              @click="displaygDetail(scope.row.basicId)"
            >{{scope.row.proteinIds}}</el-button>
          </template>
        </el-table-column>
        <el-table-column sortable label="Protein" align="center" prop="protein" />
        <el-table-column sortable label="Inhibited Type" align="center" prop="inhibitedType" />
        <el-table-column sortable label="Phage" align="center" prop="phage" />
        <el-table-column sortable label="Host" align="center" prop="host" />
        <el-table-column sortable label="Length" align="center" prop="length" />
      </el-table>
      <pagination
        v-show="total>0"
        :total="total"
        :page.sync="queryParams.pageNum"
        :limit.sync="queryParams.pageSize"
        :page-sizes="[10,25,50,100]"
        @pagination="getList"
      />
    </div>
  </div>
</template>

<script>

  import { listBasic} from "@/api/system/basic";

  export default {
    name: "index",
    data() {
      return {
        // 遮罩层
        loading: true,
        // 总条数
        total: 0,
        // 【请填写功能名称】表格数据
        basicList: [],
        // 查询参数
        queryParams: {
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
          spare5: null
        },
        title:'',
      }
    },
    created() {
      this.getList();
    },
    methods: {
      /** 查询【请填写功能名称】列表 */
      getList() {
        this.loading = true;
        this.title = this.$route.query.phageGenomeAccession ;
        this.queryParams.phageGenomeAccession = this.$route.query.phageGenomeAccession;
        listBasic(this.queryParams).then(response => {
          this.basicList = response.rows;
          this.total = response.total;
          this.loading = false;
        });
      },
      displaygDetail(basicId){
        let routeUrl = this.$router.resolve({
          //路径
          path: "/system/frontgdetail",
          query: {basicId: basicId}
        });
        window.open(routeUrl.href, '_blank');
      }
    }
  };
</script>
