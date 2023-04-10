package com.coderscampus.assignmaent.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeekMeals {
    @JsonProperty("week")
    WeekDays week;

    public WeekDays getWeek() {
	return this.week;
    }

    public void setWeek(WeekDays week) {
	this.week = week;
    }
}
