package org.example.springevents.generic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
public class GenericEventListener {

    @EventListener
    public void handleGenericEvent(GenericEvent<String> event) {
        System.out.println("Received event with data: " + event.getData());
        System.out.println("Success: " + event.isSuccess());
    }
}
