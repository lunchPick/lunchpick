package com.lunchpick.lunchpick;

import com.lunchpick.lunchpick.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

@Component
@RequiredArgsConstructor
public class InitDb {

    private final InitService initService;

    @PostConstruct
    public void init() {
        initService.dbInit();
    }

    @RequiredArgsConstructor
    @Component
    @Transactional
    static class InitService {

        private final EntityManager em;

        public void dbInit() {
            User user = new User();
            user.setAge(30);
            user.setAddressCompany("서울 여의도구");
            user.setAddressHome("서울 서대문구 이화여대1안길");
            em.persist(user);
        }
    }
}
