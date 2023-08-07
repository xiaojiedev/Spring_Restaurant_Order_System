package com.zzy.dingdong_order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzy.dingdong_order.entity.DishEntity;
import com.zzy.dingdong_order.mapper.DishMapper;
import com.zzy.dingdong_order.service.DishService;
import org.springframework.stereotype.Service;

@Service
public class DishServiceImpl extends ServiceImpl<DishMapper, DishEntity> implements DishService {
}
