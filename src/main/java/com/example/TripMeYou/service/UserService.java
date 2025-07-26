package com.example.TripMeYou.service;


import com.example.TripMeYou.dto.SignUpRequest;
import com.example.TripMeYou.entity.User;
import com.example.TripMeYou.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public void signUp(SignUpRequest req){
        if(userRepository.existsByUserId(req.getUserId())){
            throw new IllegalArgumentException("이미 존재하는 아이디입니다. ");
        }


        User user =User.builder()
                .userId(req.getUserId())
                .userName(req.getUserName())
                .userPassword(req.getUserPassword())
                .userEmail(req.getUserEmail())
                .userTel(req.getUserTel())
                .createdDate(LocalDateTime.now())
                .build();


        userRepository.save(user);
    }
}
