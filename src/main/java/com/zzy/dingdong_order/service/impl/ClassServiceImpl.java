package com.zzy.dingdong_order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zzy.dingdong_order.common.result.PageResult;
import com.zzy.dingdong_order.entity.ClassEntity;
import com.zzy.dingdong_order.entity.EmployeeEntity;
import com.zzy.dingdong_order.entity.vo.ClassVO;
import com.zzy.dingdong_order.entity.vo.EmployeeVO;
import com.zzy.dingdong_order.mapper.ClassMapper;
import com.zzy.dingdong_order.service.ClassService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClassServiceImpl extends ServiceImpl<ClassMapper, ClassEntity> implements ClassService {
    @Resource
    private ClassMapper classMapper;
    @Override
    public PageResult pageQuery(ClassVO classVO) {
        //开始分页查询
        PageHelper.startPage(classVO.getPage(), classVO.getPageSize());
        Page<ClassEntity> page = classMapper.pageQuery(classVO);
        long total = page.getTotal();
        List<ClassEntity> records = page.getResult();
        return new PageResult(total, records);
    }
}
