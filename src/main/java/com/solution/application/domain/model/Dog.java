package com.solution.application.domain.model;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Dog {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "breed_fk")
    private Breed breed;

    @ManyToOne
    @JoinColumn(name = "supplier_fk")
    private Supplier supplier;

    @Column(name = "badge_id")
    private String badgeId;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "birth_date")
    private LocalDateTime birthDate;

    @Enumerated(EnumType.STRING)
    private Status currentStatus;

    @Column(name = "leaving_date")
    private LocalDateTime leavingDate;

    @Enumerated(EnumType.STRING)
    private LeavingReason leavingReason;


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

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public String getBadgeId() {
        return badgeId;
    }

    public void setBadgeId(String badgeId) {
        this.badgeId = badgeId;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public Status getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(Status currentStatus) {
        this.currentStatus = currentStatus;
    }

    public LocalDateTime getLeavingDate() {
        return leavingDate;
    }

    public void setLeavingDate(LocalDateTime leavingDate) {
        this.leavingDate = leavingDate;
    }

    public LeavingReason getLeavingReason() {
        return leavingReason;
    }

    public void setLeavingReason(LeavingReason leavingReason) {
        this.leavingReason = leavingReason;
    }
}
