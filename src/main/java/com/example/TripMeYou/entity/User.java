package com.example.TripMeYou.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="users")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="user_id",nullable = false,unique = true,length = 100)
    private String userId;

    @Column(name="user_name", nullable = false,length = 100)
    private String userName;

    @Column(name = "user_password", nullable = false, length = 255)
    private String userPassword;

    @Column(name = "user_email", nullable = false, length = 255)
    private String userEmail;

    @Column(name = "user_tel", length = 50)
    private String userTel;

    @Column(name="created_date", nullable = false)
    private java.time.LocalDateTime createdDate;

}
