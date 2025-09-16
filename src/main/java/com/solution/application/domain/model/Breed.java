package com.solution.application.domain.model;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Breed {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String description;

    @Column(name = "country_origin")
    private String countryOrigin;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(String countryOrigin) {
        this.countryOrigin = countryOrigin;
    }
}
