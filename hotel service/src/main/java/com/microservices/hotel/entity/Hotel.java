package com.microservices.hotel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "hotels")
public class Hotel {

    @Id
    private  String hotelId;

    private String name;

    private String location;

    private String about;

}
