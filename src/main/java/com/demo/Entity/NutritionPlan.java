package com.demo.WebsiteGym.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "nutritionplan")
public class NutritionPlan {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private String nutritionID;
    private String nameNutritionPlan;
    private String description;
    private double calo;

    @ManyToOne
    @JoinColumn(name = "userID",nullable = false)
    private User user;
}
