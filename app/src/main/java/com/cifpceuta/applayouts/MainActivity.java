package com.cifpceuta.applayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnLinear, btnFrame, btnRelative, btnTable, btnGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLinear = findViewById(R.id.btn_linear);
        btnFrame = findViewById(R.id.btn_frame);
        btnRelative = findViewById(R.id.btn_relative);
        btnTable = findViewById(R.id.btn_table);
        btnGrid = findViewById(R.id.btn_grid);
        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                botonLinear(view);
            }
        });
        btnFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                botonFrame(view);
            }
        });
        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnRelative(view);
            }
        });
        btnTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnTable(view);
            }
        });
        btnGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnGrid(view);
            }
        });
    }
    private void botonLinear(View v){
        Intent i = new Intent(this,ActivityLinear.class);
        startActivity(i);
    }
    private void botonFrame(View v){
        startActivity(new Intent(this,AcitivityFrame.class));
    }
    private void btnRelative(View v){
        startActivity(new Intent(this, ActivityRelative.class));
    }
    private void btnTable(View v){
        startActivity(new Intent(this, ActivityTable.class));
    }
    private void btnGrid(View v){
        startActivity(new Intent(this,ActivityGrid.class));
    }
}