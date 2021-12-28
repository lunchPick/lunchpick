package com.lunchpick.lunchpick.controller;

import com.lunchpick.lunchpick.domain.model.User;
import com.lunchpick.lunchpick.service.LocationService;
import com.lunchpick.lunchpick.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class PickController {

    private final LocationService locationService;
    private final UserService userService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public KaKaoResponseDTO getRest() {

        // 로그인한 회원이 첫 번째임을 가정
       User user = userService.findOne(1L);

        return locationService.getRestaurant(user);
    }
}
