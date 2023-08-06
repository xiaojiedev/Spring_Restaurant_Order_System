package com.zzy.dingdong_order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzy.dingdong_order.entity.EmployeeEntity;
import com.zzy.dingdong_order.mapper.EmployeeMapper;
import com.zzy.dingdong_order.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, EmployeeEntity> implements EmployeeService {
}
