package com.gavin.securitydemo.controller;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gavin.securitydemo.model.entity.SysUser;
import com.gavin.securitydemo.service.ISysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author jiwen.cao
 * @Date 2021/8/25
 * @Description
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ISysUserService sysUserService;

    @GetMapping("/getuser")
    public String getUser(String userName){
        SysUser user = sysUserService.getOne(new QueryWrapper<SysUser>().eq("user_name", userName));
        log.info("{}", JSON.toJSON(user));
        return "SUCCESS";
    }
}
