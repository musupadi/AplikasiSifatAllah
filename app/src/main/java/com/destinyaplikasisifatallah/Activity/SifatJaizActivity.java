package com.destinyaplikasisifatallah.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.destinyaplikasisifatallah.R;

public class SifatJaizActivity extends AppCompatActivity {
    ImageView kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sifat_jaiz);
        kembali=(ImageView)findViewById(R.id.ivKembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SifatJaizActivity.super.onBackPressed();
            }
        });
    }
}
