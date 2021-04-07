package com.abc.cwb.observer;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service
public class PublishService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;


    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    public void visitLog(String uri){
        System.out.println("========visit=========");

        publisher.publishEvent(new VisitEvent(this, uri));
    }
}
