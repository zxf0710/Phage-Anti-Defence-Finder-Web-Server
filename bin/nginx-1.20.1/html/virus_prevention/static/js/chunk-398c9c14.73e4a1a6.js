(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-398c9c14"],{"5e37":function(e,t,a){"use strict";a.d(t,"d",(function(){return l})),a.d(t,"c",(function(){return r})),a.d(t,"a",(function(){return i})),a.d(t,"e",(function(){return s})),a.d(t,"b",(function(){return o}));var n=a("b775");function l(e){return Object(n["a"])({url:"/system/basic/list",method:"get",params:e})}function r(e){return Object(n["a"])({url:"/system/basic/"+e,method:"get"})}function i(e){return Object(n["a"])({url:"/system/basic",method:"post",data:e})}function s(e){return Object(n["a"])({url:"/system/basic",method:"put",data:e})}function o(e){return Object(n["a"])({url:"/system/basic/"+e,method:"delete"})}},b60c:function(e,t,a){"use strict";a.r(t);var n=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{staticClass:"app-container"},[a("div",{staticStyle:{width:"80%",margin:"10px 10%","font-size":"larger","font-weight":"bolder"}},[e._v(" "+e._s(e.title)+" ")]),a("div",{staticStyle:{width:"80%",margin:"0 10%"}},[a("el-table",{directives:[{name:"loading",rawName:"v-loading",value:e.loading,expression:"loading"}],attrs:{data:e.basicList,stripe:"","default-sort":{prop:"date",order:"descending"}}},[e._e(),a("el-table-column",{attrs:{sortable:"",label:"System Family",align:"center",prop:"systemFamily"}}),a("el-table-column",{attrs:{sortable:"",label:"ID",align:"center",prop:"proteinIds"},scopedSlots:e._u([{key:"default",fn:function(t){return[a("el-button",{attrs:{type:"text"},on:{click:function(a){return e.displaygDetail(t.row.basicId)}}},[e._v(e._s(t.row.proteinIds))])]}}])}),a("el-table-column",{attrs:{sortable:"",label:"Protein",align:"center",prop:"protein"}}),a("el-table-column",{attrs:{sortable:"",label:"Inhibited Type",align:"center",prop:"inhibitedType"}}),a("el-table-column",{attrs:{sortable:"",label:"Phage",align:"center",prop:"phage"}}),a("el-table-column",{attrs:{sortable:"",label:"Host",align:"center",prop:"host"}}),a("el-table-column",{attrs:{sortable:"",label:"Length",align:"center",prop:"length"}})],1),a("pagination",{directives:[{name:"show",rawName:"v-show",value:e.total>0,expression:"total>0"}],attrs:{total:e.total,page:e.queryParams.pageNum,limit:e.queryParams.pageSize,"page-sizes":[10,25,50,100]},on:{"update:page":function(t){return e.$set(e.queryParams,"pageNum",t)},"update:limit":function(t){return e.$set(e.queryParams,"pageSize",t)},pagination:e.getList}})],1)])},l=[],r=a("5e37"),i={name:"index",data:function(){return{loading:!0,total:0,basicList:[],queryParams:{pageNum:1,pageSize:10,phageGenomeAccession:null,systemFamily:null,proteinIds:null,protein:null,inhibitedType:null,phage:null,host:null,length:null,spare1:null,spare2:null,spare3:null,spare4:null,spare5:null},title:""}},created:function(){this.getList()},methods:{getList:function(){var e=this;this.loading=!0,this.title=this.$route.query.phageGenomeAccession,this.queryParams.phageGenomeAccession=this.$route.query.phageGenomeAccession,Object(r["d"])(this.queryParams).then((function(t){e.basicList=t.rows,e.total=t.total,e.loading=!1}))},displaygDetail:function(e){var t=this.$router.resolve({path:"/system/frontgdetail",query:{basicId:e}});window.open(t.href,"_blank")}}},s=i,o=a("2877"),u=Object(o["a"])(s,n,l,!1,null,null,null);t["default"]=u.exports}}]);