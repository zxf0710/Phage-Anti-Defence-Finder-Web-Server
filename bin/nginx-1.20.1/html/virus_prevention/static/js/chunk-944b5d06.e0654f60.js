(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-944b5d06"],{"76fd":function(e,t,l){"use strict";l.d(t,"e",(function(){return r})),l.d(t,"c",(function(){return n})),l.d(t,"a",(function(){return i})),l.d(t,"f",(function(){return s})),l.d(t,"b",(function(){return o})),l.d(t,"d",(function(){return u}));var a=l("b775");function r(e){return Object(a["a"])({url:"/system/pdetail/list",method:"get",params:e})}function n(e){return Object(a["a"])({url:"/system/pdetail/"+e,method:"get"})}function i(e){return Object(a["a"])({url:"/system/pdetail",method:"post",data:e})}function s(e){return Object(a["a"])({url:"/system/pdetail",method:"put",data:e})}function o(e){return Object(a["a"])({url:"/system/pdetail/"+e,method:"delete"})}function u(e){return Object(a["a"])({url:"/system/pdetail/"+e,method:"post"})}},ecf1:function(e,t,l){"use strict";l.r(t);var a=function(){var e=this,t=e.$createElement,l=e._self._c||t;return l("div",{staticClass:"app-container"},[l("el-form",{directives:[{name:"show",rawName:"v-show",value:e.showSearch,expression:"showSearch"}],ref:"queryForm",attrs:{model:e.queryParams,size:"small",inline:!0,"label-width":"68px"}},[l("el-form-item",{attrs:{label:"系族",prop:"systemFamily"}},[l("el-input",{attrs:{placeholder:"请输入系族",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.systemFamily,callback:function(t){e.$set(e.queryParams,"systemFamily",t)},expression:"queryParams.systemFamily"}})],1),l("el-form-item",{attrs:{label:"ID",prop:"proteinIds"}},[l("el-input",{attrs:{placeholder:"请输入ID",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.proteinIds,callback:function(t){e.$set(e.queryParams,"proteinIds",t)},expression:"queryParams.proteinIds"}})],1),l("el-form-item",{attrs:{label:"蛋白质",prop:"protein"}},[l("el-input",{attrs:{placeholder:"请输入蛋白质",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.protein,callback:function(t){e.$set(e.queryParams,"protein",t)},expression:"queryParams.protein"}})],1),l("el-form-item",{attrs:{label:"噬菌体",prop:"phage"}},[l("el-input",{attrs:{placeholder:"请输入噬菌体",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.phage,callback:function(t){e.$set(e.queryParams,"phage",t)},expression:"queryParams.phage"}})],1),l("el-form-item",{attrs:{label:"宿主",prop:"host"}},[l("el-input",{attrs:{placeholder:"请输入宿主",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.host,callback:function(t){e.$set(e.queryParams,"host",t)},expression:"queryParams.host"}})],1),l("el-form-item",{attrs:{label:"蛋白序列",prop:"sequence"}},[l("el-input",{attrs:{placeholder:"请输入蛋白序列",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.sequence,callback:function(t){e.$set(e.queryParams,"sequence",t)},expression:"queryParams.sequence"}})],1),l("el-form-item",{attrs:{label:"长度",prop:"length"}},[l("el-input",{attrs:{placeholder:"请输入长度",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.length,callback:function(t){e.$set(e.queryParams,"length",t)},expression:"queryParams.length"}})],1),l("el-form-item",{attrs:{label:"hmmEValue",prop:"hmmEValue"}},[l("el-input",{attrs:{placeholder:"请输入hmmEValue",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.hmmEValue,callback:function(t){e.$set(e.queryParams,"hmmEValue",t)},expression:"queryParams.hmmEValue"}})],1),l("el-form-item",{attrs:{label:"hmmScore",prop:"hmmScore"}},[l("el-input",{attrs:{placeholder:"请输入hmmScore",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.hmmScore,callback:function(t){e.$set(e.queryParams,"hmmScore",t)},expression:"queryParams.hmmScore"}})],1),l("el-form-item",[l("el-button",{attrs:{type:"primary",icon:"el-icon-search",size:"mini"},on:{click:e.handleQuery}},[e._v("搜索")]),l("el-button",{attrs:{icon:"el-icon-refresh",size:"mini"},on:{click:e.resetQuery}},[e._v("重置")])],1)],1),l("el-row",{staticClass:"mb8",attrs:{gutter:10}},[l("el-col",{attrs:{span:1.5}},[l("el-button",{directives:[{name:"hasPermi",rawName:"v-hasPermi",value:["system:pdetail:add"],expression:"['system:pdetail:add']"}],attrs:{type:"primary",plain:"",icon:"el-icon-plus",size:"mini"},on:{click:e.handleAdd}},[e._v("新增")])],1),l("el-col",{attrs:{span:1.5}},[l("el-button",{directives:[{name:"hasPermi",rawName:"v-hasPermi",value:["system:pdetail:edit"],expression:"['system:pdetail:edit']"}],attrs:{type:"success",plain:"",icon:"el-icon-edit",size:"mini",disabled:e.single},on:{click:e.handleUpdate}},[e._v("修改")])],1),l("el-col",{attrs:{span:1.5}},[l("el-button",{directives:[{name:"hasPermi",rawName:"v-hasPermi",value:["system:pdetail:remove"],expression:"['system:pdetail:remove']"}],attrs:{type:"danger",plain:"",icon:"el-icon-delete",size:"mini",disabled:e.multiple},on:{click:e.handleDelete}},[e._v("删除")])],1),l("el-col",{attrs:{span:1.5}},[l("el-button",{directives:[{name:"hasPermi",rawName:"v-hasPermi",value:["system:pdetail:export"],expression:"['system:pdetail:export']"}],attrs:{type:"warning",plain:"",icon:"el-icon-download",size:"mini"},on:{click:e.handleExport}},[e._v("导出")])],1),l("right-toolbar",{attrs:{showSearch:e.showSearch},on:{"update:showSearch":function(t){e.showSearch=t},"update:show-search":function(t){e.showSearch=t},queryTable:e.getList}})],1),l("el-table",{directives:[{name:"loading",rawName:"v-loading",value:e.loading,expression:"loading"}],attrs:{data:e.pdetailList},on:{"selection-change":e.handleSelectionChange}},[l("el-table-column",{attrs:{type:"selection",width:"55",align:"center"}}),e._e(),l("el-table-column",{attrs:{label:"系族",align:"center",prop:"systemFamily"}}),l("el-table-column",{attrs:{label:"ID",align:"center",prop:"proteinIds"}}),l("el-table-column",{attrs:{label:"蛋白质",align:"center",prop:"protein"}}),l("el-table-column",{attrs:{label:"抑制类型",align:"center",prop:"inhibitedType"}}),l("el-table-column",{attrs:{label:"噬菌体",align:"center",prop:"phage"}}),l("el-table-column",{attrs:{label:"宿主",align:"center",prop:"host"}}),l("el-table-column",{attrs:{label:"蛋白序列",align:"center",prop:"sequence"}}),l("el-table-column",{attrs:{label:"长度",align:"center",prop:"length"}}),l("el-table-column",{attrs:{label:"hmmEValue",align:"center",prop:"hmmEValue"}}),l("el-table-column",{attrs:{label:"hmmScore",align:"center",prop:"hmmScore"}}),l("el-table-column",{attrs:{label:"操作",align:"center","class-name":"small-padding fixed-width"},scopedSlots:e._u([{key:"default",fn:function(t){return[l("el-button",{directives:[{name:"hasPermi",rawName:"v-hasPermi",value:["system:pdetail:edit"],expression:"['system:pdetail:edit']"}],attrs:{size:"mini",type:"text",icon:"el-icon-edit"},on:{click:function(l){return e.handleUpdate(t.row)}}},[e._v("修改")]),l("el-button",{directives:[{name:"hasPermi",rawName:"v-hasPermi",value:["system:pdetail:remove"],expression:"['system:pdetail:remove']"}],attrs:{size:"mini",type:"text",icon:"el-icon-delete"},on:{click:function(l){return e.handleDelete(t.row)}}},[e._v("删除")])]}}])})],1),l("pagination",{directives:[{name:"show",rawName:"v-show",value:e.total>0,expression:"total>0"}],attrs:{total:e.total,page:e.queryParams.pageNum,limit:e.queryParams.pageSize},on:{"update:page":function(t){return e.$set(e.queryParams,"pageNum",t)},"update:limit":function(t){return e.$set(e.queryParams,"pageSize",t)},pagination:e.getList}}),l("el-dialog",{attrs:{title:e.title,visible:e.open,width:"500px","append-to-body":""},on:{"update:visible":function(t){e.open=t}}},[l("el-form",{ref:"form",attrs:{model:e.form,rules:e.rules,"label-width":"80px"}},[l("el-form-item",{attrs:{label:"系族",prop:"systemFamily"}},[l("el-input",{attrs:{placeholder:"请输入系族"},model:{value:e.form.systemFamily,callback:function(t){e.$set(e.form,"systemFamily",t)},expression:"form.systemFamily"}})],1),l("el-form-item",{attrs:{label:"ID",prop:"proteinIds"}},[l("el-input",{attrs:{placeholder:"请输入ID"},model:{value:e.form.proteinIds,callback:function(t){e.$set(e.form,"proteinIds",t)},expression:"form.proteinIds"}})],1),l("el-form-item",{attrs:{label:"蛋白质",prop:"protein"}},[l("el-input",{attrs:{placeholder:"请输入蛋白质"},model:{value:e.form.protein,callback:function(t){e.$set(e.form,"protein",t)},expression:"form.protein"}})],1),l("el-form-item",{attrs:{label:"噬菌体",prop:"phage"}},[l("el-input",{attrs:{placeholder:"请输入噬菌体"},model:{value:e.form.phage,callback:function(t){e.$set(e.form,"phage",t)},expression:"form.phage"}})],1),l("el-form-item",{attrs:{label:"宿主",prop:"host"}},[l("el-input",{attrs:{placeholder:"请输入宿主"},model:{value:e.form.host,callback:function(t){e.$set(e.form,"host",t)},expression:"form.host"}})],1),l("el-form-item",{attrs:{label:"蛋白序列",prop:"sequence"}},[l("el-input",{attrs:{placeholder:"请输入蛋白序列"},model:{value:e.form.sequence,callback:function(t){e.$set(e.form,"sequence",t)},expression:"form.sequence"}})],1),l("el-form-item",{attrs:{label:"长度",prop:"length"}},[l("el-input",{attrs:{placeholder:"请输入长度"},model:{value:e.form.length,callback:function(t){e.$set(e.form,"length",t)},expression:"form.length"}})],1),l("el-form-item",{attrs:{label:"hmmEValue",prop:"hmmEValue"}},[l("el-input",{attrs:{placeholder:"请输入hmmEValue"},model:{value:e.form.hmmEValue,callback:function(t){e.$set(e.form,"hmmEValue",t)},expression:"form.hmmEValue"}})],1),l("el-form-item",{attrs:{label:"hmmScore",prop:"hmmScore"}},[l("el-input",{attrs:{placeholder:"请输入hmmScore"},model:{value:e.form.hmmScore,callback:function(t){e.$set(e.form,"hmmScore",t)},expression:"form.hmmScore"}})],1)],1),l("div",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[l("el-button",{attrs:{type:"primary"},on:{click:e.submitForm}},[e._v("确 定")]),l("el-button",{on:{click:e.cancel}},[e._v("取 消")])],1)],1)],1)},r=[],n=l("5530"),i=(l("d81d"),l("76fd")),s={name:"Pdetail",data:function(){return{loading:!0,ids:[],single:!0,multiple:!0,showSearch:!0,total:0,pdetailList:[],title:"",open:!1,queryParams:{pageNum:1,pageSize:10,systemFamily:null,proteinIds:null,protein:null,inhibitedType:null,phage:null,host:null,sequence:null,length:null,hmmEValue:null,hmmScore:null,spare1:null,spare2:null,spare3:null,spare4:null,spare5:null},form:{},rules:{}}},created:function(){this.getList()},methods:{getList:function(){var e=this;this.loading=!0,Object(i["e"])(this.queryParams).then((function(t){e.pdetailList=t.rows,e.total=t.total,e.loading=!1}))},cancel:function(){this.open=!1,this.reset()},reset:function(){this.form={predictedDetailId:null,systemFamily:null,proteinIds:null,protein:null,inhibitedType:null,phage:null,host:null,sequence:null,length:null,hmmEValue:null,hmmScore:null,spare1:null,spare2:null,spare3:null,spare4:null,spare5:null},this.resetForm("form")},handleQuery:function(){this.queryParams.pageNum=1,this.getList()},resetQuery:function(){this.resetForm("queryForm"),this.handleQuery()},handleSelectionChange:function(e){this.ids=e.map((function(e){return e.predictedDetailId})),this.single=1!==e.length,this.multiple=!e.length},handleAdd:function(){this.reset(),this.open=!0,this.title="添加【请填写功能名称】"},handleUpdate:function(e){var t=this;this.reset();var l=e.predictedDetailId||this.ids;Object(i["c"])(l).then((function(e){t.form=e.data,t.open=!0,t.title="修改【请填写功能名称】"}))},submitForm:function(){var e=this;this.$refs["form"].validate((function(t){t&&(null!=e.form.predictedDetailId?Object(i["f"])(e.form).then((function(t){e.$modal.msgSuccess("修改成功"),e.open=!1,e.getList()})):Object(i["a"])(e.form).then((function(t){e.$modal.msgSuccess("新增成功"),e.open=!1,e.getList()})))}))},handleDelete:function(e){var t=this,l=e.predictedDetailId||this.ids;this.$modal.confirm('是否确认删除【请填写功能名称】编号为"'+l+'"的数据项？').then((function(){return Object(i["b"])(l)})).then((function(){t.getList(),t.$modal.msgSuccess("删除成功")})).catch((function(){}))},handleExport:function(){this.download("system/pdetail/export",Object(n["a"])({},this.queryParams),"pdetail_".concat((new Date).getTime(),".xlsx"))}}},o=s,u=l("2877"),m=Object(u["a"])(o,a,r,!1,null,null,null);t["default"]=m.exports}}]);