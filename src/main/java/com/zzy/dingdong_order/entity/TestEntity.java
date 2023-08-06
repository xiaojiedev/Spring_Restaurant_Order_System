package com.zzy.dingdong_order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("class")
public class TestEntity {
    private Long id;
    private String name;
    private int status;
    private Date createTime;
    private Date updateTime;
}
