package com.kea.sbkeaclubsapp.controller;

import com.kea.sbkeaclubsapp.model.Event;
import com.kea.sbkeaclubsapp.service.EventServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author el_le
 * @since 11/12/2021 10:58
 */

@RequestMapping("/api/events/")
@RestController
public class EventController {

    private final EventServiceImpl eventService;

    public EventController(EventServiceImpl eventService) {
        this.eventService = eventService;
    }


    @GetMapping("{eventId}")
    public Event getSingleEvent(@PathVariable Long eventId) throws Exception {
        return eventService.findById(eventId);
    }

    @GetMapping
    public List<Event> getAllEvent(){
        //todo clear
        List<Event> eventsList = eventService.getEvents();
        return eventsList;
    }
}
