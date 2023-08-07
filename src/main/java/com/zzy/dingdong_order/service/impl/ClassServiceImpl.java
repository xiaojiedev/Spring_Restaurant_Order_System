package com.zzy.dingdong_order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzy.dingdong_order.entity.ClassEntity;
import com.zzy.dingdong_order.mapper.ClassMapper;
import com.zzy.dingdong_order.service.ClassService;
import org.springframework.stereotype.Service;

@Service
public class ClassServiceImpl extends ServiceImpl<ClassMapper, ClassEntity> implements ClassService {
}
