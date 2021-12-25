package com.lunchpick.lunchpick.service;

import com.lunchpick.lunchpick.domain.model.User;
import com.lunchpick.lunchpick.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User findOne(Long userId) {
        return userRepository.findOne(userId);
    }
}
