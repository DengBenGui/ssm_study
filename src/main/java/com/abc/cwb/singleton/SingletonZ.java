package com.abc.cwb.singleton;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletonZ {

    public static final String INIT_PATH = "/data/wmas/file";
}
