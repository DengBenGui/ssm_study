package com.abc.cwb.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    public void print1(){
        System.out.println("----ClassFilter 不能AOP增强  print1----");
    }
    public void addPrint1(){
        System.out.println("----MethodFilter 不能AOP增强  addPrint1----");
    }
}
