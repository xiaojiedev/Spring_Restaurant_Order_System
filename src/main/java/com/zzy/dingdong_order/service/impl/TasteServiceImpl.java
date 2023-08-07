package com.zzy.dingdong_order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzy.dingdong_order.entity.TasteEntity;
import com.zzy.dingdong_order.mapper.TasteMapper;
import com.zzy.dingdong_order.service.TasteService;
import org.springframework.stereotype.Service;

@Service
public class TasteServiceImpl extends ServiceImpl<TasteMapper, TasteEntity> implements TasteService {
}
