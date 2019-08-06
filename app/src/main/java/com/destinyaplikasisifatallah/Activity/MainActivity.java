package com.destinyaplikasisifatallah.Activity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.destinyaplikasisifatallah.R;

public class MainActivity extends AppCompatActivity {
    TextView tvSplash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvSplash = (TextView) findViewById(R.id.tvSplash);
        final MediaPlayer SuaraLagu = MediaPlayer.create(MainActivity.this,R.raw.welcome);
        SuaraLagu.start();
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                changeActivity();
                finish();
            }
        }, 5000); //3000 L = 3 detik
    }

    private void changeActivity(){
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
    }
}
