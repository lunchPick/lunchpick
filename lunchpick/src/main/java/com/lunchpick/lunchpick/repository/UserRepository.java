package com.lunchpick.lunchpick.repository;

import com.lunchpick.lunchpick.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    private final EntityManager em;

    public User findOne(Long id) {
        return em.find(User.class, id);
    }
}
