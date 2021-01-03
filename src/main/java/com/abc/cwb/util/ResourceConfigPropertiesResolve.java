package com.abc.cwb.util;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Administrator
 * 根据key获取某个属性值
 */
@Component
public class ResourceConfigPropertiesResolve {

    // private ConcurrentHashMap<String, String> resourceMap = new ConcurrentHashMap<>();

    public static final String fileName = "/resourceConfig.properties";

    static Properties props;

    @PostConstruct
    public void init(){
        loadProps();
    }

    public static String getPropertie(String proKey){
        if (props == null) {
            loadProps();
        }
        return props.getProperty(proKey);
    }
    public static String getPropertie(String proKey, String defaultValue){
        if (props == null) {
            loadProps();
        }
        return props.getProperty(proKey, defaultValue);
    }

    synchronized static private void loadProps() {
        props = new Properties();
        try(InputStream in = ResourceConfigPropertiesResolve.class.getResourceAsStream(fileName)){
            props.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
