<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="族系" prop="systemFamily">
        <el-input
          v-model="queryParams.systemFamily"
          placeholder="请输入族系"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="ID" prop="proteinIds">
        <el-input
          v-model="queryParams.proteinIds"
          placeholder="请输入ID"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="蛋白质" prop="protein">
        <el-input
          v-model="queryParams.protein"
          placeholder="请输入蛋白质"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="噬菌体" prop="phage">
        <el-input
          v-model="queryParams.phage"
          placeholder="请输入噬菌体"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="宿主" prop="host">
        <el-input
          v-model="queryParams.host"
          placeholder="请输入宿主"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="长度" prop="length">
        <el-input
          v-model="queryParams.length"
          placeholder="请输入长度"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="参考文献" prop="cankaowenxian">
        <el-input
          v-model="queryParams.cankaowenxian"
          placeholder="请输入参考文献"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
<!--      <el-form-item label="备用字段1" prop="spare1">-->
<!--        <el-input-->
<!--          v-model="queryParams.spare1"-->
<!--          placeholder="请输入备用字段1"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
<!--      <el-form-item label="备用字段2" prop="spare2">-->
<!--        <el-input-->
<!--          v-model="queryParams.spare2"-->
<!--          placeholder="请输入备用字段2"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
<!--      <el-form-item label="备用字段3" prop="spare3">-->
<!--        <el-input-->
<!--          v-model="queryParams.spare3"-->
<!--          placeholder="请输入备用字段3"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
<!--      <el-form-item label="备用字段4" prop="spare4">-->
<!--        <el-input-->
<!--          v-model="queryParams.spare4"-->
<!--          placeholder="请输入备用字段4"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
<!--      <el-form-item label="备用字段5" prop="spare5">-->
<!--        <el-input-->
<!--          v-model="queryParams.spare5"-->
<!--          placeholder="请输入备用字段5"-->
<!--          clearable-->
<!--          @keyup.enter.native="handleQuery"-->
<!--        />-->
<!--      </el-form-item>-->
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['system:predicted:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['system:predicted:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['system:predicted:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:predicted:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="predictedList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column v-if="false" label="待预测id" align="center" prop="predictedId" />
      <el-table-column label="族系" align="center" prop="systemFamily" />
      <el-table-column label="ID" align="center" prop="proteinIds" />
      <el-table-column label="蛋白质" align="center" prop="protein" />
      <el-table-column label="抑制类型" align="center" prop="inhibitedType" />
      <el-table-column label="噬菌体" align="center" prop="phage" />
      <el-table-column label="宿主" align="center" prop="host" />
      <el-table-column label="长度" align="center" prop="length" />
      <el-table-column label="参考文献" align="center" prop="cankaowenxian" />
<!--      <el-table-column label="备用字段1" align="center" prop="spare1" />-->
<!--      <el-table-column label="备用字段2" align="center" prop="spare2" />-->
<!--      <el-table-column label="备用字段3" align="center" prop="spare3" />-->
<!--      <el-table-column label="备用字段4" align="center" prop="spare4" />-->
<!--      <el-table-column label="备用字段5" align="center" prop="spare5" />-->
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:predicted:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:predicted:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>

    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改【请填写功能名称】对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="族系" prop="systemFamily">
          <el-input v-model="form.systemFamily" placeholder="请输入族系" />
        </el-form-item>
        <el-form-item label="ID" prop="proteinIds">
          <el-input v-model="form.proteinIds" placeholder="请输入ID" />
        </el-form-item>
        <el-form-item label="蛋白质" prop="protein">
          <el-input v-model="form.protein" placeholder="请输入蛋白质" />
        </el-form-item>
        <el-form-item label="噬菌体" prop="phage">
          <el-input v-model="form.phage" placeholder="请输入噬菌体" />
        </el-form-item>
        <el-form-item label="宿主" prop="host">
          <el-input v-model="form.host" placeholder="请输入宿主" />
        </el-form-item>
        <el-form-item label="长度" prop="length">
          <el-input v-model="form.length" placeholder="请输入长度" />
        </el-form-item>
        <el-form-item label="参考文献" prop="cankaowenxian">
          <el-input v-model="form.cankaowenxian" placeholder="请输入参考文献" />
        </el-form-item>
<!--        <el-form-item label="备用字段1" prop="spare1">-->
<!--          <el-input v-model="form.spare1" placeholder="请输入备用字段1" />-->
<!--        </el-form-item>-->
<!--        <el-form-item label="备用字段2" prop="spare2">-->
<!--          <el-input v-model="form.spare2" placeholder="请输入备用字段2" />-->
<!--        </el-form-item>-->
<!--        <el-form-item label="备用字段3" prop="spare3">-->
<!--          <el-input v-model="form.spare3" placeholder="请输入备用字段3" />-->
<!--        </el-form-item>-->
<!--        <el-form-item label="备用字段4" prop="spare4">-->
<!--          <el-input v-model="form.spare4" placeholder="请输入备用字段4" />-->
<!--        </el-form-item>-->
<!--        <el-form-item label="备用字段5" prop="spare5">-->
<!--          <el-input v-model="form.spare5" placeholder="请输入备用字段5" />-->
<!--        </el-form-item>-->
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listPredicted, getPredicted, delPredicted, addPredicted, updatePredicted } from "@/api/system/predicted";

export default {
  name: "Predicted",
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 【请填写功能名称】表格数据
      predictedList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
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
      // 表单参数
      form: {},
      // 表单校验
      rules: {
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询【请填写功能名称】列表 */
    getList() {
      this.loading = true;
      listPredicted(this.queryParams).then(response => {
        this.predictedList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        predictedId: null,
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
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.predictedId)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加【请填写功能名称】";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const predictedId = row.predictedId || this.ids
      getPredicted(predictedId).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改【请填写功能名称】";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.predictedId != null) {
            updatePredicted(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addPredicted(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const predictedIds = row.predictedId || this.ids;
      this.$modal.confirm('是否确认删除【请填写功能名称】编号为"' + predictedIds + '"的数据项？').then(function() {
        return delPredicted(predictedIds);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/predicted/export', {
        ...this.queryParams
      }, `predicted_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
