package com.gefuxing.proxytest.jdk.model.service;

import com.gefuxing.proxytest.jdk.model.User;

/**
 * @Author gefuxing
 * @create 2021/8/4 13:52
 */
public interface UserService {
    User findUserById(Integer id);

}
