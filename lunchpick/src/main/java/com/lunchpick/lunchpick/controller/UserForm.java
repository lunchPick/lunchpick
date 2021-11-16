package com.lunchpick.lunchpick.controller;

import com.lunchpick.lunchpick.domain.model.Place;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class UserForm {

    private String name;

    private int age;

    private String addressHome;
    private String addressCompany;
    private String email;
    private String phone;
    private List<Place> places = new ArrayList<>();
}
