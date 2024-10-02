package com.pezloja.llenamoslamochila;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    CheckBox cb_gorras, cb_bañadores, cb_camisetas, cb_zapatos, cb_pantalones, cb_libros;
    TextView str_resultado;

    private Map<String, Integer> pesos = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb_gorras = findViewById(R.id.cb_gorras);
        cb_bañadores = findViewById(R.id.cb_bañadores);
        cb_camisetas = findViewById(R.id.cb_camisetas);
        cb_zapatos = findViewById(R.id.cb_zapatos);
        cb_pantalones = findViewById(R.id.cb_pantalones);
        cb_libros = findViewById(R.id.cb_libros);


    }
}