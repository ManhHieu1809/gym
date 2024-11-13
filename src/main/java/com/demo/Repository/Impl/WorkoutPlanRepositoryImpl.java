package com.demo.WebsiteGym.Repository.Impl;

import com.demo.WebsiteGym.Entity.WorkoutPlan;
import com.demo.WebsiteGym.Repository.WorkoutPlanRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class WorkoutPlanRepositoryImpl implements WorkoutPlanRepository {

    static final String DB_URL = "jdbc:mysql://localhost:3306/gym";
    static final String USER = "root";
    static final String PASS = "";
    @Override
    public List<WorkoutPlan> getWorkoutPlan(String planName) {
        String query = "SELECT * FROM workout_plan WHERE plan_name = ?";
        return null;
    }
}
