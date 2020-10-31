<template>
  <el-main>
  <mavon-editor
    :toolbars="toolbars"
    @imgAdd="handleEditorImgAdd"
    @imgDel="handleEditorImgDel"
    @change="change"
    @save="save"
    style="height:600px"
    v-model="content"
    ref=md
  />
    <mavon-editor
        class="md"
        :value="content"
        :subfield = "false"
        :defaultOpen = "'preview'"
        :toolbarsFlag = "false"
        :editable="false"
        :scrollStyle="true"
        :ishljs = "true"
    ></mavon-editor>

  </el-main>
</template>

<script>
export default {
  name: "MyMavonEditor",
  data: function(){
    return {
      toolbars: {
        bold: true, // 粗体
        italic: true, // 斜体
        header: true, // 标题
        underline: true, // 下划线
        strikethrough: true, // 中划线
        mark: true, // 标记
        superscript: true, // 上角标
        subscript: true, // 下角标
        quote: true, // 引用
        ol: true, // 有序列表
        ul: true, // 无序列表
        link: true, // 链接
        imagelink: true, // 图片链接
        code: false, // code
        table: true, // 表格
        fullscreen: true, // 全屏编辑
        readmodel: true, // 沉浸式阅读
        htmlcode: true, // 展示html源码
        help: true, // 帮助
        /* 1.3.5 */
        undo: true, // 上一步
        redo: true, // 下一步
        trash: true, // 清空
        save: true, // 保存（触发events中的save事件）
        /* 1.4.2 */
        navigation: true, // 导航目录
        /* 2.1.8 */
        alignleft: true, // 左对齐
        aligncenter: true, // 居中
        alignright: true, // 右对齐
        /* 2.2.1 */
        subfield: true, // 单双栏模式
        preview: true, // 预览
      },
      content: ""
    }
  },
  methods: {
    //监听markdown变化
    change(value, render) {
      console.log(value)
      console.log(render)
      // this.html = render;
      // this.blogInfo.blogMdContent = value;
      // this.blogInfo.blogContent = render;
    },

    // 保存的回调函数: value表示原文，render表示渲染后的html
    save(value, render){
      console.log(value)
      console.log(render)

      //axios默认发送application/json格式
      this.$axios.post("/api/save-article", {"content" : value}).then(() => {
        // 弹出窗口，表示保存成功
        this.$message({
          message: '保存成功',
          type: 'success',
          duration: 1000
        })
      }).catch(() => {
        this.$message.error('保存失败，请重新尝试')
      })
    },

    //上传图片接口pos 表示第几个图片
    handleEditorImgAdd(pos , $file){
      var formdata = new FormData();
      formdata.append('file' , $file);
      this.$axios
          .post("http://localhost:8000/blogs/image/upload/", formdata)
          .then(res => {
            var url = res.data.data;
            this.$refs.md.$img2Url(pos, url);  //这里就是引用ref = md 然后调用$img2Url方法即可替换地址
          });
    },
    handleEditorImgDel(){
      console.log('handleEditorImgDel');    //我这里没做什么操作，后续我要写上接口，从七牛云CDN删除相应的图片
    }
  }

}
</script>

<style scoped>

</style>
