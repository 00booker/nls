package com.hasity.business.controller;


import com.hasity.business.service.DemoService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Resource
    private DemoService demoService;
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/count")
    public String count() {
        return demoService.count() + "";
    }
}
