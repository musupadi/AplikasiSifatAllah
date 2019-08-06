package com.destinyaplikasisifatallah.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.destinyaplikasisifatallah.R;

public class ScoreActivity extends AppCompatActivity {
    TextView SCORE;
    Button Kuis,Kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        SCORE = (TextView)findViewById(R.id.tvScore);
        Kuis = (Button)findViewById(R.id.btnKuis);
        Kembali = (Button)findViewById(R.id.btnKembali);
        Intent data = getIntent();
        final String Score = data.getStringExtra("SCORE");
        SCORE.setText("Selamat Anda mendapatkan Score : \n"+Score);
        Kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ScoreActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    }
}
