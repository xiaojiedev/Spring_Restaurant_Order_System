package com.zzy.dingdong_order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zzy.dingdong_order.common.result.PageResult;
import com.zzy.dingdong_order.entity.ClassEntity;
import com.zzy.dingdong_order.entity.vo.ClassVO;

public interface ClassService extends IService<ClassEntity> {
    /**
     * 员工分页查询
     * @param classVO
     * @return
     */
    PageResult pageQuery(ClassVO classVO);
}
