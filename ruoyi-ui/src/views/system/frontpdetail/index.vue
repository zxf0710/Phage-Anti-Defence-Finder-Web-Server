<template>
  <div style="width: 100%;margin: 0px;padding: 0px;font-family: 'Times New Roman'">
    <div style="width: 80%;margin: 30px 10%;text-align: center">
    </div>
    <div style="width: 80%;margin: 0 10%">
      <el-descriptions :title="title" :column="1"  border>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-user-solid"></i>
            ID
          </template>
          {{predictedDetail.proteinIds}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-s-home"></i>
            System Family
          </template>
          {{predictedDetail.systemFamily}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-s-help"></i>
            Protein
          </template>
          {{predictedDetail.protein}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-menu"></i>
            Inhibited Type
          </template>
          {{predictedDetail.inhibitedType}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-s-cooperation"></i>
            Phage
          </template>
          {{predictedDetail.phage}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-s-platform"></i>
            Host
          </template>
          {{predictedDetail.host}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-s-order"></i>
            Sequence
          </template>
          {{predictedDetail.sequence}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-s-open"></i>
            Length
          </template>
          {{predictedDetail.length}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-s-management"></i>
            HMM-E-Value
          </template>
          {{predictedDetail.hmmEValue}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-s-ticket"></i>
            HMM-Score
          </template>
          {{predictedDetail.hmmScore}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-s-comment"></i>
            Molecular mechanisms
          </template>
          {{predictedDetail.spare1}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-question"></i>
            Inhibited/Modified proteins
          </template>
          {{predictedDetail.spare2}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-s-data"></i>
            Molecular weight
          </template>
          {{predictedDetail.spare3}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-s-opportunity"></i>
            Hydrophobicity
          </template>
          {{predictedDetail.spare4}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-s-shop"></i>
            Isoelectric point
          </template>
          {{predictedDetail.spare5}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-info"></i>
            Protein accession
          </template>
          {{predictedDetail.proteinAccession}}
        </el-descriptions-item>
      </el-descriptions>
    </div>

  </div>
</template>

<script>
import {getPdetailByProteinIds} from "@/api/system/pdetail";

export default {
  name: "frontpdetail",
  data(){
    return{
      predictedDetail:{},
      title:'',
      labelStyle: { 'width': '250px' ,'font-weight': '600','font-size': '50','color':'#000000' },
    }

  },
  created() {
    this.displayDetail()
  },
  methods:{
    displayDetail(){
      this.title = 'Detail(' + this.$route.query.id +')'
      getPdetailByProteinIds(this.$route.query.id)
        .then(response => {
          console.log(response.data)
          this.predictedDetail = response.data
        })
    },
    change(cankaowenxian){
      window.open('https://pubmed.ncbi.nlm.nih.gov/' + cankaowenxian)
    },
  }
}
</script>

<style scoped>

</style>
