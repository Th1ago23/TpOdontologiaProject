package com.tpodontologia.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.UUID;

@AllArgsConstructor
@ToString
@Data
@Entity
public class Adm {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Max(6)
    private int pin;
    private boolean active;

    public Long getId() {
        return id;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
