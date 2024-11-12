package com.demo.WebsiteGym.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "workoutplan")
public class WorkoutPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String planID;
    private String planName;
    private String description;
    private String duration;

    @ManyToOne
    @JoinColumn(name = "userID",nullable = false)
    private User user;

    @OneToMany(mappedBy = "workoutPlan",cascade = CascadeType.ALL)
    private List<Workout> workouts;
}
