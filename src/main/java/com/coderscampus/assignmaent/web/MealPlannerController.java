package com.coderscampus.assignmaent.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.assignmaent.domain.DayMeals;
import com.coderscampus.assignmaent.domain.WeekMeals;
import com.coderscampus.assignmaent.spoonacular.SpoonacularAPI;

@RestController
public class MealPlannerController {
    SpoonacularAPI api = new SpoonacularAPI();

    @GetMapping("mealplanner/day")
    public ResponseEntity<DayMeals> getDayMeals(@RequestParam(required = false)String numCalories
	    					  ,@RequestParam(required = false) String diet
	    					  ,@RequestParam(required = false) String exclusions) {
	return api.getDayMeals(numCalories, diet, exclusions);
    }
    @GetMapping("mealplanner/week")
    public ResponseEntity<WeekMeals> getWeekMeals(@RequestParam(required = false) String numCalories,
	    					  @RequestParam(required = false) String diet,	  
	    					  @RequestParam(required = false) String exclusions) {
	return api.getWeekMeals(numCalories, diet, exclusions);
    }
}
