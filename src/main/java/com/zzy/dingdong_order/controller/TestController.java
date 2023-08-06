package com.zzy.dingdong_order.controller;

import com.zzy.dingdong_order.entity.TestEntity;
import com.zzy.dingdong_order.service.TestService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    private TestService testService;
    @PostMapping("/test1")
    public String add(@RequestBody TestEntity testEntity){
        testService.add(testEntity);
        return "ok";
    }
}
