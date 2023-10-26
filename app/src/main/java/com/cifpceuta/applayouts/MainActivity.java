package com.cifpceuta.applayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnLinear;
    private Button btnFrame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLinear = findViewById(R.id.btn_linear);
        btnFrame = findViewById(R.id.btn_frame);
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
    }
    private void botonLinear(View v){
        Intent i = new Intent(this,ActivityLinear.class);
        startActivity(i);
    }
    private void botonFrame(View v){
        startActivity(new Intent(this,AcitivityFrame.class));
    }
}