package com.kea.sbkeaclubsapp.repositories;

import com.kea.sbkeaclubsapp.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author el_le
 * @since 11/12/2021 16:35
 */

public interface EventRepository extends JpaRepository<Event, Long> {
}
