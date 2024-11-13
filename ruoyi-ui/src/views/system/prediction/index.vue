<template>
    <div style="width: 100%;font-family: 'Times New Roman'">
      <div style="margin: 0 0 20px 0; text-align: center; font-size: xx-large ; font-weight: bolder">
        <el-radio v-model="radio" label="1">Protein Sequence </el-radio>
        <el-radio v-model="radio" label="2">Nucleotide Sequence</el-radio>
      </div>
      <div v-show="pshow" style="width: 50%;margin: 10px 25%" v-loading="loading"
           element-loading-text="Matching,Please wait..."
           element-loading-spinner="el-icon-loading"
           >
        <span>Enter email account number</span><br><br>
        <el-input v-model="mail" clearable placeholder="Please enter the email account number to which you receive it"></el-input>
        <div style="width: 60%;margin: 30px 20%">
          <el-upload
            class="upload-demo"
            accept=".fasta"
            :limit="1"
            drag
            action="#"
            style="margin-left: 20px"
            :auto-upload="false"
            :file-list="sequenceFile"
            :on-exceed="handleExceed"
            :on-change="handleChange"
          >
            <i class="el-icon-upload"></i>
            <div class="el-upload__text">Please drag the file here, or<em>Click Upload</em>
              <div class="el-upload__tip" slot="tip" style="color: red">Only one fasta file can be uploaded</div>
            </div>
          </el-upload>
        </div>
        <div style="margin-left: 5%; text-align: center">
          <el-button type="primary" icon="el-icon-help" @click="matchSequence">matching</el-button>
        </div>
      </div>


      <div v-show="gshow" style="width: 50%;margin: 10px 25%" v-loading="gloading"
           element-loading-text="Matching,Please wait..."
           element-loading-spinner="el-icon-loading"
      >
        <span>Enter email account number</span><br><br>
        <el-input v-model="gmail" clearable placeholder="Please enter the email account number to which you receive it"></el-input>
        <div style="width: 60%;margin: 30px 20%">
          <el-upload
            class="upload-demo"
            accept=".fasta"
            :limit="1"
            drag
            action="#"
            :auto-upload="false"
            :file-list="genomeFile"
            :on-exceed="ghandleExceed"
            :on-change="ghandleChange"
          >
            <i class="el-icon-upload"></i>
            <div class="el-upload__text">Please drag the file here, or<em>Click Upload</em>
              <div class="el-upload__tip" slot="tip" style="color: red">Only one fasta file can be uploaded</div>
            </div>
          </el-upload>
        </div>
        <div style="margin-left: 5%; text-align: center">
          <el-button type="primary" icon="el-icon-help" @click="matchGenome">matching</el-button>
        </div>
      </div>
    </div>
</template>

<script>
import {upload} from "@/api/system/sequence";
import {gupload} from "@/api/system/list";
export default {
        name: "index",
        data() {
          return {
            //蛋白序列
            mail:'',
            sequenceFile: [],
            isupload:true,
            loading:false,
            radio : '1',
            pshow : true ,
            gshow : false ,
            //定时器
            timer: null,
            //基因组
            gmail:'',
            genomeFile: [],
            gisupload:true,
            gloading:false,
          };
        },
        created() {
          clearInterval(this.timer)
          this.timer = null
          this.setTimer()
        },
        methods: {
          handleExceed(){
            this.$message({
              showClose: true,
              message: 'You are limited to one fasta file at a time, if you want to upload additional files, remove the current file first!',
              type: 'warning'
            });
          },
          handleChange(file, fileList) { //文件数量改变
            this.sequenceFile = fileList;
          },
          matchSequence(){
            this.loading = true ;
            let reg = /^\w+((-\w+)|(\.\w+))*@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/;
            if(this.mail == ''){
              this.$message({
                showClose: true,
                message: 'The email account cannot be empty!',
                type: 'warning'
              });
            }else if(!reg.test(this.mail)){
              this.$message({
                showClose: true,
                message: 'The email account is incorrect!',
                type: 'warning'
              });
            }else if(reg.test(this.mail)){
              if(this.sequenceFile.length == 0 ){
                this.$message({
                  showClose: true,
                  message: 'No file selected!',
                  type: 'warning'
                });
              }else if(this.sequenceFile.length == 1){
                var formData = new FormData();
                formData.append("mail",this.mail)
                formData.append("inputFile",this.sequenceFile[0].raw)
                upload(formData).then(response => {
                  if(response == 1){
                    this.loading = false,
                    this.$message({
                      showClose: true,
                      message: 'The match is successful, the matching result has been sent to your mailbox, please pay attention to check!',
                      type: 'success'
                    });
                    this.mail = '';
                    this.sequenceFile = [];
                    this.isupload = true ;
                  }
                }).catch(e => {
                  console.log(e)
                })
              }else{
                this.$message({
                  showClose: true,
                  message: '出大问题了!',
                  type: 'error'
                });
              }
            }
          },
          //展示不同结果
          changeRadio() {
            if(this.radio == '1'){
              this.pshow = true ;
              this.gshow = false ;
            }
            else if(this.radio == '2'){
              this.pshow = false ;
              this.gshow = true ;
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

          ghandleExceed(){
            this.$message({
              showClose: true,
              message: 'You are limited to one fasta file at a time, if you want to upload additional files, remove the current file first!',
              type: 'warning'
            });
          },
          ghandleChange(file, fileList) { //文件数量改变
            this.genomeFile = fileList;
          },
          matchGenome(){
            this.gloading = true ;
            let reg = /^\w+((-\w+)|(\.\w+))*@[A-Za-z0-9]+((\.|-)[A-Za-z0-9]+)*\.[A-Za-z0-9]+$/;
            if(this.gmail == ''){
              this.$message({
                showClose: true,
                message: 'The email account cannot be empty!',
                type: 'warning'
              });
            }else if(!reg.test(this.gmail)){
              this.$message({
                showClose: true,
                message: 'The email account is incorrect!',
                type: 'warning'
              });
            }else if(reg.test(this.gmail)){
              if(this.genomeFile.length == 0 ){
                this.$message({
                  showClose: true,
                  message: 'No file selected!',
                  type: 'warning'
                });
              }else if(this.genomeFile.length == 1){
                var formData = new FormData();
                formData.append("mail",this.gmail)
                formData.append("inputFile",this.genomeFile[0].raw)
                gupload(formData).then(response => {
                  if(response == 1){
                    this.gloading = false,
                      this.$message({
                        showClose: true,
                        message: 'The match is successful, the matching result has been sent to your mailbox, please pay attention to check!',
                        type: 'success'
                      });
                    this.gmail = '';
                    this.genomeFile = [];
                    this.gisupload = true ;
                  }
                }).catch(e => {
                  console.log(e)
                })
              }else{
                this.$message({
                  showClose: true,
                  message: '出大问题了!',
                  type: 'error'
                });
              }
            }
          },
        },
        destroyed: function () {
          // 每次离开当前界面时，清除定时器
          clearInterval(this.timer)
          this.timer = null
        },
    }
</script>

<style scoped>
.upload-demo ::v-deep {
  margin-left: 110px !important;
}
</style>
