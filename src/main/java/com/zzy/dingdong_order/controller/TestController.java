package com.zzy.dingdong_order.controller;

import com.zzy.dingdong_order.entity.TestEntity;
import com.zzy.dingdong_order.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Api("测试接口")
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {
    @Resource
    private TestService testService;

    @ApiOperation("测试接口1")
    @PostMapping("/test1")
    public String add(@RequestBody TestEntity testEntity){
        testService.add(testEntity);
        return "ok";
    }
}
