package com.destinyaplikasisifatallah.Activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
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
        Mustahil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,SifatMustahilActivity.class);
                startActivity(intent);
            }
        });
        Jaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,SifatJaizActivity.class);
                startActivity(intent);
            }
        });
        Kuis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goInput = new Intent(HomeActivity.this, KuisActivity.class);
                goInput.putExtra("NO",String.valueOf(0));
                goInput.putExtra("SCORE",String.valueOf(0));
                HomeActivity.this.startActivities(new Intent[]{goInput});
                finish();
            }
        });
        Tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,TentangActivity.class);
                startActivity(intent);
            }
        });
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);
                builder.setMessage("Anda Yakin ingin Keluar Aplikasi ?")
                        .setCancelable(false)
                        .setPositiveButton("Iya", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                                HomeActivity.super.onBackPressed();
                            }
                        })
                        .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        })
                        //Set your icon here
                        .setTitle("Perhatian !!!")
                        .setIcon(R.drawable.ic_close_black_24dp);
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }
}
