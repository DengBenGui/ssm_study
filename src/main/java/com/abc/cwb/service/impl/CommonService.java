package com.abc.cwb.service.impl;


import org.springframework.stereotype.Service;

@Service
public class CommonService {

    public void reflect(){
        System.out.println("AOP类过滤测试");
    }

    public void addReflect(){
        System.out.println("AOP类过滤测试  需要增强最终通知");
    }
}
