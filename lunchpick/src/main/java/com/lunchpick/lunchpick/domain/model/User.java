package com.lunchpick.lunchpick.domain.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String name;

    private int age;

    private String addressHome;

    private String addressCompany;

    private String email;

    private String phone;

    @OneToMany(mappedBy = "user")
    private List<Place> places = new ArrayList<>();
}