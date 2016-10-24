package com.jeffzzf.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/test")
    public String testUrl(Model model) {
        model.addAttribute("title", "测试页");
        model.addAttribute("end", "测试结束");
        return "test";
    }

    @RequestMapping("/")
    public String indexUrl(Model model) {
        model.addAttribute("title", "首页");
        model.addAttribute("end", "首页束");
        return "test";
    }
}
