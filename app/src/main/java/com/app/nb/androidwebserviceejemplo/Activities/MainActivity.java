package com.app.nb.androidwebserviceejemplo.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.app.nb.androidwebserviceejemplo.Models.City;
import com.app.nb.androidwebserviceejemplo.R;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

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
        String json = "{" + "id: 1" + ", " + "name:" + " Lima}";

        try {
            //Instanciar objeto JSON
            JSONObject jsonObject = new JSONObject(json);
            //Recuperar parametros
            int id = jsonObject.getInt("id");
            String name = jsonObject.getString("name");

            //Instanciar nueva obj ciudad
            city = new City(id, name);

        } catch (JSONException e) {

        }

        //Toast.makeText(this, city.toString(), Toast.LENGTH_SHORT).show();

        // Parseando con GSON

        Gson gson = new Gson();
        City city1 = gson.fromJson(json,City.class);

        Toast.makeText(this, city1.toString(), Toast.LENGTH_SHORT).show();
    }
}
