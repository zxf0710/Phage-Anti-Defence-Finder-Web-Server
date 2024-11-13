(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-1978855d"],{"6a6d":function(e,t,n){"use strict";n.r(t);var a=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{staticClass:"app-container"},[n("el-form",{directives:[{name:"show",rawName:"v-show",value:e.showSearch,expression:"showSearch"}],ref:"queryForm",attrs:{model:e.queryParams,size:"small",inline:!0,"label-width":"68px"}},[n("el-form-item",{attrs:{label:"族系",prop:"systemFamily"}},[n("el-input",{attrs:{placeholder:"请输入族系",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.systemFamily,callback:function(t){e.$set(e.queryParams,"systemFamily",t)},expression:"queryParams.systemFamily"}})],1),n("el-form-item",{attrs:{label:"ID",prop:"proteinIds"}},[n("el-input",{attrs:{placeholder:"请输入ID",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.proteinIds,callback:function(t){e.$set(e.queryParams,"proteinIds",t)},expression:"queryParams.proteinIds"}})],1),n("el-form-item",{attrs:{label:"蛋白质",prop:"protein"}},[n("el-input",{attrs:{placeholder:"请输入蛋白质",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.protein,callback:function(t){e.$set(e.queryParams,"protein",t)},expression:"queryParams.protein"}})],1),n("el-form-item",{attrs:{label:"噬菌体",prop:"phage"}},[n("el-input",{attrs:{placeholder:"请输入噬菌体",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.phage,callback:function(t){e.$set(e.queryParams,"phage",t)},expression:"queryParams.phage"}})],1),n("el-form-item",{attrs:{label:"宿主",prop:"host"}},[n("el-input",{attrs:{placeholder:"请输入宿主",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.host,callback:function(t){e.$set(e.queryParams,"host",t)},expression:"queryParams.host"}})],1),n("el-form-item",{attrs:{label:"长度",prop:"length"}},[n("el-input",{attrs:{placeholder:"请输入长度",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.length,callback:function(t){e.$set(e.queryParams,"length",t)},expression:"queryParams.length"}})],1),n("el-form-item",{attrs:{label:"参考文献",prop:"cankaowenxian"}},[n("el-input",{attrs:{placeholder:"请输入参考文献",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.cankaowenxian,callback:function(t){e.$set(e.queryParams,"cankaowenxian",t)},expression:"queryParams.cankaowenxian"}})],1),n("el-form-item",[n("el-button",{attrs:{type:"primary",icon:"el-icon-search",size:"mini"},on:{click:e.handleQuery}},[e._v("搜索")]),n("el-button",{attrs:{icon:"el-icon-refresh",size:"mini"},on:{click:e.resetQuery}},[e._v("重置")])],1)],1),n("el-row",{staticClass:"mb8",attrs:{gutter:10}},[n("el-col",{attrs:{span:1.5}},[n("el-button",{directives:[{name:"hasPermi",rawName:"v-hasPermi",value:["system:predicted:add"],expression:"['system:predicted:add']"}],attrs:{type:"primary",plain:"",icon:"el-icon-plus",size:"mini"},on:{click:e.handleAdd}},[e._v("新增")])],1),n("el-col",{attrs:{span:1.5}},[n("el-button",{directives:[{name:"hasPermi",rawName:"v-hasPermi",value:["system:predicted:edit"],expression:"['system:predicted:edit']"}],attrs:{type:"success",plain:"",icon:"el-icon-edit",size:"mini",disabled:e.single},on:{click:e.handleUpdate}},[e._v("修改")])],1),n("el-col",{attrs:{span:1.5}},[n("el-button",{directives:[{name:"hasPermi",rawName:"v-hasPermi",value:["system:predicted:remove"],expression:"['system:predicted:remove']"}],attrs:{type:"danger",plain:"",icon:"el-icon-delete",size:"mini",disabled:e.multiple},on:{click:e.handleDelete}},[e._v("删除")])],1),n("el-col",{attrs:{span:1.5}},[n("el-button",{directives:[{name:"hasPermi",rawName:"v-hasPermi",value:["system:predicted:export"],expression:"['system:predicted:export']"}],attrs:{type:"warning",plain:"",icon:"el-icon-download",size:"mini"},on:{click:e.handleExport}},[e._v("导出")])],1),n("right-toolbar",{attrs:{showSearch:e.showSearch},on:{"update:showSearch":function(t){e.showSearch=t},"update:show-search":function(t){e.showSearch=t},queryTable:e.getList}})],1),n("el-table",{directives:[{name:"loading",rawName:"v-loading",value:e.loading,expression:"loading"}],attrs:{data:e.predictedList},on:{"selection-change":e.handleSelectionChange}},[n("el-table-column",{attrs:{type:"selection",width:"55",align:"center"}}),e._e(),n("el-table-column",{attrs:{label:"族系",align:"center",prop:"systemFamily"}}),n("el-table-column",{attrs:{label:"ID",align:"center",prop:"proteinIds"}}),n("el-table-column",{attrs:{label:"蛋白质",align:"center",prop:"protein"}}),n("el-table-column",{attrs:{label:"抑制类型",align:"center",prop:"inhibitedType"}}),n("el-table-column",{attrs:{label:"噬菌体",align:"center",prop:"phage"}}),n("el-table-column",{attrs:{label:"宿主",align:"center",prop:"host"}}),n("el-table-column",{attrs:{label:"长度",align:"center",prop:"length"}}),n("el-table-column",{attrs:{label:"参考文献",align:"center",prop:"cankaowenxian"}}),n("el-table-column",{attrs:{label:"操作",align:"center","class-name":"small-padding fixed-width"},scopedSlots:e._u([{key:"default",fn:function(t){return[n("el-button",{directives:[{name:"hasPermi",rawName:"v-hasPermi",value:["system:predicted:edit"],expression:"['system:predicted:edit']"}],attrs:{size:"mini",type:"text",icon:"el-icon-edit"},on:{click:function(n){return e.handleUpdate(t.row)}}},[e._v("修改")]),n("el-button",{directives:[{name:"hasPermi",rawName:"v-hasPermi",value:["system:predicted:remove"],expression:"['system:predicted:remove']"}],attrs:{size:"mini",type:"text",icon:"el-icon-delete"},on:{click:function(n){return e.handleDelete(t.row)}}},[e._v("删除")])]}}])})],1),n("pagination",{directives:[{name:"show",rawName:"v-show",value:e.total>0,expression:"total>0"}],attrs:{total:e.total,page:e.queryParams.pageNum,limit:e.queryParams.pageSize},on:{"update:page":function(t){return e.$set(e.queryParams,"pageNum",t)},"update:limit":function(t){return e.$set(e.queryParams,"pageSize",t)},pagination:e.getList}}),n("el-dialog",{attrs:{title:e.title,visible:e.open,width:"500px","append-to-body":""},on:{"update:visible":function(t){e.open=t}}},[n("el-form",{ref:"form",attrs:{model:e.form,rules:e.rules,"label-width":"80px"}},[n("el-form-item",{attrs:{label:"族系",prop:"systemFamily"}},[n("el-input",{attrs:{placeholder:"请输入族系"},model:{value:e.form.systemFamily,callback:function(t){e.$set(e.form,"systemFamily",t)},expression:"form.systemFamily"}})],1),n("el-form-item",{attrs:{label:"ID",prop:"proteinIds"}},[n("el-input",{attrs:{placeholder:"请输入ID"},model:{value:e.form.proteinIds,callback:function(t){e.$set(e.form,"proteinIds",t)},expression:"form.proteinIds"}})],1),n("el-form-item",{attrs:{label:"蛋白质",prop:"protein"}},[n("el-input",{attrs:{placeholder:"请输入蛋白质"},model:{value:e.form.protein,callback:function(t){e.$set(e.form,"protein",t)},expression:"form.protein"}})],1),n("el-form-item",{attrs:{label:"噬菌体",prop:"phage"}},[n("el-input",{attrs:{placeholder:"请输入噬菌体"},model:{value:e.form.phage,callback:function(t){e.$set(e.form,"phage",t)},expression:"form.phage"}})],1),n("el-form-item",{attrs:{label:"宿主",prop:"host"}},[n("el-input",{attrs:{placeholder:"请输入宿主"},model:{value:e.form.host,callback:function(t){e.$set(e.form,"host",t)},expression:"form.host"}})],1),n("el-form-item",{attrs:{label:"长度",prop:"length"}},[n("el-input",{attrs:{placeholder:"请输入长度"},model:{value:e.form.length,callback:function(t){e.$set(e.form,"length",t)},expression:"form.length"}})],1),n("el-form-item",{attrs:{label:"参考文献",prop:"cankaowenxian"}},[n("el-input",{attrs:{placeholder:"请输入参考文献"},model:{value:e.form.cankaowenxian,callback:function(t){e.$set(e.form,"cankaowenxian",t)},expression:"form.cankaowenxian"}})],1)],1),n("div",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[n("el-button",{attrs:{type:"primary"},on:{click:e.submitForm}},[e._v("确 定")]),n("el-button",{on:{click:e.cancel}},[e._v("取 消")])],1)],1)],1)},r=[],l=n("5530"),i=(n("d81d"),n("e684")),s={name:"Predicted",data:function(){return{loading:!0,ids:[],single:!0,multiple:!0,showSearch:!0,total:0,predictedList:[],title:"",open:!1,queryParams:{pageNum:1,pageSize:10,systemFamily:null,proteinIds:null,protein:null,inhibitedType:null,phage:null,host:null,length:null,cankaowenxian:null,spare1:null,spare2:null,spare3:null,spare4:null,spare5:null},form:{},rules:{}}},created:function(){this.getList()},methods:{getList:function(){var e=this;this.loading=!0,Object(i["d"])(this.queryParams).then((function(t){e.predictedList=t.rows,e.total=t.total,e.loading=!1}))},cancel:function(){this.open=!1,this.reset()},reset:function(){this.form={predictedId:null,systemFamily:null,proteinIds:null,protein:null,inhibitedType:null,phage:null,host:null,length:null,cankaowenxian:null,spare1:null,spare2:null,spare3:null,spare4:null,spare5:null},this.resetForm("form")},handleQuery:function(){this.queryParams.pageNum=1,this.getList()},resetQuery:function(){this.resetForm("queryForm"),this.handleQuery()},handleSelectionChange:function(e){this.ids=e.map((function(e){return e.predictedId})),this.single=1!==e.length,this.multiple=!e.length},handleAdd:function(){this.reset(),this.open=!0,this.title="添加【请填写功能名称】"},handleUpdate:function(e){var t=this;this.reset();var n=e.predictedId||this.ids;Object(i["c"])(n).then((function(e){t.form=e.data,t.open=!0,t.title="修改【请填写功能名称】"}))},submitForm:function(){var e=this;this.$refs["form"].validate((function(t){t&&(null!=e.form.predictedId?Object(i["h"])(e.form).then((function(t){e.$modal.msgSuccess("修改成功"),e.open=!1,e.getList()})):Object(i["a"])(e.form).then((function(t){e.$modal.msgSuccess("新增成功"),e.open=!1,e.getList()})))}))},handleDelete:function(e){var t=this,n=e.predictedId||this.ids;this.$modal.confirm('是否确认删除【请填写功能名称】编号为"'+n+'"的数据项？').then((function(){return Object(i["b"])(n)})).then((function(){t.getList(),t.$modal.msgSuccess("删除成功")})).catch((function(){}))},handleExport:function(){this.download("system/predicted/export",Object(l["a"])({},this.queryParams),"predicted_".concat((new Date).getTime(),".xlsx"))}}},o=s,c=n("2877"),u=Object(c["a"])(o,a,r,!1,null,null,null);t["default"]=u.exports},e684:function(e,t,n){"use strict";n.d(t,"d",(function(){return r})),n.d(t,"c",(function(){return l})),n.d(t,"a",(function(){return i})),n.d(t,"h",(function(){return s})),n.d(t,"b",(function(){return o})),n.d(t,"f",(function(){return c})),n.d(t,"g",(function(){return u})),n.d(t,"e",(function(){return p}));var a=n("b775");function r(e){return Object(a["a"])({url:"/system/predicted/list",method:"get",params:e})}function l(e){return Object(a["a"])({url:"/system/predicted/"+e,method:"get"})}function i(e){return Object(a["a"])({url:"/system/predicted",method:"post",data:e})}function s(e){return Object(a["a"])({url:"/system/predicted",method:"put",data:e})}function o(e){return Object(a["a"])({url:"/system/predicted/"+e,method:"delete"})}function c(e){return Object(a["a"])({url:"/system/predicted/selectlist",method:"get",params:e})}function u(e){return Object(a["a"])({url:"/system/predicted/sortlist",method:"get",params:e})}function p(e){return Object(a["a"])({url:"/system/predicted/mhselect/"+e,method:"get"})}}}]);