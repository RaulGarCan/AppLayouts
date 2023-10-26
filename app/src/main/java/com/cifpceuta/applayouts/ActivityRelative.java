package com.cifpceuta.applayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class ActivityRelative extends AppCompatActivity {

    private ListView lvModulos;
    private ImageButton btnAtras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        lvModulos = findViewById(R.id.lv_modulos);
        btnAtras = findViewById(R.id.btn_volver);

        ArrayAdapter<CharSequence> listaModulos = ArrayAdapter.createFromResource(this, R.array.lista_modulos, android.R.layout.simple_spinner_dropdown_item);

        lvModulos.setAdapter(listaModulos);

        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                volver(view);
            }
        });
    }
    public void volver(View v){
        startActivity(new Intent(this, MainActivity.class));
    }
}