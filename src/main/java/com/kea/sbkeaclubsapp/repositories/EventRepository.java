package com.kea.sbkeaclubsapp.repositories;

import com.kea.sbkeaclubsapp.model.Event;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * @author el_le
 * @since 11/12/2021 16:35
 */

public interface EventRepository extends ReactiveCrudRepository<Event, Long> {
}
