<template>
  <div style="width: 100%;margin: 0px;padding: 0px;font-family: 'Times New Roman'">
    <div style="width: 80%;margin: 30px 10%;text-align: center">
    </div>
    <div style="width: 80%;margin: 0 10%">
      <el-descriptions :title="title" :column="1"  border>
        <el-descriptions-item>
          <template slot="label">
            <i class="el-icon-user-solid"></i>
            ID
          </template>
          {{genomeDetail.proteinIds}}
        </el-descriptions-item>
        <el-descriptions-item>
          <template slot="label">
            <i class="el-icon-s-home"></i>
            System Family
          </template>
          {{genomeDetail.systemFamily}}
        </el-descriptions-item>
        <el-descriptions-item>
          <template slot="label">
            <i class="el-icon-s-help"></i>
            Protein
          </template>
          {{genomeDetail.protein}}
        </el-descriptions-item>
        <el-descriptions-item>
          <template slot="label">
            <i class="el-icon-menu"></i>
            Inhibited Type
          </template>
          {{genomeDetail.inhibitedType}}
        </el-descriptions-item>
        <el-descriptions-item>
          <template slot="label">
            <i class="el-icon-s-cooperation"></i>
            Phage
          </template>
          {{genomeDetail.phage}}
        </el-descriptions-item>
        <el-descriptions-item>
          <template slot="label">
            <i class="el-icon-s-platform"></i>
            Host
          </template>
          {{genomeDetail.host}}
        </el-descriptions-item>
        <el-descriptions-item>
          <template slot="label">
            <i class="el-icon-s-open"></i>
            Length
          </template>
          {{genomeDetail.length}}
        </el-descriptions-item>
      </el-descriptions>
    </div>
  </div>
</template>

<script>

  import { getBasic} from "@/api/system/basic";
  export default {
    name: "index",
    data() {
      return {
        genomeDetail : {},
        title:'',
      };
    },
    created() {
      this.displayDetail()
    },
    methods:{
      displayDetail(){
        getBasic(this.$route.query.basicId).then(response => {
          this.genomeDetail = response.data
          this.title = 'Detail(' + response.data.proteinIds +')'
        });
      },
    }
  };
</script>
