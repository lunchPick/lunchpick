package com.lunchpick.lunchpick.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class HomeController {

    @RequestMapping("/")
    public String home() {
        log.info("hi home controller !");
        return "home";
    }

    @RequestMapping("/locLunchPick")
    public String location() {
        return "content/location_lunch";
    }

    @RequestMapping("/myLunchPick")
    public String my() {
        return "content/my_lunch";
    }

    @RequestMapping("/ranLunchPick")
    public String random() {
        return "content/random_lunch";
    }
}
