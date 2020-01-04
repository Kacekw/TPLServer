package com.vestas.kawit.task_lists.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class OrderComponent {

    @Id @GeneratedValue
    private int id;
    @NotEmpty
    private String componentNo;
    @NotEmpty
    private String description;
    @NotEmpty
    private int requirement;
    @NotEmpty
    private String itemCategory;
    @NotEmpty
    private String operation;
    @NotEmpty
    private String reservation;

    public OrderComponent() {
    }

    public OrderComponent(@NotEmpty String componentNo, @NotEmpty String description, @NotEmpty int requirement, @NotEmpty String itemCategory, @NotEmpty String operation, @NotEmpty String reservation) {
        this.componentNo = componentNo;
        this.description = description;
        this.requirement = requirement;
        this.itemCategory = itemCategory;
        this.operation = operation;
        this.reservation = reservation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComponentNo() {
        return componentNo;
    }

    public void setComponentNo(String componentNo) {
        this.componentNo = componentNo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRequirement() {
        return requirement;
    }

    public void setRequirement(int requirement) {
        this.requirement = requirement;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getReservation() {
        return reservation;
    }

    public void setReservation(String reservation) {
        this.reservation = reservation;
    }
}
