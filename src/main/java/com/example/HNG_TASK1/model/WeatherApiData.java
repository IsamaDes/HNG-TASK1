package com.example.HNG_TASK1.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherApiData {
    private String name;
    private double temperatureC;


}