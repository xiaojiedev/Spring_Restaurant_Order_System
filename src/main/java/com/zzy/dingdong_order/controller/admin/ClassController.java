package com.zzy.dingdong_order.controller.admin;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.zzy.dingdong_order.common.result.Result;
import com.zzy.dingdong_order.entity.ClassEntity;
import com.zzy.dingdong_order.service.ClassService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/admin/class")
@Slf4j
@Api(tags = "分类相关接口", value = "分类相关接口")
public class ClassController {
    @Resource
    private ClassService classService;

    /**
     * 根据条件查询分类数据
     * @return
     */
    @ApiOperation("根据id查询分类数据")
    @GetMapping("/list")
    public ClassEntity list(Long id){
        return classService.getById(id);
    }
}
