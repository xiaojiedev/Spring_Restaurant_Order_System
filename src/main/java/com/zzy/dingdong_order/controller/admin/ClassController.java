package com.zzy.dingdong_order.controller.admin;

import com.zzy.dingdong_order.common.result.PageResult;
import com.zzy.dingdong_order.common.result.Result;
import com.zzy.dingdong_order.entity.ClassEntity;
import com.zzy.dingdong_order.entity.vo.ClassVO;
import com.zzy.dingdong_order.service.ClassService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.time.LocalDateTime;

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

    @ApiOperation("新增分类")
    @PostMapping
    public Result<String> add(@RequestBody ClassEntity classEntity){
        classEntity.setCreateTime(LocalDateTime.now());
        classEntity.setUpdateTime(LocalDateTime.now());
        classService.save(classEntity);
        return Result.success("新增分类成功！");
    }

    /**
     * 根据id删除分类
     * @param id
     * @return
     */
    @DeleteMapping
    @ApiOperation("根据id删除分类")
    public Result<String> delete(Long id){
        classService.removeById(id);
        return Result.success("删除成功！");
    }

    /**
     * 分页查询分类
     * @param classVO
     * @return
     */
    @GetMapping("/page")
    @ApiOperation("分页查询分类")
    public Result<PageResult> page(ClassVO classVO){
        PageResult pageResult = classService.pageQuery(classVO);
        return Result.success(pageResult);
    }

    /**
     * 根据id修改分类信息
     * @param classEntity
     * @return
     */
    @PutMapping
    @ApiOperation("根据id修改分类信息")
    public Result<String> update(@RequestBody ClassEntity classEntity){
        classEntity.setUpdateTime(LocalDateTime.now());
        classService.updateById(classEntity);
        return Result.success("分类信息修改成功");
    }
}
