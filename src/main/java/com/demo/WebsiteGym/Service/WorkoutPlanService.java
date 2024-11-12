package com.demo.WebsiteGym.Service;

import com.demo.WebsiteGym.Model.WorkoutPlanDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WorkoutPlanService {
    List<WorkoutPlanDTO> getWorkoutPlan(String planName);
}
