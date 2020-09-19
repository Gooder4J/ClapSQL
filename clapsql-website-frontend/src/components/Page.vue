<template>
  <el-container>
    <el-header>
      <el-row>
        <!--        <el-col :span="1">-->
        <!--          <el-image :src="ClapSQL"-->
        <!--          style="width: 5em; height: 5em"-->
        <!--          ></el-image>-->
        <!--        </el-col>-->
        <el-col :span="24">
          <el-menu :default-active="this.$route.path" router class="el-menu-demo" mode="horizontal" @select="handleSelect">
            <el-menu-item index="/">首页</el-menu-item>
            <el-menu-item index="2">教程</el-menu-item>
            <el-menu-item index="/api">API</el-menu-item>
            <el-menu-item index="/github">GitHub</el-menu-item>
            <el-menu-item index="/support-feedback">支持/反馈</el-menu-item>
          </el-menu>
        </el-col>
      </el-row>
    </el-header>
    <el-main>
      <slot></slot>
    </el-main>
    <el-footer></el-footer>
  </el-container>
</template>

<script>
export default {
  name: "Page"
}
</script>

<style scoped>

</style>
