package com.kea.sbkeaclubsapp.service;

import com.kea.sbkeaclubsapp.model.Event;

import java.util.List;

/**
 * @author el_le
 * @since 31/12/2021 18:39
 */
public interface EventService {

    List<Event> getEventsSortedByStartDate();

    Event findById(Long l) throws Exception; // todo probably not needed

    Event createNewEvent(Event event);

    Event updateEvent(Event event);

    void deleteById(Long idToDelete);

}
