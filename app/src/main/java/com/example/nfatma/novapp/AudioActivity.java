package com.example.nfatma.novapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class AudioActivity extends AppCompatActivity implements View.OnClickListener, RatingBar.OnRatingBarChangeListener {

    private Button play, stop;
    private MediaPlayer mp;
    private RatingBar rb;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

        play = findViewById(R.id.play);
        stop = findViewById(R.id.stop);
        tv = findViewById(R.id.tv);
        rb = findViewById(R.id.rb);

        play.setOnClickListener(this);
        stop.setOnClickListener(this);
        rb.setOnRatingBarChangeListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == play){
            mp = MediaPlayer.create(AudioActivity.this, R.raw.moonchild);
            mp.start();
        }

        if (v == stop){
            if (mp != null && mp.isPlaying())
                mp.stop();
        }
    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        if (ratingBar == rb){
            if (rb.getRating() <= 2.0)
                tv.setText("No Comments");
            else if (rb.getRating() > 2.0 && rb.getRating() < 4.0 )
                tv.setText("Improve Your Taste");
            else
                tv.setText("Keep Listening then :)");
        }
    }
}
