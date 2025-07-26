package com.example.TripMeYou.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class SignUpRequest {
    @NotBlank
    private String userId;

    @NotBlank
    private String userName;

    @NotBlank
    private String userPassword;

    @NotBlank
    private String userEmail;


    private String userTel;

}
