package com.abc.cwb.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletonB {

    @Autowired
    private SingletonA singletonA;

    public void print(){
        System.out.println("Singleton circular reference:" + this);
    }
}
