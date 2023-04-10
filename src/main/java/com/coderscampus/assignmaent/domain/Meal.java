package com.coderscampus.assignmaent.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meal {
    @JsonProperty("id")
    int id;
    @JsonProperty("imageType")
    String imageType;
    @JsonProperty("title")
    String title;
    @JsonProperty("readyInMinutes")
    int readyInMinutes;
    @JsonProperty("servings")
    int servings;
    @JsonProperty("sourceUrl")
    String sourceUrl;

    public int getId() {
	return this.id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getImageType() {
	return this.imageType;
    }

    public void setImageType(String imageType) {
	this.imageType = imageType;
    }

    public String getTitle() {
	return this.title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public int getReadyInMinutes() {
	return this.readyInMinutes;
    }

    public void setReadyInMinutes(int readyInMinutes) {
	this.readyInMinutes = readyInMinutes;
    }

    public int getServings() {
	return this.servings;
    }

    public void setServings(int servings) {
	this.servings = servings;
    }

    public String getSourceUrl() {
	return this.sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
	this.sourceUrl = sourceUrl;
    }
}
