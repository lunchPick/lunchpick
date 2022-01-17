package com.lunchpick.lunchpick.api;

import com.lunchpick.lunchpick.controller.KaKaoResponseDTO;
import com.lunchpick.lunchpick.domain.model.User;
import com.lunchpick.lunchpick.service.LocationService;
import com.lunchpick.lunchpick.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequiredArgsConstructor
public class PickApiController {

    private final LocationService locationService;
    private final UserService userService;

    @RequestMapping(value = "/LocationPick", method = RequestMethod.GET)
    @ResponseBody
    public String getRest() {

        // 로그인한 회원이 첫 번째임을 가정함
        User user = userService.findOne(1L);
        KaKaoResponseDTO list = locationService.getRestaurant(user);

        int size = list.documents.length;
        Random rd = new Random();

        int idx = rd.nextInt(size - 1);

        return list.documents[idx].place_name;
    }
}
