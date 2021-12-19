package com.lunchpick.lunchpick.service;

import com.lunchpick.lunchpick.controller.KaKaoResponseDTO;
import com.lunchpick.lunchpick.service.externalAPI.KakaoAPI;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class LocationService {

    private final KakaoAPI kakaoAPI;

    public KaKaoResponseDTO getRestaurant() {
        return kakaoAPI.getRestaurant();
    }

}
