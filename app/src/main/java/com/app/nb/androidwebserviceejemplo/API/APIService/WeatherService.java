package com.app.nb.androidwebserviceejemplo.API.APIService;

import com.app.nb.androidwebserviceejemplo.Models.City;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {

    /**
     * Obtiene los datos de la ciudad del API
     *
     * @param city
     * @param key
     * @return City
     */
    @GET("weather")
    Call<City> getCity(@Query("q") String city, @Query("appid") String key);

    /**
     * Obtiene los datos de la ciudad del API con Temperatura en celsius
     *
     * @param city
     * @param key
     * @param value
     * @return City & Temperature
     */
    @GET("weather")
    Call<City> getCityCelsius(@Query("q") String city, @Query("appid") String key, @Query("units") String value);
}
