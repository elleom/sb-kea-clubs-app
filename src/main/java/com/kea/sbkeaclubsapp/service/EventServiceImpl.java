package com.kea.sbkeaclubsapp.service;

import com.kea.sbkeaclubsapp.model.Event;
import com.kea.sbkeaclubsapp.repositories.EventRepository;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.data.domain.Sort;
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
    public List<Event> getEvents() {
        List<Event> events = new ArrayList<>();
        eventRepository.findAll().iterator().forEachRemaining(events::add);
        return events;
    }

    @Override
    public List<Event> getEventsSortedByStartDate() {
        List<Event> events = new ArrayList<>();
        eventRepository.findAll(Sort.by("start_date"));
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
    public void deleteById(Long idToDelete) {

    }

    @Override
    public Event editById(Long l) {
        return null;
    }
}
