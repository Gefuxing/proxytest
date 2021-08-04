package com.gefuxing.proxytest.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author gefuxing
 * @create 2021/8/4 14:27
 */
public class UserCglbInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("cglib代理方法");
        return invoke;
    }
}
