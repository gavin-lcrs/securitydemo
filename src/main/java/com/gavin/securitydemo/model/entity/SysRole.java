package com.gavin.securitydemo.model.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.Column;

/**
 * @Author jiwen.cao
 * @Date 2021/8/25
 * @Description
 */
@Data
@TableName(value = "sys_role")
public class SysRole {

    @TableId
    private Integer id;

    @Column(name = "role_code")
    private String roleCode;

    @Column(name = "role_name")
    private String roleName;
}
