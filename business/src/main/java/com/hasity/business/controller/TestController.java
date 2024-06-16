package com.hasity.business.controller;


import com.hasity.business.domain.Demo;
import com.hasity.business.req.DemoQueryReq;
import com.hasity.business.resp.CommonResp;
import com.hasity.business.service.DemoService;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    @GetMapping("/query")
    public CommonResp<List<Demo>> query(@Valid DemoQueryReq demoQueryReq) {
        List<Demo> list = demoService.query(demoQueryReq);
        // CommonResp<List<Demo>> resp = new CommonResp<>();
        // resp.setContent(list);
        CommonResp<List<Demo>> resp = new CommonResp<>(list);
        return resp;
    }
}
