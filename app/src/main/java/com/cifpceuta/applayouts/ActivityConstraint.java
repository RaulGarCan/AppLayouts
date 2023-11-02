package com.cifpceuta.applayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.time.LocalTime;

public class ActivityConstraint extends AppCompatActivity {
    private ImageView imagen;
    private ImageButton atras,enviarMensaje;
    private TextView hora;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);
        imagen=findViewById(R.id.imagen_alumno);
        hora=findViewById(R.id.tv_hora_chat);
        atras=findViewById(R.id.btn_atras_constraint);
        enviarMensaje=findViewById(R.id.btn_enviar_mensaje);
        LocalTime ahora = LocalTime.now();
        if(ahora.getMinute()<10){
            hora.setText(ahora.getHour()+":0"+ahora.getMinute());
        } else {
            hora.setText(ahora.getHour()+":"+ahora.getMinute());
        }
        Intent imagenAlumno = getIntent();
        if(imagenAlumno!=null){
            imagen.setImageResource(imagenAlumno.getIntExtra("imagenAlumno",R.drawable.person_24));
        }
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                atras(view);
            }
        });
        enviarMensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    public void atras(View v){
        startActivity(new Intent(this, MainActivity.class));
    }
}