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
      <el-form-item label="时间" prop="diagnosisDate">
        <el-input
          v-model="queryParams.diagnosisDate"
          placeholder="请输入时间"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="行走能力" prop="d1WalkingAbility">
        <el-input
          v-model="queryParams.d1WalkingAbility"
          placeholder="请输入行走能力"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="步态不稳" prop="d2GaitInstability">
        <el-input
          v-model="queryParams.d2GaitInstability"
          placeholder="请输入步态不稳"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="平衡障碍" prop="d3BalanceDisorder">
        <el-input
          v-model="queryParams.d3BalanceDisorder"
          placeholder="请输入平衡障碍"
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
          v-hasPermi="['system:balancemobilityfactors:add']"
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
          v-hasPermi="['system:balancemobilityfactors:edit']"
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
          v-hasPermi="['system:balancemobilityfactors:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:balancemobilityfactors:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="balancemobilityfactorsList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="编号" align="center" prop="elderlyId" />
      <el-table-column label="时间" align="center" prop="diagnosisDate" />
      <el-table-column label="行走能力" align="center">
        <template slot-scope="scope">
          {{ scope.row.d1WalkingAbility === 1 ? '是' : '否' }}
        </template>
      </el-table-column>
      <el-table-column label="步态不稳" align="center">
        <template slot-scope="scope">
          {{ scope.row.d2GaitInstability === 1 ? '是' : '否' }}
        </template>
      </el-table-column>
      <el-table-column label="平衡障碍" align="center">
        <template slot-scope="scope">
          {{ scope.row.d3BalanceDisorder === 1 ? '是' : '否' }}
        </template>
      </el-table-column>
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:balancemobilityfactors:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:balancemobilityfactors:remove']"
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
        <el-form-item label="时间" prop="diagnosisDate">
          <el-input v-model="form.diagnosisDate" placeholder="请输入时间" />
        </el-form-item>
        <el-form-item label="行走能力" prop="d1WalkingAbility">
          <el-input v-model="form.d1WalkingAbility" placeholder="请输入行走能力" />
        </el-form-item>
        <el-form-item label="步态不稳" prop="d2GaitInstability">
          <el-input v-model="form.d2GaitInstability" placeholder="请输入步态不稳" />
        </el-form-item>
        <el-form-item label="平衡障碍" prop="d3BalanceDisorder">
          <el-input v-model="form.d3BalanceDisorder" placeholder="请输入平衡障碍" />
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
import { listBalancemobilityfactors, getBalancemobilityfactors, delBalancemobilityfactors, addBalancemobilityfactors, updateBalancemobilityfactors } from "@/api/system/balancemobilityfactors";

export default {
  name: "Balancemobilityfactors",
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
      balancemobilityfactorsList: [],
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
        d1WalkingAbility: null,
        d2GaitInstability: null,
        d3BalanceDisorder: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        elderlyId: [
          { required: true, message: "编号不能为空", trigger: "blur" }
        ],
        diagnosisDate: [
          { required: true, message: "时间不能为空", trigger: "blur" }
        ],
        d1WalkingAbility: [
          { required: true, message: "行走能力不能为空", trigger: "blur" }
        ],
        d2GaitInstability: [
          { required: true, message: "步态不稳不能为空", trigger: "blur" }
        ],
        d3BalanceDisorder: [
          { required: true, message: "平衡障碍不能为空", trigger: "blur" }
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
      listBalancemobilityfactors(this.queryParams).then(response => {
        this.balancemobilityfactorsList = response.rows;
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
        d1WalkingAbility: null,
        d2GaitInstability: null,
        d3BalanceDisorder: null
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
      getBalancemobilityfactors(elderlyId).then(response => {
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
            updateBalancemobilityfactors(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addBalancemobilityfactors(this.form).then(response => {
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
        return delBalancemobilityfactors(elderlyIds);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/balancemobilityfactors/export', {
        ...this.queryParams
      }, `balancemobilityfactors_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
