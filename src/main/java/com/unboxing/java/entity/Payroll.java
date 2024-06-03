package com.unboxing.java.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Payroll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    private double amount;
}
