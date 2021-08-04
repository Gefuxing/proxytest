package com.gefuxing.proxytest.jdk.model.service.impl;

import com.gefuxing.proxytest.jdk.model.User;
import com.gefuxing.proxytest.jdk.model.service.UserService;

/**
 * @Author gefuxing
 * @create 2021/8/4 13:54
 */
public class UserServiceImpl implements UserService {
    @Override
    public User findUserById(Integer id) {
        return new User(id,"gfx");
    }
}
