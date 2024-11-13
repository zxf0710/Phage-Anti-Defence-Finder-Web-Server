<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="编号" prop="elderlyId">
        <el-input
          v-model="queryParams.elderlyId"
          placeholder="请输入编号"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="诊断时间" prop="diagnosisDate">
        <el-input
          v-model="queryParams.diagnosisDate"
          placeholder="请输入诊断时间"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="多重用药" prop="c1Polypharmacy">
        <el-input
          v-model="queryParams.c1Polypharmacy"
          placeholder="请输入多重用药"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
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
          v-hasPermi="['system:drugfactors:add']"
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
          v-hasPermi="['system:drugfactors:edit']"
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
          v-hasPermi="['system:drugfactors:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:drugfactors:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="drugfactorsList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="编号" align="center" prop="elderlyId" />
      <el-table-column label="诊断时间" align="center" prop="diagnosisDate" />
      <el-table-column label="多重用药" align="center">
        <template slot-scope="scope">
          {{ scope.row.c1Polypharmacy === 1 ? '是' : '否' }}
        </template>
      </el-table-column>
      <el-table-column label="药物种类" align="center" prop="c2DrugType" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:drugfactors:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:drugfactors:remove']"
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
        <el-form-item label="编号" prop="elderlyId">
          <el-input v-model="form.elderlyId" placeholder="请输入编号" />
        </el-form-item>
        <el-form-item label="诊断时间" prop="diagnosisDate">
          <el-input v-model="form.diagnosisDate" placeholder="请输入诊断时间" />
        </el-form-item>
        <el-form-item label="多重用药" prop="c1Polypharmacy">
          <el-input v-model="form.c1Polypharmacy" placeholder="请输入多重用药" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listDrugfactors, getDrugfactors, delDrugfactors, addDrugfactors, updateDrugfactors } from "@/api/system/drugfactors";

export default {
  name: "Drugfactors",
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
      drugfactorsList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        elderlyId: null,
        diagnosisDate: null,
        c1Polypharmacy: null,
        c2DrugType: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        elderlyId: [
          { required: true, message: "编号不能为空", trigger: "blur" }
        ],
        diagnosisDate: [
          { required: true, message: "诊断时间不能为空", trigger: "blur" }
        ],
        c1Polypharmacy: [
          { required: true, message: "多重用药不能为空", trigger: "blur" }
        ],
        c2DrugType: [
          { required: true, message: "药物种类不能为空", trigger: "change" }
        ]
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
      listDrugfactors(this.queryParams).then(response => {
        this.drugfactorsList = response.rows;
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
        elderlyId: null,
        diagnosisDate: null,
        c1Polypharmacy: null,
        c2DrugType: null
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
      this.ids = selection.map(item => item.elderlyId)
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
      const elderlyId = row.elderlyId || this.ids
      getDrugfactors(elderlyId).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改【请填写功能名称】";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.elderlyId != null) {
            updateDrugfactors(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addDrugfactors(this.form).then(response => {
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
      const elderlyIds = row.elderlyId || this.ids;
      this.$modal.confirm('是否确认删除【请填写功能名称】编号为"' + elderlyIds + '"的数据项？').then(function() {
        return delDrugfactors(elderlyIds);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/drugfactors/export', {
        ...this.queryParams
      }, `drugfactors_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
