package com.cifpceuta.applayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.VideoView;

public class AcitivityFrame extends AppCompatActivity {
    private VideoView videoView;
    private ImageButton btnPlay, btnPause;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acitivity_frame);

        videoView = findViewById(R.id.videoView);
        btnPlay = findViewById(R.id.btn_play);
        btnPause = findViewById(R.id.btn_pause);

        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video));

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                videoView.start();
                btnPlay.setVisibility(View.INVISIBLE);
                btnPause.setVisibility(View.VISIBLE);
            }
        });
        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                videoView.pause();
                btnPause.setVisibility(View.INVISIBLE);
                btnPlay.setVisibility(View.VISIBLE);
            }
        });
    }
    public void reproduccionVideo(View v){
        if(videoView.isPlaying()){
            videoView.pause();
        } else {
            videoView.start();
        }
    }
}