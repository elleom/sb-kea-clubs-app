package com.kea.sbkeaclubsapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author el_le
 * @since 01/01/2022 18:10
 */
@Entity
@Slf4j
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String lastName;
    private String email;
    private String description;
    private String password;

}
