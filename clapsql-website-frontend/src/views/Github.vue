<template>
  <page>
    <div class="img_div">
      <img :src="github" >
      <a :href="githubUrl">
        <div class="mask">
          <h3>点击跳转至Github项目</h3>
        </div>
      </a>
      <p>请点击图片</p>
    </div>
  </page>
</template>

<script>
import Page from "@/components/Page"
import github from "@/assets/github logo.png"
export default {
  name: "Github",
  components: {Page},
  data: function () {
    return {
      github: github,
      githubUrl: "https://github.com/totoro-dev/ClapSQL",
      display: true
    }
  },
  methods: {
    showMask: function () {
      this.display=true
      console.log("展示遮罩层")
    },
    hideMask: function () {
      this.display=false
      console.log("隐藏遮罩层")
    }
  }
}
</script>

<style scoped>
  .img_div {
    margin: 20px auto;
    position: relative;
    width: 531px;
    height: 354px;
  }
  img{
    width: 100%;
    height: 100%;
  }
  .mask {
    position: absolute;
    top: 0;
    left: 0;
    width: 531px;
    height: 354px;
    background: rgba(101, 101, 101, 0.6);
    color: #ffffff;
    opacity: 0;
  }
  .mask h3 {
    text-align: center;
  }

  .img_div a:hover .mask {
    opacity: 1;
  }
</style>
