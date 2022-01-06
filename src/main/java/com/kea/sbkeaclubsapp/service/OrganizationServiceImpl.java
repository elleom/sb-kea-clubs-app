package com.kea.sbkeaclubsapp.service;

import com.kea.sbkeaclubsapp.model.Organization;
import com.kea.sbkeaclubsapp.repositories.OrganizationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author el_le
 * @since 05/01/2022 22:41
 */
@Service
public class OrganizationServiceImpl implements OrganizationService {

    private final OrganizationRepository organizationRepository;

    public OrganizationServiceImpl(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    @Override
    public List<Organization> getAllOrganizations() {
        List<Organization> organizations = organizationRepository.findAll();
        return organizations;
    }
}
