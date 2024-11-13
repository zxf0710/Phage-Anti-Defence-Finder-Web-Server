<template>
  <div class="container">
    <h1 style="text-align: center;font-size: xx-large">Welcome to Phage Anti-Defence Finder Web Server</h1>

    <p style="font-size: larger;letter-spacing: 2px;line-height: 35px;text-indent: 50px;">Bacteria have developed a wide array of defenses to shield themselves from phages. In response, phages have
      evolved a series of potent countermeasures known as phage anti-defenses.
      </p>
    <p style="font-size: larger;letter-spacing: 2px;line-height: 35px;text-indent: 50px;">PADF is a comprehensive database that catalogs both experimentally validated and predicted phage anti-defense
      proteins. Each entry is annotated with details about its relationship to known phage anti-defense systems.</p>

    <table id="myTable" >
      <tr>
        <th colspan="6">Phage Anti-defense Systems</th>
      </tr>
      <tr style="color: #00afff;font-size: large;">
        <td>anti-AVAST(3)</td>
        <td>anti-BREX(3)</td>
        <td>anti-CBASS(11)</td>
        <td>anti-CRISPR(186)</td>
        <td>anti-Dnd(2)</td>
        <td>anti-DSR(1)</td>
      </tr>
      <tr style="color: #00afff;font-size: large;">
        <td>anti-Gabija(7)</td>
        <td>anti-gasdermin(1)</td>
        <td>anti-Hachiman(5)</td>
        <td>anti-NAD+depletion(4)</td>
        <td>anti-O-antigen-based-barrier(3)</td>
        <td>anti-PARIS(1)</td>
      </tr>
      <tr style="color: #00afff;font-size: large;">
        <td>anti-PrrC(2)</td>
        <td>anti-Pycsar(5)</td>
        <td>anti-QS(2)</td>
        <td>anti-RecBCD(5)</td>
        <td>anti-retron(11)</td>
        <td>anti-RexAB(3)</td>
      </tr>
      <tr style="color: #00afff;font-size: large;">
        <td>anti-RM(65)</td>
        <td>anti-SOS(1)</td>
        <td>anti-TA(16)</td>
        <td>anti-Tab(1)</td>
        <td>anti-Tai(1)</td>
        <td>anti-Thoeris(16)</td>
      </tr>
      <tr style="color: #00afff;font-size: large;">
        <td>anti-TIR(1)</td>
        <td>anti-xenogeneic-silencing(3)</td>
        <td>broad-spectrum-counter-defense(2)</td>
        <td>counter-defense(1)</td>
        <td>Phage-encoded-CRISPR(21)</td>
        <td></td>
      </tr>
    </table>


    <h2 style="font-size: xx-large">Key Functions of PADF:</h2>

    <ul style="font-size: larger;letter-spacing: 2px;line-height: 35px;">
      <li>Offers a manually curated collection of experimentally validated phage anti-defense proteins, including their
        types, mechanisms, sequences, amino acid counts, PMD numbers, inhibited/modified proteins, source phages, and
        host bacteria.
      </li>
      <br>
      <li>Utilizes Hidden Markov Models to construct predicted seed models, enabling users to submit phage
        proteins/genomes for prediction of potential phage anti-defense systems and gene clusters.
      </li>
      <br>
      <li>Provides comprehensive information on anti-defense proteins and gene clusters found in phage genomes from the
        precomputed NCBI refseq database.
      </li>
      <br>
    </ul>
  </div>
</template>

<script>
export default {
  name: "Index",
  data() {
    return {
    }
  },
  mounted() {
    // 在组件挂载后立即初始化表格
    this.initializeTable();
  },
  methods: {
    initializeTable() {
      var table = document.getElementById("myTable");
      if (table) {
        var rows = table.getElementsByTagName("tr");

        // 从第二行开始，因为第一行是表头
        for (var i = 1; i < rows.length; i++) {
          var cells = rows[i].getElementsByTagName("td");
          for (var j = 0; j < cells.length; j++) {
            var cellText = cells[j].innerHTML;

            // 创建一个链接元素
            var link = document.createElement("a");
            link.className = "table-link"; // 确保使用正确的类名
            link.href = "#"; // 您可以根据需要设置实际的URL
            link.innerHTML = cellText;

            // 附加点击事件监听器
            link.onclick = (event) => {
              event.preventDefault(); // 阻止链接的默认行为（即导航）
              this.change(event.target.innerHTML);
            };

            // 用链接替换原来的单元格内容
            cells[j].innerHTML = "";
            cells[j].appendChild(link);
          }
        }
      } else {
        console.error("Table element not found");
      }
    },
    change(parameter) {
      // 在这里处理按钮点击事件
      this.$router.push({
        path: "/system/frontverified",
        query:{condition:parameter}
      })

    }
  }
  // 其他选项保持不变

}
</script>

<style scoped>
.container {
  width: 95vw;
  /*height: 100vh;*/
  padding: 2vh 10vw;

}
table {
  width: 100%;
  border-collapse: collapse;
  margin-top: 20px;
}
th, td {
  border: 1px solid #dddddd;
  text-align: center;
  padding: 10px;
}
th {
  background-color: #4CAF50;
  color: white;
  font-size: 1.2em;
}
tr:nth-child(even) {
  background-color: #f2f2f2;
}


.table-link {
  color: blue; /* 设置链接文字的颜色为蓝色 */
  text-decoration: underline; /* 添加下划线 */
  cursor: pointer; /* 鼠标悬停时显示为手指形状 */
  background: none; /* 无背景色 */
  border: none; /* 无边框 */
  padding: 0; /* 无内边距 */
  margin: 0; /* 无外边距 */
  font-family: inherit; /* 继承字体 */
  font-size: 1.1em; /* 字体稍大，您可以根据需要调整大小 */
  display: inline-block; /* 使得链接可以像文本一样内联显示 */
}

.table-link:hover {
  color: darkblue; /* 鼠标悬停时的颜色变化为深蓝色 */
}
</style>
