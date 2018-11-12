package com.h2r.weatherprojectapp.data.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitFactory {
    public static Retrofit getRetrofit(String baseUrl){
        Retrofit retrofit = null;
        switch (baseUrl){

            case WeatherApi.BASE_URL_WEEK:
                retrofit = new Retrofit.Builder()
                        .baseUrl(WeatherApi.BASE_URL_WEEK)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
                break;
        }
        return retrofit;
    }
}
