package org.example.springevents.controllers;

import lombok.RequiredArgsConstructor;
import org.example.springevents.generic.CustomEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/event")
public class GenericController {

    private final CustomEventPublisher publisher;

    @PostMapping("/trigger")
    public void triggerEvent() {
        publisher.publishEvent("Hello World");
    }
}
