package com.destinyaplikasisifatallah.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.destinyaplikasisifatallah.R;

public class HomeActivity extends AppCompatActivity {
    Button Wajib,Mustahil,Jaiz,Kuis,Tentang,keluar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Wajib=(Button)findViewById(R.id.btnSifatWajib);
        Mustahil=(Button)findViewById(R.id.btnSifatMustahil);
        Jaiz=(Button)findViewById(R.id.btnSifatJaiz);
        Kuis=(Button)findViewById(R.id.btnKuis);
        Tentang=(Button)findViewById(R.id.btnTentang);
        keluar=(Button)findViewById(R.id.btnExit);
        Wajib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,SifatWajibActivity.class);
                startActivity(intent);
            }
        });
    }
}
