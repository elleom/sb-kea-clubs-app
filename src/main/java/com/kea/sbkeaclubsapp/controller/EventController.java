package com.kea.sbkeaclubsapp.controller;

import com.kea.sbkeaclubsapp.model.Event;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author el_le
 * @since 11/12/2021 10:58
 */

@RequestMapping("/api/event/")
@RestController
public class EventController {

    @GetMapping("{eventId}")
    public Event getSingleEvent(@PathVariable Long eventId){
        Event event = Event.builder().id(1L).description("An event").build();
        return event;
    }
}
