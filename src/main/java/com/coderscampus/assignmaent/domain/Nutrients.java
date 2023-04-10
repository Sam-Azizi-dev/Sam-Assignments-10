package com.coderscampus.assignmaent.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nutrients {
    @JsonProperty("calories")
    double calories;
    @JsonProperty("protein")
    double protein;
    @JsonProperty("fat")
    double fat;
    @JsonProperty("carbohydrates")
    double carbohydrates;

    public double getCalories() {
	return this.calories;
    }

    public void setCalories(double calories) {
	this.calories = calories;
    }

    public double getProtein() {
	return this.protein;
    }

    public void setProtein(double protein) {
	this.protein = protein;
    }

    public double getFat() {
	return this.fat;
    }

    public void setFat(double fat) {
	this.fat = fat;
    }

    public double getCarbohydrates() {
	return this.carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
	this.carbohydrates = carbohydrates;
    }

}