package com.kea.sbkeaclubsapp.controller;

import com.kea.sbkeaclubsapp.model.Event;
import com.kea.sbkeaclubsapp.repositories.EventRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author el_le
 * @since 11/12/2021 10:58
 */

@RequestMapping("/api/events/")
@RestController
public class EventController {

    private final EventRepository eventRepository;

    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @GetMapping("{eventId}")
    public Event getSingleEvent(@PathVariable Long eventId){
        return eventRepository.findById(eventId).get();
    }

    @GetMapping
    public List<Event> getAllEvent(){
        List<Event> eventsList = new ArrayList<>();
        eventRepository.findAll().forEach(eventsList::add);
        return eventsList;
    }
}
