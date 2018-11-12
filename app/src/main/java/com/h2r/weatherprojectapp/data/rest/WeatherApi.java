package com.h2r.weatherprojectapp.data.rest;


import com.h2r.weatherprojectapp.data.model.week.ResponseWeather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WeatherApi {
    static final String BASE_URL_CURRENTLY = "https://api.darksky.net/forecast/";
    static final String BASE_URL_WEEK = "http://api.apixu.com/v1//";


    @POST("forecast.json")
    Call<ResponseWeather> getResponseCity(
            @Query("key") String key, @Query("q") String q, @Query("days") int days);
}
