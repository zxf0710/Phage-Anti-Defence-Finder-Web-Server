(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-847d8c10"],{"5e37":function(e,t,a){"use strict";a.d(t,"d",(function(){return l})),a.d(t,"c",(function(){return n})),a.d(t,"a",(function(){return s})),a.d(t,"e",(function(){return o})),a.d(t,"b",(function(){return i}));var r=a("b775");function l(e){return Object(r["a"])({url:"/system/basic/list",method:"get",params:e})}function n(e){return Object(r["a"])({url:"/system/basic/"+e,method:"get"})}function s(e){return Object(r["a"])({url:"/system/basic",method:"post",data:e})}function o(e){return Object(r["a"])({url:"/system/basic",method:"put",data:e})}function i(e){return Object(r["a"])({url:"/system/basic/"+e,method:"delete"})}},b4e8:function(e,t,a){"use strict";a.r(t);var r=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{staticClass:"app-container"},[a("el-form",{directives:[{name:"show",rawName:"v-show",value:e.showSearch,expression:"showSearch"}],ref:"queryForm",attrs:{model:e.queryParams,size:"small",inline:!0,"label-width":"68px"}},[a("el-form-item",{attrs:{label:"${comment}",prop:"phageGenomeAccession"}},[a("el-input",{attrs:{placeholder:"请输入${comment}",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.phageGenomeAccession,callback:function(t){e.$set(e.queryParams,"phageGenomeAccession",t)},expression:"queryParams.phageGenomeAccession"}})],1),a("el-form-item",{attrs:{label:"系族",prop:"systemFamily"}},[a("el-input",{attrs:{placeholder:"请输入系族",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.systemFamily,callback:function(t){e.$set(e.queryParams,"systemFamily",t)},expression:"queryParams.systemFamily"}})],1),a("el-form-item",{attrs:{label:"ID",prop:"proteinIds"}},[a("el-input",{attrs:{placeholder:"请输入ID",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.proteinIds,callback:function(t){e.$set(e.queryParams,"proteinIds",t)},expression:"queryParams.proteinIds"}})],1),a("el-form-item",{attrs:{label:"蛋白质",prop:"protein"}},[a("el-input",{attrs:{placeholder:"请输入蛋白质",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.protein,callback:function(t){e.$set(e.queryParams,"protein",t)},expression:"queryParams.protein"}})],1),a("el-form-item",{attrs:{label:"长度",prop:"length"}},[a("el-input",{attrs:{placeholder:"请输入长度",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.length,callback:function(t){e.$set(e.queryParams,"length",t)},expression:"queryParams.length"}})],1),a("el-form-item",{attrs:{label:"备用字段1",prop:"spare1"}},[a("el-input",{attrs:{placeholder:"请输入备用字段1",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.spare1,callback:function(t){e.$set(e.queryParams,"spare1",t)},expression:"queryParams.spare1"}})],1),a("el-form-item",{attrs:{label:"备用字段2",prop:"spare2"}},[a("el-input",{attrs:{placeholder:"请输入备用字段2",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.spare2,callback:function(t){e.$set(e.queryParams,"spare2",t)},expression:"queryParams.spare2"}})],1),a("el-form-item",{attrs:{label:"备用字段3",prop:"spare3"}},[a("el-input",{attrs:{placeholder:"请输入备用字段3",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.spare3,callback:function(t){e.$set(e.queryParams,"spare3",t)},expression:"queryParams.spare3"}})],1),a("el-form-item",{attrs:{label:"备用字段4",prop:"spare4"}},[a("el-input",{attrs:{placeholder:"请输入备用字段4",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.spare4,callback:function(t){e.$set(e.queryParams,"spare4",t)},expression:"queryParams.spare4"}})],1),a("el-form-item",{attrs:{label:"备用字段5",prop:"spare5"}},[a("el-input",{attrs:{placeholder:"请输入备用字段5",clearable:""},nativeOn:{keyup:function(t){return!t.type.indexOf("key")&&e._k(t.keyCode,"enter",13,t.key,"Enter")?null:e.handleQuery(t)}},model:{value:e.queryParams.spare5,callback:function(t){e.$set(e.queryParams,"spare5",t)},expression:"queryParams.spare5"}})],1),a("el-form-item",[a("el-button",{attrs:{type:"primary",icon:"el-icon-search",size:"mini"},on:{click:e.handleQuery}},[e._v("搜索")]),a("el-button",{attrs:{icon:"el-icon-refresh",size:"mini"},on:{click:e.resetQuery}},[e._v("重置")])],1)],1),a("el-row",{staticClass:"mb8",attrs:{gutter:10}},[a("el-col",{attrs:{span:1.5}},[a("el-button",{directives:[{name:"hasPermi",rawName:"v-hasPermi",value:["system:basic:add"],expression:"['system:basic:add']"}],attrs:{type:"primary",plain:"",icon:"el-icon-plus",size:"mini"},on:{click:e.handleAdd}},[e._v("新增")])],1),a("el-col",{attrs:{span:1.5}},[a("el-button",{directives:[{name:"hasPermi",rawName:"v-hasPermi",value:["system:basic:edit"],expression:"['system:basic:edit']"}],attrs:{type:"success",plain:"",icon:"el-icon-edit",size:"mini",disabled:e.single},on:{click:e.handleUpdate}},[e._v("修改")])],1),a("el-col",{attrs:{span:1.5}},[a("el-button",{directives:[{name:"hasPermi",rawName:"v-hasPermi",value:["system:basic:remove"],expression:"['system:basic:remove']"}],attrs:{type:"danger",plain:"",icon:"el-icon-delete",size:"mini",disabled:e.multiple},on:{click:e.handleDelete}},[e._v("删除")])],1),a("el-col",{attrs:{span:1.5}},[a("el-button",{directives:[{name:"hasPermi",rawName:"v-hasPermi",value:["system:basic:export"],expression:"['system:basic:export']"}],attrs:{type:"warning",plain:"",icon:"el-icon-download",size:"mini"},on:{click:e.handleExport}},[e._v("导出")])],1),a("right-toolbar",{attrs:{showSearch:e.showSearch},on:{"update:showSearch":function(t){e.showSearch=t},"update:show-search":function(t){e.showSearch=t},queryTable:e.getList}})],1),a("el-table",{directives:[{name:"loading",rawName:"v-loading",value:e.loading,expression:"loading"}],attrs:{data:e.basicList},on:{"selection-change":e.handleSelectionChange}},[a("el-table-column",{attrs:{type:"selection",width:"55",align:"center"}}),a("el-table-column",{attrs:{label:"${comment}",align:"center",prop:"basicId"}}),a("el-table-column",{attrs:{label:"${comment}",align:"center",prop:"phageGenomeAccession"}}),a("el-table-column",{attrs:{label:"系族",align:"center",prop:"systemFamily"}}),a("el-table-column",{attrs:{label:"ID",align:"center",prop:"proteinIds"}}),a("el-table-column",{attrs:{label:"蛋白质",align:"center",prop:"protein"}}),a("el-table-column",{attrs:{label:"抑制类型",align:"center",prop:"inhibitedType"}}),a("el-table-column",{attrs:{label:"噬菌体",align:"center",prop:"phage"}}),a("el-table-column",{attrs:{label:"宿主",align:"center",prop:"host"}}),a("el-table-column",{attrs:{label:"长度",align:"center",prop:"length"}}),a("el-table-column",{attrs:{label:"备用字段1",align:"center",prop:"spare1"}}),a("el-table-column",{attrs:{label:"备用字段2",align:"center",prop:"spare2"}}),a("el-table-column",{attrs:{label:"备用字段3",align:"center",prop:"spare3"}}),a("el-table-column",{attrs:{label:"备用字段4",align:"center",prop:"spare4"}}),a("el-table-column",{attrs:{label:"备用字段5",align:"center",prop:"spare5"}}),a("el-table-column",{attrs:{label:"操作",align:"center","class-name":"small-padding fixed-width"},scopedSlots:e._u([{key:"default",fn:function(t){return[a("el-button",{directives:[{name:"hasPermi",rawName:"v-hasPermi",value:["system:basic:edit"],expression:"['system:basic:edit']"}],attrs:{size:"mini",type:"text",icon:"el-icon-edit"},on:{click:function(a){return e.handleUpdate(t.row)}}},[e._v("修改")]),a("el-button",{directives:[{name:"hasPermi",rawName:"v-hasPermi",value:["system:basic:remove"],expression:"['system:basic:remove']"}],attrs:{size:"mini",type:"text",icon:"el-icon-delete"},on:{click:function(a){return e.handleDelete(t.row)}}},[e._v("删除")])]}}])})],1),a("pagination",{directives:[{name:"show",rawName:"v-show",value:e.total>0,expression:"total>0"}],attrs:{total:e.total,page:e.queryParams.pageNum,limit:e.queryParams.pageSize},on:{"update:page":function(t){return e.$set(e.queryParams,"pageNum",t)},"update:limit":function(t){return e.$set(e.queryParams,"pageSize",t)},pagination:e.getList}}),a("el-dialog",{attrs:{title:e.title,visible:e.open,width:"500px","append-to-body":""},on:{"update:visible":function(t){e.open=t}}},[a("el-form",{ref:"form",attrs:{model:e.form,rules:e.rules,"label-width":"80px"}},[a("el-form-item",{attrs:{label:"${comment}",prop:"phageGenomeAccession"}},[a("el-input",{attrs:{placeholder:"请输入${comment}"},model:{value:e.form.phageGenomeAccession,callback:function(t){e.$set(e.form,"phageGenomeAccession",t)},expression:"form.phageGenomeAccession"}})],1),a("el-form-item",{attrs:{label:"系族",prop:"systemFamily"}},[a("el-input",{attrs:{placeholder:"请输入系族"},model:{value:e.form.systemFamily,callback:function(t){e.$set(e.form,"systemFamily",t)},expression:"form.systemFamily"}})],1),a("el-form-item",{attrs:{label:"ID",prop:"proteinIds"}},[a("el-input",{attrs:{placeholder:"请输入ID"},model:{value:e.form.proteinIds,callback:function(t){e.$set(e.form,"proteinIds",t)},expression:"form.proteinIds"}})],1),a("el-form-item",{attrs:{label:"蛋白质",prop:"protein"}},[a("el-input",{attrs:{placeholder:"请输入蛋白质"},model:{value:e.form.protein,callback:function(t){e.$set(e.form,"protein",t)},expression:"form.protein"}})],1),a("el-form-item",{attrs:{label:"噬菌体",prop:"phage"}},[a("el-input",{attrs:{type:"textarea",placeholder:"请输入内容"},model:{value:e.form.phage,callback:function(t){e.$set(e.form,"phage",t)},expression:"form.phage"}})],1),a("el-form-item",{attrs:{label:"宿主",prop:"host"}},[a("el-input",{attrs:{type:"textarea",placeholder:"请输入内容"},model:{value:e.form.host,callback:function(t){e.$set(e.form,"host",t)},expression:"form.host"}})],1),a("el-form-item",{attrs:{label:"长度",prop:"length"}},[a("el-input",{attrs:{placeholder:"请输入长度"},model:{value:e.form.length,callback:function(t){e.$set(e.form,"length",t)},expression:"form.length"}})],1),a("el-form-item",{attrs:{label:"备用字段1",prop:"spare1"}},[a("el-input",{attrs:{placeholder:"请输入备用字段1"},model:{value:e.form.spare1,callback:function(t){e.$set(e.form,"spare1",t)},expression:"form.spare1"}})],1),a("el-form-item",{attrs:{label:"备用字段2",prop:"spare2"}},[a("el-input",{attrs:{placeholder:"请输入备用字段2"},model:{value:e.form.spare2,callback:function(t){e.$set(e.form,"spare2",t)},expression:"form.spare2"}})],1),a("el-form-item",{attrs:{label:"备用字段3",prop:"spare3"}},[a("el-input",{attrs:{placeholder:"请输入备用字段3"},model:{value:e.form.spare3,callback:function(t){e.$set(e.form,"spare3",t)},expression:"form.spare3"}})],1),a("el-form-item",{attrs:{label:"备用字段4",prop:"spare4"}},[a("el-input",{attrs:{placeholder:"请输入备用字段4"},model:{value:e.form.spare4,callback:function(t){e.$set(e.form,"spare4",t)},expression:"form.spare4"}})],1),a("el-form-item",{attrs:{label:"备用字段5",prop:"spare5"}},[a("el-input",{attrs:{placeholder:"请输入备用字段5"},model:{value:e.form.spare5,callback:function(t){e.$set(e.form,"spare5",t)},expression:"form.spare5"}})],1)],1),a("div",{staticClass:"dialog-footer",attrs:{slot:"footer"},slot:"footer"},[a("el-button",{attrs:{type:"primary"},on:{click:e.submitForm}},[e._v("确 定")]),a("el-button",{on:{click:e.cancel}},[e._v("取 消")])],1)],1)],1)},l=[],n=a("5530"),s=(a("d81d"),a("5e37")),o={name:"Basic",data:function(){return{loading:!0,ids:[],single:!0,multiple:!0,showSearch:!0,total:0,basicList:[],title:"",open:!1,queryParams:{pageNum:1,pageSize:10,phageGenomeAccession:null,systemFamily:null,proteinIds:null,protein:null,inhibitedType:null,phage:null,host:null,length:null,spare1:null,spare2:null,spare3:null,spare4:null,spare5:null},form:{},rules:{}}},created:function(){this.getList()},methods:{getList:function(){var e=this;this.loading=!0,Object(s["d"])(this.queryParams).then((function(t){e.basicList=t.rows,e.total=t.total,e.loading=!1}))},cancel:function(){this.open=!1,this.reset()},reset:function(){this.form={basicId:null,phageGenomeAccession:null,systemFamily:null,proteinIds:null,protein:null,inhibitedType:null,phage:null,host:null,length:null,spare1:null,spare2:null,spare3:null,spare4:null,spare5:null},this.resetForm("form")},handleQuery:function(){this.queryParams.pageNum=1,this.getList()},resetQuery:function(){this.resetForm("queryForm"),this.handleQuery()},handleSelectionChange:function(e){this.ids=e.map((function(e){return e.basicId})),this.single=1!==e.length,this.multiple=!e.length},handleAdd:function(){this.reset(),this.open=!0,this.title="添加【请填写功能名称】"},handleUpdate:function(e){var t=this;this.reset();var a=e.basicId||this.ids;Object(s["c"])(a).then((function(e){t.form=e.data,t.open=!0,t.title="修改【请填写功能名称】"}))},submitForm:function(){var e=this;this.$refs["form"].validate((function(t){t&&(null!=e.form.basicId?Object(s["e"])(e.form).then((function(t){e.$modal.msgSuccess("修改成功"),e.open=!1,e.getList()})):Object(s["a"])(e.form).then((function(t){e.$modal.msgSuccess("新增成功"),e.open=!1,e.getList()})))}))},handleDelete:function(e){var t=this,a=e.basicId||this.ids;this.$modal.confirm('是否确认删除【请填写功能名称】编号为"'+a+'"的数据项？').then((function(){return Object(s["b"])(a)})).then((function(){t.getList(),t.$modal.msgSuccess("删除成功")})).catch((function(){}))},handleExport:function(){this.download("system/basic/export",Object(n["a"])({},this.queryParams),"basic_".concat((new Date).getTime(),".xlsx"))}}},i=o,c=a("2877"),p=Object(c["a"])(i,r,l,!1,null,null,null);t["default"]=p.exports}}]);