package com.example.bikecompany;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class BikeCompanyAdapter extends RecyclerView.Adapter<BikeCompanyAdapter.ViewHolder> {

    private final List<String> bikeCompanies;

    public BikeCompanyAdapter(List<String> bikeCompanies) {
        this.bikeCompanies = bikeCompanies;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_bike_company, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String company = bikeCompanies.get(position);
        holder.tvBikeCompany.setText(company);
    }

    @Override
    public int getItemCount() {
        return bikeCompanies.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView tvBikeCompany;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvBikeCompany = itemView.findViewById(R.id.tvBikeCompany);
        }
    }
}

