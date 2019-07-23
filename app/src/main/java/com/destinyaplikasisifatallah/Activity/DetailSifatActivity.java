package com.destinyaplikasisifatallah.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.destinyaplikasisifatallah.R;

public class DetailSifatActivity extends AppCompatActivity {
    TextView sifat,arti,deskripsi;
    ImageView kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sifat);
        kembali=(ImageView) findViewById(R.id.ivKembali);
        sifat=(TextView)findViewById(R.id.tvSifat);
        arti=(TextView)findViewById(R.id.tvArti);
        deskripsi=(TextView)findViewById(R.id.tvDeskripsi);

        Intent data = getIntent();
        String SIFAT = data.getStringExtra("SIFAT");
        String ARTI = data.getStringExtra("ARTI");
        String DESKRIPSI = data.getStringExtra("DESKRIPSI");
        sifat.setText(SIFAT);
        arti.setText(ARTI);
        deskripsi.setText(DESKRIPSI);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DetailSifatActivity.super.onBackPressed();
            }
        });
    }
}
