package com.app.nb.androidwebserviceejemplo.Models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

public class Town {

    private int id;
    private List<City> cities;

    public Town(int id, List<City> city) {
        this.id = id;
        this.cities = city;
    }

    public Town() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public static City parseJSON(String response) {
        Gson gson = new GsonBuilder().create();
        City city = gson.fromJson(response, City.class);
        return city;
    }
}
