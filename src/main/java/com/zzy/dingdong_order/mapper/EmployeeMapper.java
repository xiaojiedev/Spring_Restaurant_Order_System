package com.zzy.dingdong_order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.pagehelper.Page;
import com.zzy.dingdong_order.entity.EmployeeEntity;
import com.zzy.dingdong_order.entity.vo.EmployeeVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<EmployeeEntity> {
    /**
     * 员工分页查询
     * @param employeeVO
     * @return
     */
    Page<EmployeeEntity> pageQuery(EmployeeVO employeeVO);
}
