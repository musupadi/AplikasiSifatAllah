package com.destinyaplikasisifatallah.Activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.destinyaplikasisifatallah.Adapter.AdapterAutoLagu;
import com.destinyaplikasisifatallah.Model.Model;
import com.destinyaplikasisifatallah.Model.ModelAllSifat;
import com.destinyaplikasisifatallah.R;

import java.util.ArrayList;
import java.util.Random;

public class HomeActivity extends AppCompatActivity {
    Button Wajib,Mustahil,Jaiz,Kuis,Tentang,keluar;
    AutoCompleteTextView etSearch;
    ImageView search;
    private ArrayList<Model> pList = new ArrayList<>();
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
        etSearch=(AutoCompleteTextView)findViewById(R.id.etSearch);
        search=(ImageView)findViewById(R.id.ivSearch);

        pList.addAll(ModelAllSifat.getListData());
        AdapterAutoLagu auto = new AdapterAutoLagu(this,pList);
        etSearch.setAdapter(auto);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i=0; i <=pList.size()-1;i++){
                    if(pList.get(i).getSifat().equals(etSearch.getText().toString())){
                        Intent goInput = new Intent(HomeActivity.this, DetailSifatActivity.class);
                        goInput.putExtra("SIFAT",pList.get(i).getSifat().toString());
                        goInput.putExtra("ARTI",pList.get(i).getArti().toString());
                        goInput.putExtra( "DESKRIPSI",pList.get(i).getDeskripsi().toString());
                        HomeActivity.this.startActivities(new Intent[]{goInput});
                    }
                }
            }
        });
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
                //Toast.makeText(HomeActivity.this, String.valueOf(randomNumberInRange(1,10)), Toast.LENGTH_SHORT).show();
                goInput.putExtra("NO",String.valueOf(0));
                goInput.putExtra("SCORE",String.valueOf(0));
                goInput.putExtra("KUIS",String.valueOf(randomNumberInRange(1,10)));
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
    public static int randomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
