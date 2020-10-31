package com.clapsql.controller;

import com.alibaba.fastjson.JSON;
import com.clapsql.pojo.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 鹏哥儿
 */
@Controller
public class ArticleController {
    @PostMapping("/api/save-article")
    @ResponseBody
    public String saveText(@RequestBody String articleJson) {
        // 处理JSON格式
        System.out.println(articleJson);

        Article article = JSON.parseObject(articleJson, Article.class);
        System.out.println(article);

        return "OK";
    }
}
