<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" size="small" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="${comment}" prop="phageName">
        <el-input
          v-model="queryParams.phageName"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="phageGenomeAccession">
        <el-input
          v-model="queryParams.phageGenomeAccession"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="antiDenfenceSystemNumbers">
        <el-input
          v-model="queryParams.antiDenfenceSystemNumbers"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="spare1">
        <el-input
          v-model="queryParams.spare1"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="spare2">
        <el-input
          v-model="queryParams.spare2"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="spare3">
        <el-input
          v-model="queryParams.spare3"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="spare4">
        <el-input
          v-model="queryParams.spare4"
          placeholder="请输入${comment}"
          clearable
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="spare5">
        <el-input
          v-model="queryParams.spare5"
          placeholder="请输入${comment}"
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
          v-hasPermi="['system:genome:add']"
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
          v-hasPermi="['system:genome:edit']"
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
          v-hasPermi="['system:genome:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:genome:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="genomeList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="${comment}" align="center" prop="phageId" />
      <el-table-column label="${comment}" align="center" prop="phageName" />
      <el-table-column label="${comment}" align="center" prop="phageGenomeAccession" />
      <el-table-column label="${comment}" align="center" prop="antiDenfenceSystemNumbers" />
      <el-table-column label="${comment}" align="center" prop="host" />
      <el-table-column label="${comment}" align="center" prop="spare1" />
      <el-table-column label="${comment}" align="center" prop="spare2" />
      <el-table-column label="${comment}" align="center" prop="spare3" />
      <el-table-column label="${comment}" align="center" prop="spare4" />
      <el-table-column label="${comment}" align="center" prop="spare5" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:genome:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:genome:remove']"
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
        <el-form-item label="${comment}" prop="phageName">
          <el-input v-model="form.phageName" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="phageGenomeAccession">
          <el-input v-model="form.phageGenomeAccession" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="antiDenfenceSystemNumbers">
          <el-input v-model="form.antiDenfenceSystemNumbers" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="host">
          <el-input v-model="form.host" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="${comment}" prop="spare1">
          <el-input v-model="form.spare1" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="spare2">
          <el-input v-model="form.spare2" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="spare3">
          <el-input v-model="form.spare3" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="spare4">
          <el-input v-model="form.spare4" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="spare5">
          <el-input v-model="form.spare5" placeholder="请输入${comment}" />
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
import { listGenome, getGenome, delGenome, addGenome, updateGenome } from "@/api/system/genome";

export default {
  name: "Genome",
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
      genomeList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        phageName: null,
        phageGenomeAccession: null,
        antiDenfenceSystemNumbers: null,
        host: null,
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
      listGenome(this.queryParams).then(response => {
        this.genomeList = response.rows;
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
        phageId: null,
        phageName: null,
        phageGenomeAccession: null,
        antiDenfenceSystemNumbers: null,
        host: null,
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
      this.ids = selection.map(item => item.phageId)
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
      const phageId = row.phageId || this.ids
      getGenome(phageId).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改【请填写功能名称】";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.phageId != null) {
            updateGenome(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addGenome(this.form).then(response => {
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
      const phageIds = row.phageId || this.ids;
      this.$modal.confirm('是否确认删除【请填写功能名称】编号为"' + phageIds + '"的数据项？').then(function() {
        return delGenome(phageIds);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/genome/export', {
        ...this.queryParams
      }, `genome_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
