package com.coderscampus.assignmaent.spoonacular;

import java.net.URI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.assignmaent.domain.DayMeals;
import com.coderscampus.assignmaent.domain.WeekMeals;

@Service
public class SpoonacularAPI {
    @Value("${spoonacular.urls.base}")
    private String baseUrl;

    @Value("${spoonacular.urls.mealplan}")
    private String mealPlanUrl;
    String url = baseUrl+mealPlanUrl;
    
public ResponseEntity<DayMeals> getDayMeals(String numCalories, String diet, String exclusions) {
    RestTemplate restTemplate = new RestTemplate();
    URI uri = UriComponentsBuilder
            .fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
            .queryParam("timeFrame", "day")
            .queryParam("targetCalories", numCalories)
            .queryParam("diet", diet)
            .queryParam("exclude", exclusions)
            .queryParam("apiKey", "df643c1c7b37424bb54306a5b1d11d43")
            .build()
            .toUri();

    ResponseEntity<DayMeals> dayResponse = restTemplate.getForEntity(uri, DayMeals.class);
    return dayResponse;
}


public ResponseEntity<WeekMeals> getWeekMeals(String numCalories, String diet, String exclusions) {
    RestTemplate restTemplate = new RestTemplate();
    URI uri = UriComponentsBuilder
            .fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
            .queryParam("timeFrame", "week")
            .queryParam("targetCalories", numCalories)
            .queryParam("diet", diet)
            .queryParam("exclude", exclusions)
            .queryParam("apiKey", "df643c1c7b37424bb54306a5b1d11d43")
            .build()
            .toUri();

    ResponseEntity<WeekMeals> weekResponse = restTemplate.getForEntity(uri, WeekMeals.class);
    return weekResponse;
}
}