package com.gefuxing.proxytest.cglib;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author gefuxing
 * @create 2021/8/4 14:25
 */
@AllArgsConstructor
@Data
public class UserCglib {
    public Integer getNum(int a) {
        return a;
    }

    public String getName(String name) {
        return  name;
    }
}
