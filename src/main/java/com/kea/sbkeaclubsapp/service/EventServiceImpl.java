package com.kea.sbkeaclubsapp.service;

import com.kea.sbkeaclubsapp.model.Event;
import com.kea.sbkeaclubsapp.repositories.EventRepository;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author el_le
 * @since 31/12/2021 18:41
 */
@Service
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<Event> getEventsSortedByStartDate() {
        List<Event> events = new ArrayList<>();
        events = eventRepository.findUpcomingFortnightEvents();
        return events;
    }

    @Override
    public Event findById(Long l) throws Exception {
        Optional<Event> event = eventRepository.findById(l);
        if (!event.isPresent()){
            throw new Exception("Handle better later");
        }
        return event.get(); //
    }

    @Override
    public Event createNewEvent(Event event) {
        Event newEvent = eventRepository.save(event);

        return newEvent;
    }

    @Override
    public Event updateEvent(Event event) {
        Event savedEvent = eventRepository.getById(event.getId());
        savedEvent.setImageUrl(event.getImageUrl());
        return eventRepository.save(savedEvent);
    }

    @Override
    public void deleteById(Long idToDelete) {
        eventRepository.deleteById(idToDelete);
    }

}
