package com.lunchpick.lunchpick.controller;

import com.lunchpick.lunchpick.domain.model.User;
import com.lunchpick.lunchpick.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
public class HomeController {

    private final UserService userService;

    @RequestMapping("/")
    public String home() {
        log.info("hi home controller !");
        return "home";
    }

    @GetMapping(value = "/locLunchPick")
    public String LocationList(Model model) {
        User user = userService.findOne(1L);

        model.addAttribute("comLoc" , user.getAddressCompany());
        model.addAttribute("homeLoc" , user.getAddressHome());

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
