package com.app.nb.androidwebserviceejemplo.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.app.nb.androidwebserviceejemplo.Models.City;
import com.app.nb.androidwebserviceejemplo.Models.Town;
import com.app.nb.androidwebserviceejemplo.R;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Forma nativa de parsear JSON
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        City city = null;

        // JSON de ejemplo
        String json = "{" + "id: 0" + "," +
                " cities:[" +
                "{ id = 1, "
                + "name:" + " Lima" + "," +
                " country:" + " Peru" + "}," +
                "{ id = 2, "
                + "name:" + " Arquipa" + "," +
                " country:" + " Peru" + "}" +
                "]}";

        // Parseando con GSON

        Gson gson = new GsonBuilder().create();
        Town town = gson.fromJson(json, Town.class);

        Toast.makeText(this, town.getCities().toString(), Toast.LENGTH_SHORT).show();
    }
}
