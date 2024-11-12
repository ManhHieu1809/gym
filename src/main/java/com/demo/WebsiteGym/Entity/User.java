package com.demo.WebsiteGym.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;
    private String userName;
    private String userPassword;
    private String email;
    private String fullName;
    private int age;
    private String gender;
    private double height;
    private double weight;
    @Enumerated(EnumType.STRING)
    private Role roles;

    public enum Role {
        ADMIN, CUSTOMER, TRAINER
    }

    // Quan hệ một-nhiều với WorkoutPlan
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<WorkoutPlan> workoutPlans;

    // Quan hệ một-nhiều với NutritionPlan
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<NutritionPlan> nutritionPlans;

    // Quan hệ một-nhiều với Notification
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Notification> notifications;

    // Quan hệ một-nhiều với Orders
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Orders> orders;

    // Quan hệ một-nhiều với FavoriteTopic
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<FavoriteTopic> favoriteTopics;

    // Quan hệ một-nhiều với PaymentMethod
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<PaymentMethod> paymentMethods;

    // Quan hệ một-nhiều với Progress
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Progress> progresses;
}
