package com.kea.sbkeaclubsapp.service;

import com.kea.sbkeaclubsapp.model.Event;
import com.kea.sbkeaclubsapp.model.Organization;
import com.kea.sbkeaclubsapp.repositories.EventRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

/**
 * @author el_le
 * @since 05/01/2022 23:04
 */
@SpringBootTest
class EventServiceImplTest {

    EventService eventService;

    @Mock
    EventRepository eventRepository;

    @BeforeEach
    void setUp() {
        eventService = new EventServiceImpl(eventRepository);
    }

    @Test
    void getEventsSortedByStartDate() {
        List<Event> events = Arrays.asList(new Event(), new Event(), new Event());
        when(eventRepository.findUpcomingFortnightEvents()).thenReturn(events);
        //when
        List<Event> array = eventService.getEventsSortedByStartDate();
        //then
        assertEquals(3, array.size());
    }

    @Test
    void findById() {
    }

    @Test
    void createNewEvent() {
    }

    @Test
    void updateEvent() {
    }

    @Test
    void deleteById() {
    }
}