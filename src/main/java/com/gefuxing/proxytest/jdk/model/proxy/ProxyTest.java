package com.gefuxing.proxytest.jdk.model.proxy;

import com.gefuxing.proxytest.jdk.model.User;
import com.gefuxing.proxytest.jdk.model.service.UserService;
import com.gefuxing.proxytest.jdk.model.service.impl.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author gefuxing
 * @create 2021/8/4 13:56
 *
 */
public class ProxyTest {
    public static void main(String[] args) {
        /**
         * jdk动态代理
         */
        UserService userService = new UserServiceImpl();
        InvocationHandler handler = new MyInvocationHandler<UserService>(userService);

        UserService proxy= (UserService) Proxy.newProxyInstance(UserService.class.getClassLoader(), new Class[]{UserService.class}, handler);

        User userById = proxy.findUserById(1);
        System.out.println(userById.toString());
        /**
         * cglib动态代理
         */
    }
}
