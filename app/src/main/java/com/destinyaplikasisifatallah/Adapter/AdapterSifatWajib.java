package com.destinyaplikasisifatallah.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.destinyaplikasisifatallah.Activity.DetailSifatActivity;
import com.destinyaplikasisifatallah.Model.Model;
import com.destinyaplikasisifatallah.R;

import java.util.ArrayList;

public class AdapterSifatWajib extends RecyclerView.Adapter<AdapterSifatWajib.CardViewViewHolder> {
    private Context context;
    private ArrayList<Model> listSifatWajib;


    private ArrayList<Model> getListSifatWajib() {
        return listSifatWajib;
    }

    public void setListSifatWajib(ArrayList<Model> listSifatWajib) {
        this.listSifatWajib = listSifatWajib;
    }

    public AdapterSifatWajib(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_wajib, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder cardViewViewHolder, int i) {
        final Model p = getListSifatWajib().get(i);
        cardViewViewHolder.tvSifat.setText(p.getSifat());
        cardViewViewHolder.tvArti.setText(p.getArti());
        cardViewViewHolder.list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goInput = new Intent(context, DetailSifatActivity.class);
                goInput.putExtra("SIFAT",p.getSifat());
                goInput.putExtra("ARTI",p.getArti());
                goInput.putExtra( "DESKRIPSI",p.getDeskripsi());
                context.startActivities(new Intent[]{goInput});
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListSifatWajib().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder {
        TextView tvSifat, tvArti;
        LinearLayout list;

        CardViewViewHolder(View itemView) {
            super(itemView);
            tvSifat = itemView.findViewById(R.id.tvSifat);
            tvArti = itemView.findViewById(R.id.tvArti);
            list = itemView.findViewById(R.id.List);
        }
    }
}