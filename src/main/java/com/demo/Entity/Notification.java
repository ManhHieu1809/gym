package com.demo.WebsiteGym.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "notification")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String NotificationID;
    private String content;

    @ManyToOne
    @JoinColumn(name = "userID",nullable = false)
    private User user;

}
