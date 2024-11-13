<template>
  <div style="width: 100%;margin: 0px;padding: 0px;font-family: 'Times New Roman'">
    <div style="width: 80%;margin: 30px 10%;text-align: center">

    </div>
    <div style="width: 80%;margin: 0 10%">

      <el-descriptions :title="title" :column="1"  border>
        <el-descriptions-item  :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-user-solid"></i>
            ID
          </template>
          {{verifiedDetail.proteinIds}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-s-home"></i>
            System Family
          </template>
          {{verifiedDetail.systemFamily}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-s-help"></i>
            Protein
          </template>
          {{verifiedDetail.protein}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-menu"></i>
            Inhibited Type
          </template>
          {{verifiedDetail.inhibitedType}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-s-cooperation"></i>
            Phage
          </template>
          {{verifiedDetail.phage}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-s-platform"></i>
            Host
          </template>
          {{verifiedDetail.host}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-s-order"></i>
            Sequence
          </template>
          {{verifiedDetail.sequence}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-s-comment"></i>
            Molecular mechanisms
          </template>
          {{verifiedDetail.spare1}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-s-data"></i>
            Molecular weight
          </template>
          {{verifiedDetail.spare2}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-s-opportunity"></i>
            Hydrophobicity
          </template>
          {{verifiedDetail.spare3}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-s-shop"></i>
            Isoelectric point
          </template>
          {{verifiedDetail.spare4}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-question"></i>
            Inhibited/Modified proteins
          </template>
          {{verifiedDetail.spare5}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-info"></i>
            Protein accession
          </template>
          {{verifiedDetail.proteinAccession}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-s-open"></i>
            Length
          </template>
          {{verifiedDetail.length}}
        </el-descriptions-item>
        <el-descriptions-item :labelStyle='labelStyle'>
          <template slot="label">
            <i class="el-icon-s-management"></i>
            PubmedId
          </template>
          <template>
            <el-button
              type="text"
              @click="change(verifiedDetail.pubmedId)"
            >{{verifiedDetail.pubmedId}}</el-button>
          </template>
        </el-descriptions-item>
      </el-descriptions>
    </div>

  </div>
</template>

<script>
import { getVdetailByProteinIds } from "@/api/system/vdetail";

export default {
  name: "frontvdetail",
  data(){
    return{
      verifiedDetail:{},
      title:'',
      labelStyle: { 'width': '250px' ,'font-weight': '600','font-size': '50','color':'#000000' }
    }

  },
  created() {
    this.displayDetail()
  },
  methods:{
    displayDetail(){
      this.title = 'Detail(' + this.$route.query.id +')'
      getVdetailByProteinIds(this.$route.query.id)
        .then(response => {
          this.verifiedDetail = response.data
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
