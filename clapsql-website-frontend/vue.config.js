// vue.config.js
module.exports = {
    devServer: {
        host: 'localhost',
        port: 8080,
        proxy: {
            '/api': {
                target: 'http://localhost:8081',// 要跨域的域名
                changeOrigin: true, // 是否开启跨域
                pathRewrite: {
                    "^/api": ''
                }
            }
        }
    }
}
