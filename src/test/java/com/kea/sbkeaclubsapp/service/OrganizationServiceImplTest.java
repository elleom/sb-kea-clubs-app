package com.kea.sbkeaclubsapp.service;

import com.kea.sbkeaclubsapp.model.Organization;
import com.kea.sbkeaclubsapp.repositories.OrganizationRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

/**
 * @author el_le
 * @since 05/01/2022 22:48
 */

@SpringBootTest
class OrganizationServiceImplTest {

    OrganizationService organizationService;

    @Mock
    OrganizationRepository organizationRepository;

    @BeforeEach
    void setUp() {
        organizationService = new OrganizationServiceImpl(organizationRepository);
    }

    @DisplayName("Unit: Test Organizations Repository-Service")
    @Test
    void getAllOrganizations() {

        //given
        List<Organization> organizations = Arrays.asList(new Organization(), new Organization(), new Organization());
        when(organizationRepository.findAll()).thenReturn(organizations);
        //when
        List<Organization> array = organizationService.getAllOrganizations();
        //then
        assertEquals(3, array.size());
    }
}