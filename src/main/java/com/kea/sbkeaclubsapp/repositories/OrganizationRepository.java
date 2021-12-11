package com.kea.sbkeaclubsapp.repositories;

import com.kea.sbkeaclubsapp.model.Organization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * @author el_le
 * @since 11/12/2021 16:36
 */

public interface OrganizationRepository extends ReactiveCrudRepository<Organization, Long> {
}
