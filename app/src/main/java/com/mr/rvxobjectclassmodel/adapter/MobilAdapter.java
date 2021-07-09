package com.mr.rvxobjectclassmodel.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mr.rvxobjectclassmodel.R;
import com.mr.rvxobjectclassmodel.model.MobilModel;

import java.util.List;

public class MobilAdapter extends RecyclerView.Adapter<MobilAdapter.ViewHolder> {

    private List<MobilModel> dataMobil;
    private Context context;

    public MobilAdapter(List<MobilModel> dataMobil, Context context) {
        this.dataMobil = dataMobil;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mobil, parent, false);
        ViewHolder vh = new ViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvMerk.setText(dataMobil.get(position).getMerk());
        holder.tvNama.setText(dataMobil.get(position).getNama());
        holder.tvWarna.setText(dataMobil.get(position).getWarna());
        holder.tvBbm.setText(dataMobil.get(position).getBbm());
        holder.tvHarga.setText(dataMobil.get(position).getHarga());
    }

    @Override
    public int getItemCount() {
        return dataMobil.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvMerk, tvNama, tvWarna, tvBbm, tvHarga;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvMerk = itemView.findViewById(R.id.tv_merk_mobil);
            tvNama = itemView.findViewById(R.id.tv_nama_mobil);
            tvWarna = itemView.findViewById(R.id.tv_warna_mobil);
            tvBbm = itemView.findViewById(R.id.tv_bbm_mobil);
            tvHarga = itemView.findViewById(R.id.tv_harga_mobil);

        }
    }
}
