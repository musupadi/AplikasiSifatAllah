package com.destinyaplikasisifatallah.Activity;

import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.destinyaplikasisifatallah.Adapter.AdapterSifatWajib;
import com.destinyaplikasisifatallah.Model.Model;
import com.destinyaplikasisifatallah.Model.ModelSifatMustahil;
import com.destinyaplikasisifatallah.Model.ModelSifatWajib;
import com.destinyaplikasisifatallah.R;

import java.util.ArrayList;

public class SifatWajibActivity extends AppCompatActivity {
    RecyclerView rvCategory;
    ImageView kembali,play;
    private ArrayList<Model> pList = new ArrayList<>();
    boolean onClicked = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sifat_wajib);
        rvCategory = (RecyclerView)findViewById(R.id.recycler);
        kembali = (ImageView)findViewById(R.id.ivKembali);
        play = (ImageView)findViewById(R.id.ivPlay);
        final MediaPlayer SuaraLagu = MediaPlayer.create(SifatWajibActivity.this,R.raw.sifatwajib);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Drawable DrawableHapus = getResources().getDrawable(R.drawable.pause);
                final Drawable DrawablePlay = getResources().getDrawable(R.drawable.play);
                if (onClicked){
                    play.setImageDrawable(DrawableHapus);
                    onClicked=false;
                    SuaraLagu.start();
                }else{
                    play.setImageDrawable(DrawablePlay);
                    onClicked=true;
                    SuaraLagu.pause();
                }
            }
        });

        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        pList.addAll(ModelSifatMustahil.getListData());
        AdapterSifatWajib cardViewAdapter = new AdapterSifatWajib(this);
        cardViewAdapter.setListSifatWajib(pList);
        rvCategory.setAdapter(cardViewAdapter);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SifatWajibActivity.super.onBackPressed();
            }
        });
    }

}
