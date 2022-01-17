package com.kea.sbkeaclubsapp.controller;

import com.kea.sbkeaclubsapp.model.Organization;
import com.kea.sbkeaclubsapp.service.OrganizationServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author el_le
 * @since 16/01/2022 19:48
 */

@RestController
@RequestMapping("/api/organizations/")
public class OrganizationController {

    private final OrganizationServiceImpl organizationService;

    public OrganizationController(OrganizationServiceImpl organizationService) {
        this.organizationService = organizationService;
    }

    @GetMapping
    public List<Organization> getAllOrganization() {
        return organizationService.getAllOrganizations();
    }


}
