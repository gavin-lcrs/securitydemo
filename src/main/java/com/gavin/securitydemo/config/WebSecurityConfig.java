package com.gavin.securitydemo.config;

import com.gavin.securitydemo.model.entity.SysUser;
import com.gavin.securitydemo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Objects;

/**
 * @Author jiwen.cao
 * @Date 2021/8/25
 * @Description
 */
@Configuration
public class WebSecurityConfig {

    @Autowired
    private LoginService loginService;

    @Bean
    public UserDetailsService userDetailsService() {
        return username -> {
            SysUser user = loginService.getUserByUsername(username);
            if (Objects.isNull(user)) {
                throw new UsernameNotFoundException("用户名未找到");
            }
            String password = user.getPw();
            PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
            String passwordAfterEncoder = passwordEncoder.encode(password);
            return User.withUsername(username).password(passwordAfterEncoder).roles("").build();
        };
    }
}
