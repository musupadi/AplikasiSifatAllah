package com.destinyaplikasisifatallah.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.TextView;

import com.destinyaplikasisifatallah.Model.Model;
import com.destinyaplikasisifatallah.R;

import java.util.ArrayList;
import java.util.List;

public class AdapterAutoLagu extends ArrayAdapter<Model> {
    private List<Model> dmListFull;

    public AdapterAutoLagu(@NonNull Context context, @NonNull List<Model> countryList) {
        super(context, 0, countryList);
        dmListFull = new ArrayList<>(countryList);
    }

    @NonNull
    @Override
    public Filter getFilter() {
        return countryFilter;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_data_lagu, parent, false
            );
        }

        TextView textViewJudul = convertView.findViewById(R.id.tvSifat);
        TextView textViewPenyanyi = convertView.findViewById(R.id.tvArti);

        Model dm = getItem(position);

        if (dm != null) {
            textViewJudul.setText(dm.getSifat());
            textViewPenyanyi.setText(dm.getArti());
        }

        return convertView;
    }

    private Filter countryFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults results = new FilterResults();
            List<Model> suggestions = new ArrayList<>();

            if (constraint == null || constraint.length() == 0) {
                suggestions.addAll(dmListFull);
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();

                for (Model item : dmListFull) {
                    if (item.getSifat().toLowerCase().contains(filterPattern)) {
                        suggestions.add(item);
                    }
                }
            }

            results.values = suggestions;
            results.count = suggestions.size();

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            clear();
            addAll((List) results.values);
            notifyDataSetChanged();
        }

        @Override
        public CharSequence convertResultToString(Object resultValue) {
            return ((Model) resultValue).getSifat();
        }
    };
}

