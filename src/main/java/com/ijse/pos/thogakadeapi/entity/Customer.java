package com.ijse.pos.thogakadeapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // auto boxing --> int 10  --> Integer 10
    @NonNull
    private String name;
    @NonNull
    private String address;
    @Column(name = "salary")
    private double salary;
}
