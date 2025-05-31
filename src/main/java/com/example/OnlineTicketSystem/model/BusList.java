package com.example.OnlineTicketSystem.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "bus_list")
@Data
public class BusList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "bus_name")
    private String name;

    @Column(name = "from_location")
    private String from;

    @Column(name = "to_location")
    private String to;

    @Column(name = "time")
    private String time;

    @Column(name = "price")
    private String price;
}
