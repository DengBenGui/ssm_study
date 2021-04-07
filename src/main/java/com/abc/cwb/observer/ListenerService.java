package com.abc.cwb.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ListenerService implements ApplicationListener<VisitEvent> {

    @Override
    @Async
    public void onApplicationEvent(VisitEvent event) {
        int a = 5/0;
        System.out.println(event.getUri() + "访问过。。");
    }
}
