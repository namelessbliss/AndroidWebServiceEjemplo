package com.app.nb.androidwebserviceejemplo.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.app.nb.androidwebserviceejemplo.Models.City;
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

    }
}
