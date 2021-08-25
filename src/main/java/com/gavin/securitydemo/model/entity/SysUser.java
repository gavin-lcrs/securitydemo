package com.gavin.securitydemo.model.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import javax.persistence.Column;

/**
 * @Author jiwen.cao
 * @Date 2021/8/24
 * @Description
 */
@Data
@TableName(value = "sys_user")
public class SysUser {

    @TableId
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "pass_word")
    private String passWord;
}
