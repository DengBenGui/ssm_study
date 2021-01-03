package com.abc.cwb.util;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.beans.ConstructorProperties;

/**
 * @author Administrator
 */
@Component
@Data
public class MyBeanCommonUtil {

    private int years;
    private boolean flag;
    private String name;

    @PostConstruct
    public void init(){

    }

    public MyBeanCommonUtil() {
    }

    @ConstructorProperties({"years", "flag", "name"})
    public MyBeanCommonUtil(int years, boolean flag, String name) {
        this.years = years;
        this.flag = flag;
        this.name = name;
    }

    public void print(){
        String propertie = ResourceConfigPropertiesResolve.getPropertie("wmas.test.file.path");
        System.out.println(propertie);
    }


}
