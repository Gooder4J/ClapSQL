package com.clapsql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

/**
 * @author Penggeor
 */
@Controller
public class TestController {
    @RequestMapping("/api/test")
    @ResponseBody
//    @CrossOrigin // 先在服务端解决跨域问题
    public String test(){
        System.out.println("+1");
        return "OK";
    }


    @PostMapping("/api/save-text")
    @ResponseBody
    @CrossOrigin
    public String saveText(@RequestBody String text) {
        // 处理JSON格式
        System.out.println(text);
        return "OK";
    }
}
