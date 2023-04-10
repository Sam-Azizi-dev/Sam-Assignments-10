package com.coderscampus.assignmaent.domain;

import com.coderscampus.assignmaent.domain.weekdays.Friday;
import com.coderscampus.assignmaent.domain.weekdays.Monday;
import com.coderscampus.assignmaent.domain.weekdays.Saturday;
import com.coderscampus.assignmaent.domain.weekdays.Sunday;
import com.coderscampus.assignmaent.domain.weekdays.Thursday;
import com.coderscampus.assignmaent.domain.weekdays.Tuesday;
import com.coderscampus.assignmaent.domain.weekdays.Wednesday;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WeekDays {
    @JsonProperty("monday")
    Monday monday;
    @JsonProperty("tuesday")
    Tuesday tuesday;
    @JsonProperty("wednesday")
    Wednesday wednesday;
    @JsonProperty("thursday")
    Thursday thursday;
    @JsonProperty("friday")
    Friday friday;
    @JsonProperty("saturday")
    Saturday saturday;
    @JsonProperty("sunday")
    Sunday sunday;

    public Monday getMonday() {
	return this.monday;
    }

    public void setMonday(Monday monday) {
	this.monday = monday;
    }

    public Tuesday getTuesday() {
	return this.tuesday;
    }

    public void setTuesday(Tuesday tuesday) {
	this.tuesday = tuesday;
    }

    public Wednesday getWednesday() {
	return this.wednesday;
    }

    public void setWednesday(Wednesday wednesday) {
	this.wednesday = wednesday;
    }

    public Thursday getThursday() {
	return this.thursday;
    }

    public void setThursday(Thursday thursday) {
	this.thursday = thursday;
    }

    public Friday getFriday() {
	return this.friday;
    }

    public void setFriday(Friday friday) {
	this.friday = friday;
    }

    public Saturday getSaturday() {
	return this.saturday;
    }

    public void setSaturday(Saturday saturday) {
	this.saturday = saturday;
    }

    public Sunday getSunday() {
	return this.sunday;
    }

    public void setSunday(Sunday sunday) {
	this.sunday = sunday;
    }

}
