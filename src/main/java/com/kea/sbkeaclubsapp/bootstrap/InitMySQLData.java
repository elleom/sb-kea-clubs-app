package com.kea.sbkeaclubsapp.bootstrap;

import com.kea.sbkeaclubsapp.model.Event;
import com.kea.sbkeaclubsapp.model.Organization;
import com.kea.sbkeaclubsapp.model.User;
import com.kea.sbkeaclubsapp.repositories.EventRepository;
import com.kea.sbkeaclubsapp.repositories.OrganizationRepository;
import com.kea.sbkeaclubsapp.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.sql.Date;

/**
 * @author el_le
 * @since 11/12/2021 18:30
 */
@Slf4j
@Component
@Profile({"dev"})
public class InitMySQLData implements ApplicationListener {

    private final EventRepository eventRepository;
    private final OrganizationRepository organizationRepository;
    private final UserRepository userRepository;

    public InitMySQLData(EventRepository eventRepository, OrganizationRepository organizationRepository, UserRepository userRepository) {
        this.eventRepository = eventRepository;
        this.organizationRepository = organizationRepository;
        this.userRepository = userRepository;
    }


    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {

        User user = User.builder()
                .id(1L)
                .name("Leo")
                .lastName("Martins")
                .password("password")
                .description("A student")
                .email("leo@email.com")
                .build();

        if (userRepository.count() < 1L) {
            userRepository.save(user);
        }

        Organization organization = organizationRepository.findById(20L).orElse(Organization.builder().id(1L).name("KEA FILMS").build());

        if (eventRepository.count() < 1) {
            log.debug("Adding test data");
            Event event = Event.builder()
                    .description("Bootstraped Event")
                    .userId(1L) //hardcoded
                    .type("Event")
                    .imageUrl("SomeURL")
                    .Location("Somewhere")
                    .organization(organization)
                    .endDate(new Date(20211230))
                    .startDate(new Date(20211231))
                    .build();
            eventRepository.save(event);
//
//
//            log.debug("Adding test data");
//            Event event2 = Event.builder()
//                    .description("Bootstraped Event 2")
//                    .userId(2L)
//                    .type("Event")
//                    .imageUrl("SomeURL 2")
//                    .Location("Somewhere")
//                    .organization(organization).endDate(new Date(20211230)).startDate(new Date(20211231)).build();
//            eventRepository.save(event);
//
        }


    }

}
