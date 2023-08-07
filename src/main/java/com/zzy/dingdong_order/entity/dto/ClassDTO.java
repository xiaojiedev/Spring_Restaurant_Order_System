package com.zzy.dingdong_order.entity.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ClassDTO implements Serializable {
    private long id;
    private String name;
    private int status;
}
