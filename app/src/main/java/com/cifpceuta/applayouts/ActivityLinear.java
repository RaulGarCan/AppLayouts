package com.cifpceuta.applayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityLinear extends AppCompatActivity {

    private Button btnAtras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
        btnAtras = findViewById(R.id.btn_atras);
        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                botonAtras(view);
            }
        });
    }
    public void botonAtras(View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}