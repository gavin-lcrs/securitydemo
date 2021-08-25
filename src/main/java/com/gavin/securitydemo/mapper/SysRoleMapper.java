package com.gavin.securitydemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gavin.securitydemo.model.entity.SysRole;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @Author jiwen.cao
 * @Date 2021/8/25
 * @Description
 */
@Component
public interface SysRoleMapper extends BaseMapper<SysRole> {

    @Select("SELECT * FROM sys_role WHERE id = #{id}")
    SysRole selectRoleById(String id);
}
