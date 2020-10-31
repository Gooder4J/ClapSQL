<template>
  <el-container>
    <el-main>
      <el-card>
        <el-input v-model="input" placeholder="请输入账号"></el-input>
        <el-input placeholder="请输入密码" v-model="input" show-password></el-input>
      </el-card>
    </el-main>
    <el-footer>

    </el-footer>
  </el-container>
</template>

<script>
export default {
  name: "login"
}
</script>

<style scoped>

</style>
