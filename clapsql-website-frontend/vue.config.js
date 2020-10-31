// vue.config.js
module.exports = {
    devServer: {
        host: 'localhost',
        port: 8080,
        proxy: {
            '/api': {
                target: 'http://127.0.0.1:8081',// 要跨域的域名
                changeOrigin: true, // 是否开启跨域
                pathRewrite: {
                    "^/api": 'api'
                }
            }
        }



    }
}
