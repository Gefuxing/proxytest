package com.gefuxing.proxytest.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @Author gefuxing
 * @create 2021/8/4 14:31
 */
public class MainTest {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserCglib.class);
        enhancer.setCallback(new UserCglbInterceptor());
        UserCglib userCglib = (UserCglib) enhancer.create();
        String gfx = userCglib.getName("gfx");
        Integer num = userCglib.getNum(0);
        System.out.println("cglib"+gfx+"-"+num);
    }
}
