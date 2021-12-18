package com.lunchpick.lunchpick.service;

import com.lunchpick.lunchpick.service.externalAPI.KakaoAPI;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class LocationService {

    private final KakaoAPI kakaoAPI;

    public String getRestaurant() {
        return kakaoAPI.getRestaurant();
    }


}
