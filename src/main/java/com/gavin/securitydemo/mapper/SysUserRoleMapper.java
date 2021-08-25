package com.gavin.securitydemo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.gavin.securitydemo.model.entity.SysUserRole;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author jiwen.cao
 * @Date 2021/8/25
 * @Description
 */
@Component
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {

    @Select("SELECT * FROM sys_user_role WHERE user_id = #{userId}")
    List<SysUserRole> listByUserId(@Param("userId") Integer userId);
}
