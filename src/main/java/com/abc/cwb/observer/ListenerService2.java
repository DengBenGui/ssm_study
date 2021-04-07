package com.abc.cwb.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
public class ListenerService2 implements ApplicationListener<VisitEvent> {

    @Override
    public void onApplicationEvent(VisitEvent event) {
        System.out.println(event.getUri() + "访问过。。22");
    }
}
