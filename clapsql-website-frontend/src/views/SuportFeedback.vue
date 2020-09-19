<template>
  <page>
    <el-container>
      <el-aside>
        <el-image :src="AlipayQRCode" fit="fit"></el-image>
        <p>开源不易，觉得有所收获可以支付宝请作者喝杯淤泥波波奶茶</p>
        <el-image :src="WechatQRCode" fit="fit"></el-image>
        <p>有疑问的话，可以直接加作者个人微信，添加时请备注</p>
      </el-aside>
      <el-main>
        <div style="border-color: black; border-width: 100px">aaa</div>
      </el-main>
    </el-container>
  </page>
</template>

<script>
import AlipayQRCode from "@/assets/Huang Alipay QRcode.jpg"
import WechatQRCode from "@/assets/Huang Wechat QR code.jpg"
import Page from "@/components/Page";
export default {
  name: "SuportFeedback",
  components: {Page},
  data: function () {
    return {
      AlipayQRCode: AlipayQRCode,
      WechatQRCode: WechatQRCode
    }
  }
}
</script>

<style scoped>

</style>
