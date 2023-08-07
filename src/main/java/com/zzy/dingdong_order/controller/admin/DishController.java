package com.zzy.dingdong_order.controller.admin;

import com.zzy.dingdong_order.service.DishService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api("菜品相关接口")
@Slf4j
@RequestMapping("/admin/dish")
public class DishController {
    @Resource
    private DishService dishService;


}
