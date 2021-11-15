package com.lunchpick.lunchpick.controller;

import com.lunchpick.lunchpick.domain.model.Place;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class LoginForm {

    private String name;
    private String password;
}
