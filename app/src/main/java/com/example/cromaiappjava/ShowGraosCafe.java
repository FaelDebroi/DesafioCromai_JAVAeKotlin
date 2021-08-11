package com.example.cromaiappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ShowGraosCafe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_graos_cafe);

        ListView List = findViewById(R.id.List);
        Bundle extras = getIntent().getExtras();

        String[] listaGraos = extras.getStringArray("Lista");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaGraos);
        List.setAdapter(adapter);

    }
}