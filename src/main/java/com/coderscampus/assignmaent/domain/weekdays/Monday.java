package com.coderscampus.assignmaent.domain.weekdays;

import java.util.ArrayList;

import com.coderscampus.assignmaent.domain.Meal;
import com.coderscampus.assignmaent.domain.Nutrients;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Monday{
    @JsonProperty("meals")
    ArrayList<Meal> meals;
    @JsonProperty("nutrients")
    Nutrients nutrients;

    public Nutrients getNutrients() {
	return this.nutrients;
    }

    public void setNutrients(Nutrients nutrients) {
	this.nutrients = nutrients;
    }

    public ArrayList<Meal> getMeals() {
	return this.meals;
    }

    public void setMeals(ArrayList<Meal> meals) {
	this.meals = meals;
    }
}