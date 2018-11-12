package com.h2r.weatherprojectapp.data.rest;

public class WeatherFullApi {
    private static WeatherFullApi instance;
    private WeatherApi apiWeek;

    private WeatherFullApi(){
        apiWeek = RetrofitFactory.getRetrofit(WeatherApi.BASE_URL_WEEK).create(WeatherApi.class);
    }

    public static WeatherFullApi getInstance() {
        if(instance == null){
            instance = new WeatherFullApi();
        }
        return instance;
    }



    public WeatherApi getApiWeek(){
        if(apiWeek == null){
            new WeatherFullApi();
        }
        return apiWeek;
    }
}
