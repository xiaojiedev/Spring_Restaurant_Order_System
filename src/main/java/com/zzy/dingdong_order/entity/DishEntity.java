package com.zzy.dingdong_order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 菜品实体类
 */
@Data
@TableName("dish")
public class DishEntity {
    private long id;
    private String name;
    private long classId;
    private double price;
    private String image;
    private String description;
    private int status;
    private Date createTime;
    private Date updateTime;
}
