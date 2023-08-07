package com.zzy.dingdong_order.entity.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class ClassVO implements Serializable {
    //分页名称
    private String name;

    //页码
    private int page;

    //每页显示记录数
    private int pageSize;
}
