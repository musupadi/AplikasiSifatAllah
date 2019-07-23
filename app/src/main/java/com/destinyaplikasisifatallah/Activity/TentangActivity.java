package com.destinyaplikasisifatallah.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.destinyaplikasisifatallah.R;

public class TentangActivity extends AppCompatActivity {
    ImageView kembali,play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);
        kembali=(ImageView) findViewById(R.id.ivKembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TentangActivity.super.onBackPressed();
            }
        });
    }
}
