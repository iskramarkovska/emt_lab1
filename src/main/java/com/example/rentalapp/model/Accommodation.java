package com.example.rentalapp.model;

import jakarta.persistence.*;

@Entity
public class Accommodation {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private Category category;
    @ManyToOne
    private Host host;

    private int numRooms;
    private boolean isRented;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }
}
