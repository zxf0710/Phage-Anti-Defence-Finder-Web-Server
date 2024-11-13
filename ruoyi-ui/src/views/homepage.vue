<template>
  <div class="policy-home" style="font-family: 'Times New Roman'">
    <div style=" margin:0 ; padding : 10px 50px;background-color:#486DC0; color: #FFFFFF;font-weight: bolder;font-size: xx-large ">
      <span>Phage Anti-Defense Finder Web Server</span>
    </div>

    <div class="policyNav">
      <el-menu :default-active="activeIndex"
               background-color="#486DC0"
               text-color="#FFFFFF"
               active-text-color="#FFF000"
               class="el-menu-demo"
               mode="horizontal"
               :router="true"
               @select="handleSelect">
        <el-menu-item index="/system/home">Home</el-menu-item>
        <el-menu-item index="/system/frontverified">Verified</el-menu-item>
        <el-menu-item index="/system/frontpredicted">Predicted</el-menu-item>
        <el-menu-item index="/system/search">Search</el-menu-item>
        <el-menu-item index="/system/prediction">Prediction</el-menu-item>
        <el-menu-item index="/system/help">Help</el-menu-item>
      </el-menu>
      <el-main>
        <router-view></router-view>
      </el-main>
    </div>
  </div>
</template>

<script>
export default {
  name: "homepage",
  data() {
    return {
      activeIndex: '/system/home',
    };
  },
  watch: {
    // 监听路由变化
    $route(to, from) {
      this.updateActiveIndex(to.path);
    }
  },
  created() {
    // 初始化时设置activeIndex
    this.updateActiveIndex(this.$route.path);
  },
  methods: {
    handleSelect(key, keyPath) {
      this.$router.push({ path: key });
    },
    updateActiveIndex(path) {
      // 根据路由更新activeIndex
      this.activeIndex = path;
    }
  }
};
</script>

<style lang="scss" scoped>
.navContent {
  min-height: 800px;
  padding-bottom: 70px;
  background-color: #fff;
}
.policyNav {
  .el-menu-item {
    text-align: center;
    border-bottom: none;
    width: 16%;
    font-size: 22px;
    font-weight: 500;
    background-color: #486DC0 !important;
  }

  .el-menu {
    background-color: #486DC0 !important;
  }
}
</style>
