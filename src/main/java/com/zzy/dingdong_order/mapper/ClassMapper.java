package com.zzy.dingdong_order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.pagehelper.Page;
import com.zzy.dingdong_order.entity.ClassEntity;
import com.zzy.dingdong_order.entity.EmployeeEntity;
import com.zzy.dingdong_order.entity.vo.ClassVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ClassMapper extends BaseMapper<ClassEntity> {
    /**
     * 员工分页查询
     * @param classVO
     * @return
     */
    Page<ClassEntity> pageQuery(ClassVO classVO);
}
