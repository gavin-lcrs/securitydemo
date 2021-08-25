package com.gavin.securitydemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gavin.securitydemo.mapper.SysUserMapper;
import com.gavin.securitydemo.model.entity.SysUser;
import com.gavin.securitydemo.service.ISysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author jiwen.cao
 * @Date 2021/8/25
 * @Description
 */
@Slf4j
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {
}

