package com.ryan.cloud.auth.components;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * SimpleUserDetailsServiceImpl
 *
 * @author hkc
 * @version 1.0.0
 * @date 2021-01-26 16:51
 */
@Component
@Slf4j
public class SimpleUserDetailsServiceImpl implements UserDetailsService {

    @Resource
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        String password = passwordEncoder.encode("123456");

        return new User(username, password, AuthorityUtils.commaSeparatedStringToAuthorityList("client"));
    }
}
