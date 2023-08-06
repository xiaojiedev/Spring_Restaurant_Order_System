package com.zzy.dingdong_order.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 员工实体类
 */
@TableName("employee")
@Data
public class EmployeeEntity {
    private Long id;
    private String name;
    private String username;
    private String password;
    private String phone;
    private String idNumber;
    private int status;
    private Date createTime;
    private Date updateTime;
}
