package com.zzy.dingdong_order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 菜品分类
 */
@Data
@TableName("class")
public class ClassEntity {
    private long id;
    private String name;
    private int status;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
