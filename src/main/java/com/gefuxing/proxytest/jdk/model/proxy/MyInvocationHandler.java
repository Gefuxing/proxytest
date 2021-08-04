package com.gefuxing.proxytest.jdk.model.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author gefuxing
 * @create 2021/8/4 14:03
 */
public class MyInvocationHandler<T> implements InvocationHandler {
    private T targe;

    public MyInvocationHandler(T targe) {
        this.targe = targe;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(targe, args);
        return invoke;
    }
}
