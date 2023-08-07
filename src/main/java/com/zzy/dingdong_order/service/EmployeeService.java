package com.zzy.dingdong_order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzy.dingdong_order.common.result.PageResult;
import com.zzy.dingdong_order.entity.EmployeeEntity;
import com.zzy.dingdong_order.entity.vo.EmployeeVO;

public interface EmployeeService extends IService<EmployeeEntity> {
    /**
     * 员工分页查询
     * @param employeeVO
     * @return
     */
    PageResult pageQuery(EmployeeVO employeeVO);
}
