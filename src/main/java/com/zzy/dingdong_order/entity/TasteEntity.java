package com.zzy.dingdong_order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 菜品口味
 */
@Data
@TableName("taste")
public class TasteEntity {
    private long id;
    private long dishId;
    private String name;
    private String value;
}
