package com.zzy.dingdong_order.controller.admin;

import com.zzy.dingdong_order.service.TasteService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/admin/taste")
@Api("菜品口味相关接口")
@Slf4j
public class TasteController {
    @Resource
    private TasteService tasteService;
}
