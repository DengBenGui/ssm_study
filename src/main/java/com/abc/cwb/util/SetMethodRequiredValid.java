package com.abc.cwb.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 */
@Component
public class SetMethodRequiredValid {

    private String wmasVar;

    public String getWmasVar() {
        return ResourceConfigPropertiesResolve.getPropertie("wmasVar");
    }

    public void setWmasVar(String wmasVar) {
        this.wmasVar = wmasVar;
    }

}
