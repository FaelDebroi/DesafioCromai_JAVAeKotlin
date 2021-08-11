package com.example.cromaiappjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    String[] tipoGraos = new String[]{
            "Café Arábica", "Café Bourbon", "Café Kona",
            "Café Catuaí", "Café Acaiá", "Café Robusta",
            "Café Geisha"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btMostrar(View view) {
        Intent telaGraos = new Intent(this, ShowGraosCafe.class);
        telaGraos.putExtra("Lista", tipoGraos);
        startActivity(telaGraos);
    };
}
