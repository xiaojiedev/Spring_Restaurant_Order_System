package com.zzy.dingdong_order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zzy.dingdong_order.common.result.PageResult;
import com.zzy.dingdong_order.common.result.Result;
import com.zzy.dingdong_order.entity.EmployeeEntity;
import com.zzy.dingdong_order.entity.vo.EmployeeVO;
import com.zzy.dingdong_order.mapper.EmployeeMapper;
import com.zzy.dingdong_order.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, EmployeeEntity> implements EmployeeService {
    @Resource
    private EmployeeMapper employeeMapper;
    @Override
    public PageResult pageQuery(EmployeeVO employeeVO) {
        //开始分页查询
        PageHelper.startPage(employeeVO.getPage(), employeeVO.getPageSize());
        Page<EmployeeEntity> page = employeeMapper.pageQuery(employeeVO);
        long total = page.getTotal();
        List<EmployeeEntity> records = page.getResult();
        return new PageResult(total, records);
    }
}
