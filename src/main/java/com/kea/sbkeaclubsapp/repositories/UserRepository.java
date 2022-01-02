package com.kea.sbkeaclubsapp.repositories;

import com.kea.sbkeaclubsapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author el_le
 * @since 01/01/2022 18:09
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
