package com.zzy.dingdong_order.service.impl;

import com.zzy.dingdong_order.entity.TestEntity;
import com.zzy.dingdong_order.mapper.TestMapper;
import com.zzy.dingdong_order.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements TestService {
    @Resource
    private TestMapper testMapper;
    @Override
    public void add(TestEntity testEntity) {
        testMapper.insert(testEntity);
    }
}
