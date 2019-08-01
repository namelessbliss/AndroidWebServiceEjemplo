package com.app.nb.androidwebserviceejemplo.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.app.nb.androidwebserviceejemplo.API.API;
import com.app.nb.androidwebserviceejemplo.API.APIService.WeatherService;
import com.app.nb.androidwebserviceejemplo.Models.City;
import com.app.nb.androidwebserviceejemplo.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Forma nativa de parsear JSON
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WeatherService service = API.getApi().create(WeatherService.class);

        //Prepara la peticion
        Call<City> cityCall = service.getCityCelsius("Lima, PE", API.APP_KEY, "metric");

        cityCall.enqueue(new Callback<City>() {
            @Override
            public void onResponse(Call<City> call, Response<City> response) {
                City city = response.body();
                Toast.makeText(MainActivity.this, city.toString(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<City> call, Throwable t) {
                Toast.makeText(MainActivity.this, "ERROR", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
