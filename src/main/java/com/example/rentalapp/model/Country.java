package com.example.rentalapp.model;

import jakarta.persistence.*;

@Entity
public class Country {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String continent;

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

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}
