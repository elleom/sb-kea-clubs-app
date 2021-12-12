package com.kea.sbkeaclubsapp.controller;

import com.kea.sbkeaclubsapp.model.Event;
import com.kea.sbkeaclubsapp.repositories.EventRepository;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.*;

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
