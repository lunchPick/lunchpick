package com.lunchpick.lunchpick.controller;

import com.lunchpick.lunchpick.domain.model.User;
import com.lunchpick.lunchpick.service.LocationService;
import com.lunchpick.lunchpick.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequiredArgsConstructor
public class PickController {

    private final LocationService locationService;
    private final UserService userService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String getRest(Model model) {

        // 로그인한 회원이 첫 번째임을 가정함(나중에 스프링 시큐리티 적용)
        User user = userService.findOne(1L);

        KaKaoResponseDTO list = locationService.getRestaurant(user);

        int size = list.documents.length;
        Random rd = new Random();

        int idx = rd.nextInt(size - 1);


        // 이 부분 넘기는 작업해야 함.
        return list.documents[idx].place_name;
    }



}
