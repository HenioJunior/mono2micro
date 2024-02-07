package org.acme.flight;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Flight extends PanacheEntity {

    long travelOrderId;
    String fromAirport;
    String toAirport;
}
