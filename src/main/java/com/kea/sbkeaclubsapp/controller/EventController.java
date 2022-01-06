package com.kea.sbkeaclubsapp.controller;

import com.kea.sbkeaclubsapp.model.Event;
import com.kea.sbkeaclubsapp.service.EventServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        List<Event> eventsList = eventService.getEventsSortedByStartDate();
        return eventsList;
    }

    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        Event newEvent = eventService.createNewEvent(event);
        return newEvent;
    }

    @DeleteMapping("{eventId}")
    public void deleteEvent(@PathVariable Long eventId) throws Exception {
        Event savedEvent = eventService.findById(eventId);
        eventService.deleteById(savedEvent.getId());
    }

    @PutMapping()
    public Event updateEvent(@RequestBody Event event) {
        return eventService.updateEvent(event);
    }
}
