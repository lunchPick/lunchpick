package com.lunchpick.lunchpick.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class UserController {

    @GetMapping("/users/new")
    public String CreateUserForm(Model model) {
        model.addAttribute("userForm", new UserForm());
        return "users/createUserForm";
    }

    @GetMapping("/users/login")
    public String CreateLoginForm(Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "users/loginForm";
    }
}
