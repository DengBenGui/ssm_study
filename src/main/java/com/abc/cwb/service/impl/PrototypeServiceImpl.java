package com.abc.cwb.service.impl;


import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeServiceImpl {

    public void print(){
        System.out.println(" 原型测试类。。。 ");
        ((PrototypeServiceImpl)AopContext.currentProxy()).addPrint();
    }
    public void addPrint(){
        System.out.println(" 原型测试类。。。 有后置通知 ");
    }

}
