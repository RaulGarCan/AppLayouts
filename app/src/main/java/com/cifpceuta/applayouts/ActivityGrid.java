package com.cifpceuta.applayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ActivityGrid extends AppCompatActivity {
    private Button btnVolver;
    private ImageView imagen1, imagen2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        btnVolver = findViewById(R.id.btn_grid_volver);
        imagen1 = findViewById(R.id.imageView1_1);
        imagen2 = findViewById(R.id.imageView1_2);

        imagen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irAlChat(view, R.drawable.avatar1_chico);
            }
        });
        imagen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irAlChat(view, R.drawable.avatar2_chica);
            }
        });

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gridVolver();
            }
        });
    }
    public void gridVolver(){
        startActivity(new Intent(this, MainActivity.class));
    }
    public void irAlChat(View v, int imagen){
        startActivity(new Intent(this, ActivityConstraint.class).putExtra("imagenAlumno",imagen));
    }
}