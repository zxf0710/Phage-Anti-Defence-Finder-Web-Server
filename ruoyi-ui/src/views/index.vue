<template>
  <div class="home-page">
    <header>
      <h1>疫苗素养与接种率管理平台</h1>
    </header>

    <section class="main-content">
      <div class="welcome-message">
        <p>欢迎使用我们的平台，提升公共卫生水平！</p>
      </div>

      <div class="platform-features">
        <h2>平台功能</h2>
        <ul>
          <li>数据集成与分析</li>
          <li>素养评估与管理</li>
          <li>实时接种率监测</li>
          <li>用户界面与反馈</li>
          <li>应急响应与管理</li>
        </ul>
      </div>

      <div class="get-started">
        <button @click="redirectToDocumentation">开始使用</button>
      </div>
    </section>

    <footer>
      <p>&copy; 2024 疫苗素养与接种率管理平台</p>
    </footer>
  </div>
</template>

<script>
export default {
  methods: {
    redirectToDocumentation() {
      // 在这里可以添加跳转到文档页面的逻辑
      // 例如：this.$router.push('/documentation')
    }
  }
};
</script>

<style scoped>
/* 在这里可以添加样式，使页面更具吸引力和用户友好性 */
body, html {
  height: 100%;
  margin: 0;
  font-family: 'Arial', sans-serif;
}

.home-page {
  min-height: 100%;
  display: flex;
  flex-direction: column;
}

header {
  background-color: #06A1FF;
  padding: 20px;
  color: white;
  text-align: center;
}

.main-content {
  flex-grow: 1;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  text-align: center;
  padding: 80px;
}

.welcome-message {
  font-size: 24px;
  margin-bottom: 30px;
  color: #333;
}

.platform-features {
  text-align: left;
  color: #555;
}

.platform-features h2 {
  color: #06A1FF;
}

.platform-features ul {
  list-style-type: none;
  padding: 0;
}

.platform-features li {
  margin-bottom: 10px;
}

.get-started button {
  background-color: #06A1FF;
  color: white;
  padding: 15px 30px;
  font-size: 18px;
  cursor: pointer;
  border: none;
}

footer {
  background-color: #f1f1f1;
  padding: 20px;
  text-align: center;
  margin-top: auto;
}
</style>
