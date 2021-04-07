package com.abc.cwb.observer;

import org.springframework.context.ApplicationEvent;

public class VisitEvent extends ApplicationEvent {

    private String uri;

    public VisitEvent(Object source) {
        super(source);
    }

    public VisitEvent(Object source, String uri) {
        super(source);
        this.uri = uri;
    }

    public String getUri() {
        return uri;
    }
}
