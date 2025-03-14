package org.example.springevents.generic;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class CustomEventPublisher {

    private final ApplicationEventPublisher applicationEventPublisher;

    public void publishEvent(String message) {
        GenericEvent<String> event = GenericEvent.<String>builder()
                .source(this)
                .data(message)
                .success(true)
                .build();
        applicationEventPublisher.publishEvent(event);
    }
}
