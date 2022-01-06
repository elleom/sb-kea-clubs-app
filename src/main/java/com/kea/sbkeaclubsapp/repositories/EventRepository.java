package com.kea.sbkeaclubsapp.repositories;

import com.kea.sbkeaclubsapp.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author el_le
 * @since 11/12/2021 16:35
 */

public interface EventRepository extends JpaRepository<Event, Long> {

    @Query(value = "select e.* from event e where e.start_date between CURRENT_DATE AND ADDDATE(CURRENT_DATE, INTERVAL 2 WEEK )",
            nativeQuery = true)
    List<Event> findUpcomingFortnightEvents();
}
