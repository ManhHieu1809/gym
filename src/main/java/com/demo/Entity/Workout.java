package com.demo.WebsiteGym.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "workout")
@Getter
@Setter
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String WorkoutID;
    private String WorkoutName;
    private String Category;
    private String Instructions;

    @ManyToOne
    @JoinColumn(name = "planID",nullable = false)
    private WorkoutPlan workoutPlan;
}
