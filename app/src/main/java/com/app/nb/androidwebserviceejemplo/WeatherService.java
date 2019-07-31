package com.app.nb.androidwebserviceejemplo;

import com.app.nb.androidwebserviceejemplo.Models.City;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {

    @GET("weather")
    Call<City> getCity(@Query("q") String city, @Query("appid") String key);
}
