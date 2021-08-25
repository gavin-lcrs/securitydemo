package com.gavin.securitydemo.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gavin.securitydemo.model.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author jiwen.cao
 * @Date 2021/8/25
 * @Description
 */
@Service("loginService")
public class LoginService {

    @Autowired
    private ISysUserService userService;

    public SysUser getUserByUsername(String userName){
        QueryWrapper<SysUser> wrapper = new QueryWrapper<>();
        wrapper.eq("user_name", userName);
        return userService.getOne(wrapper);
    }

}
