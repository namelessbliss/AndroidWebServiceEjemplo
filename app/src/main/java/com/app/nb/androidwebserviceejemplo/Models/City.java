package com.app.nb.androidwebserviceejemplo.Models;

import com.google.gson.annotations.Expose;

/**
 * Modelo ciudad de ejemplo
 */
public class City {

    @Expose
    private int id;
    private String name;
    private String country;
    //@SerializedName("main") //Nombre original del key en el JSON que devuelve el API
    //private Temperature temperature;

    public City(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
        //  this.temperature = temperature;
    }

    public City() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   /* public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }*//*

    public static Temperature parseJSON(String response) {
        Gson gson = new GsonBuilder().create();
        Temperature temperature = gson.fromJson(response, Temperature.class);
        return temperature;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", temperature=" + temperature +
                '}';
    }*/
}
