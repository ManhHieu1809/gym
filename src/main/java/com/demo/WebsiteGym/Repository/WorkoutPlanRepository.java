package com.demo.WebsiteGym.Repository;

import com.demo.WebsiteGym.Entity.WorkoutPlan;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkoutPlanRepository {
    List<WorkoutPlan> getWorkoutPlan(String planName);
}
