package com.kea.sbkeaclubsapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author el_le
 * @since 08/12/2021 19:14
 */
@Entity
public class Organization {

    @Id
    private Long id;
    private String name;




}
