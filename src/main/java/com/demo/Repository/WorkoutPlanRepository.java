package com.demo.WebsiteGym.Repository;

import com.demo.WebsiteGym.Entity.WorkoutPlan;

import java.util.List;


public interface WorkoutPlanRepository {
    List<WorkoutPlan> getWorkoutPlan(String planName);
}
