package com.example.s_corte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_sistemas;
    private Button btn_gastronomia;
    private Button btn_negocios;
    private double total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_sistemas = findViewById(R.id.btn_sistemas);
        btn_negocios = findViewById(R.id.btn_negocios);
        btn_gastronomia = findViewById(R.id.btn_gastronomia);

        btn_sistemas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Escogio la carrera de sistemas");
                startActivity(intent);
            }
        });

        btn_negocios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Escogio la carrera de negocios ");
                startActivity(intent);
            }
        });

        btn_gastronomia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Escogio la carrera de gastronomia ");
                startActivity(intent);
            }
        });

    }
}
