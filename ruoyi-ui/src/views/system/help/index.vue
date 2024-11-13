<template>
  <div class="container" style="font-family: 'Times New Roman'">
    <h2 style="font-size: xx-large">Home</h2>

    <p style="font-size: larger;letter-spacing: 2px;line-height: 35px;text-indent: 50px;">
      The "Home" page of PADF provides a list of phage anti-defense systems in order.
      Users can click on the name of a anti-defense system to go to the anti-defense protein page for that system.
    </p>
    <div style="padding: 10px;width: 100%; font-size: medium;text-align: center;">
      <el-image
        style="width: 100%; "
        src="https://i.postimg.cc/QthxBFpQ/0.png"
        fit="contain">
      </el-image>
      <br>
    </div>



    <h2 style="font-size: xx-large">Verified</h2>

    <p style="font-size: larger;letter-spacing: 2px;line-height: 35px;text-indent: 50px;">
      The “Verified” page of PADF provides a list of experimentally verified phage anti-defense proteins that can be browsed and sorted.
    </p>


    <div style="padding: 10px;width: 100%; font-size: medium;text-align: center;">
      <el-image
        style="width: 100%; "
        src="https://i.postimg.cc/44wn9Q2m/2.png"
        fit="contain">
      </el-image>
      <br>
    </div>


    <h2 style="font-size: xx-large">Predicted</h2>

    <p style="font-size: larger;letter-spacing: 2px;line-height: 35px;text-indent: 50px;">
      The “Predicted” page of PADF provides a pre-calculated list of potential anti-defense proteins in the phage genome,
      which can be browsed and sorted. Users can click on Protein, Genome, and Anti-defense Gene Clusters to browse the list of phage anti-defense proteins,
      the list of anti-defensesystems on the phage genome, and the list of anti-defense gene clusters in the phage genome, respectively.
    </p>

    <div style="padding: 10px;width: 100%; font-size: medium;text-align: center;">
      <el-image
        style="width: 100%; "
        src="https://i.postimg.cc/zGvhBcJz/3.png"
        fit="contain">
      </el-image>
      <br>
    </div>
    <div style="padding: 10px;width: 100%; font-size: medium;text-align: center;">
      <el-image
        style="width: 100%; "
        src="https://www.helloimg.com/i/2024/10/28/671f63315fd0b.png"
        fit="contain">
      </el-image>
      <br>
    </div>
    <div style="padding: 10px;width: 100%; font-size: medium;text-align: center;">
      <el-image
        style="width: 100%; "
        src="https://www.helloimg.com/i/2024/10/28/671f634fede09.png"
        fit="contain">
      </el-image>
      <br>
    </div>


    <h2 style="font-size: xx-large">Search</h2>

    <p style="font-size: larger;letter-spacing: 2px;line-height: 35px;text-indent: 50px;">
      The “Search” page of PADF provides several search options for experimentally validated and predicted anti-defense proteins. Including System family,
      ID, Protein, Inhibited Type, Phage, Host and Length, users can select different options to search by keywords in the search box. Taking anti-RM and
      Escherichia coli as examples, the search results show the results searched in experimentally validated anti-defense proteins and predicted anti-defense
      proteins, respectively.
    </p>


    <div style="padding: 10px;width: 100%; font-size: medium;text-align: center;">
      <el-image
        style="width: 100%; "
        src="https://www.helloimg.com/i/2024/10/28/671f63d64399b.png"
        fit="contain">
      </el-image>
      <br>
    </div>

    <h2 style="font-size: xx-large">Prediction</h2>

    <p style="font-size: larger;letter-spacing: 2px;line-height: 35px;text-indent: 50px;">
      The "Prediction" page of PADF predicts phage proteins or potential anti-defense proteins in the phage genome using predictors based on Hidden Markov Models.
      Allows the user to upload fasta format files of proteins or nucleotides, and the results of the run will be sent to the user's e-mail address.
    </p>
    <div style="padding: 10px;width: 100%; font-size: medium;text-align: center;">
      <el-image
        style="width: 100%; "
        src="https://i.postimg.cc/pLjNVsdx/057ebbbbd95210d803f064565a6baa7.png"
        fit="contain">
      </el-image>
      <br>
    </div>



  </div>
</template>

<script>
export default {
  name: "Index",
  data() {
    return {
      url: 'https://i.postimg.cc/659JF2bD/c18894b33b4bf2c6da7e2a2c4bf022d.png',
      srcList: [
        'https://i.postimg.cc/659JF2bD/c18894b33b4bf2c6da7e2a2c4bf022d.png'
      ]
    }
  }
}
</script>

<style scoped>
.container {
  width: 95vw;
  padding: 1vh 10vw;
}

</style>
