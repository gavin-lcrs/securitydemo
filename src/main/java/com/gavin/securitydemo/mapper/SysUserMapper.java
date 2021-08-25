package com.gavin.securitydemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gavin.securitydemo.model.entity.SysUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @Author jiwen.cao
 * @Date 2021/8/24
 * @Description
 */
@Component
public interface SysUserMapper extends BaseMapper<SysUser> {

    /**
     * 根据用户名查询用户
     * @param userName
     * @return
     */
    @Select("SELECT * FROM sys_user WHERE user_name = #{userName}")
    SysUser selectUserByName(@Param("userName") String userName);

    /**
     * 根据用户ID查询用户
     * @param id
     * @return
     */
    @Select("SELECT * FROM sys_user WHERE id = #{id}")
    SysUser selectUserById(String id);
}
