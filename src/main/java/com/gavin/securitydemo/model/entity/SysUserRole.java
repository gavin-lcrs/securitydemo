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
@TableName(value = "sys_user_role")
public class SysUserRole {

    @TableId
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "role_id")
    private Integer roleId;
}
