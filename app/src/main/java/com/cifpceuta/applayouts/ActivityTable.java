package com.cifpceuta.applayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class ActivityTable extends AppCompatActivity {
    private Button btnVolver;
    private TextView tvResultFaltas;
    private ArrayList<TextView> faltas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        faltas = new ArrayList<>();
        btnVolver=findViewById(R.id.btn_faltas_volver);
        tvResultFaltas = findViewById(R.id.tv_nfaltas_total);
        faltas.add(findViewById(R.id.tv_nfaltas_noviembre));
        faltas.add(findViewById(R.id.tv_nfaltas_octubre));
        faltas.add(findViewById(R.id.tv_nfaltas_septiembre));

        int totalFaltas = 0;
        for(TextView tv : faltas){
            totalFaltas+=Integer.parseInt(tv.getText().toString());
        }
        tvResultFaltas.setText(""+totalFaltas);

        btnVolver.setOnClickListener(new View.OnClickListener() {
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