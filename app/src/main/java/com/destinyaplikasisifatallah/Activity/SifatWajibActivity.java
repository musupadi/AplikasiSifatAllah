package com.destinyaplikasisifatallah.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.destinyaplikasisifatallah.Adapter.AdapterSifatWajib;
import com.destinyaplikasisifatallah.Model.Model;
import com.destinyaplikasisifatallah.Model.ModelSifatWajib;
import com.destinyaplikasisifatallah.R;

import java.util.ArrayList;

public class SifatWajibActivity extends AppCompatActivity {
    RecyclerView rvCategory;
    ImageView kembali;
    private ArrayList<Model> pList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sifat_wajib);
        rvCategory = (RecyclerView)findViewById(R.id.recycler);
        kembali = (ImageView)findViewById(R.id.ivKembali);
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        pList.addAll(ModelSifatWajib.getListData());
        AdapterSifatWajib cardViewAdapter = new AdapterSifatWajib(this);
        cardViewAdapter.setListLaguWajib(pList);
        rvCategory.setAdapter(cardViewAdapter);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SifatWajibActivity.super.onBackPressed();
            }
        });
    }

}
