package com.example.nfatma.novapp;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;


public class VideoPlayer extends AppCompatActivity implements View.OnClickListener {

    private Button play, stop;
    private VideoView vView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player);

        play = findViewById(R.id.Vplay);
        stop = findViewById(R.id.Vstop);
        vView= findViewById(R.id.vView);

        play.setOnClickListener(this);
        stop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == play){
            String name = "suga";
            String place = "android.resource://" + getPackageName() + "/raw/"  + name;

            vView.setVideoURI(Uri.parse(place));
            vView.start();
        }
        if (v == stop){
            vView.stopPlayback();
        }
    }
}
