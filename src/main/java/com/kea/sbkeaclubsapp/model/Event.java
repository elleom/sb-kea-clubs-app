package com.kea.sbkeaclubsapp.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

/**
 * @author el_le
 * @since 08/12/2021 19:04
 */

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder

public class Event {


    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String userId;
    private String type;
    private String description;
    private String imageUrl;
    private Date startDate;
    private Date endDate;
    private String Location;

    @ManyToOne
    @JoinColumn(name = "organization_id")
    private Organization organization;

    public Organization getOrganization() {
        return organization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Event event = (Event) o;
        return id != null && Objects.equals(id, event.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
