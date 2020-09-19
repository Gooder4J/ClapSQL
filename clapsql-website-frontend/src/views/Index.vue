<template>
  <page>
    <div>
      <el-image :src="ClapSQL_wordart"></el-image>
      <el-row :gutter="20">
        <el-col span="6">
          <el-card>
            <el-image :src="Client"></el-image>
            <p class="introduce-sentence">客户端，无需考虑服务不可用问题</p>
          </el-card>
        </el-col>
        <el-col span="6">
          <el-card>
            <el-image :src="Light"></el-image>
            <p class="introduce-sentence">轻量级，不依赖底层系统，无需安装任何依赖，有Java的地方就能跑</p>
          </el-card>
        </el-col>
        <el-col span="6">
          <el-card>
            <el-image :src="Almighty"></el-image>
            <p class="introduce-sentence">全能型，除了基本的CRUD，还具备分表、异步、批处理等能力</p>
          </el-card>
        </el-col>
        <el-col span="6">
          <el-card>
            <el-image :src="Performance"></el-image>
            <p class="introduce-sentence">性能高，内部使用缓存和批处理机制减少IO操作，哈希分表减少单个表文件处理的数据量，快速定位数据</p>
          </el-card>
        </el-col>

      </el-row>
    </div>
  </page>
</template>

<script>
import ClapSQL_wordart from '@/assets/ClapSQL-wordart.png'
import ClapSQL from '@/assets/ClapSQL.png'
import Client from "@/assets/Client.png"
import Light from "@/assets/Light.png"
import Almighty from "@/assets/Almighty.png"
import Performance from "@/assets/Performance.png"
import Page from "@/components/Page"

export default {
  name: "Index",
  components: {Page},
  data: function () {
    return {
      ClapSQL_wordart: ClapSQL_wordart,
      ClapSQL: ClapSQL,
      Client: Client,
      Light: Light,
      Almighty: Almighty,
      Performance: Performance
    }
  }
}
</script>

<style scoped>
  .introduce-sentence {
    height: 4em;
  }
</style>
