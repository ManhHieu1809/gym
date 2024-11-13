package com.demo.WebsiteGym.api;

import com.demo.WebsiteGym.Model.WorkoutPlanDTO;
import com.demo.WebsiteGym.Service.WorkoutPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorkoutPlanApi {
    @Autowired
    private WorkoutPlanService WorkoutPlanService;
    @GetMapping("/workoutplan")
    public List<WorkoutPlanDTO> WorkoutPlan(@RequestParam(value = "planName", required = false) String planName) {
        List<WorkoutPlanDTO> result = WorkoutPlanService.getWorkoutPlan(planName);
        return result;
    }
}
