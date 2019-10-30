package com.example.recyclerview_keluarga;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kuis_recycleview.R;

import java.util.ArrayList;

public class Keluarga_Adapter  extends RecyclerView.Adapter<Keluarga_Adapter.KeluargaViewHolder>{
    private ArrayList<com.example.recyclerview_keluarga.Keluarga> dataList;

    public Keluarga_Adapter(ArrayList<com.example.recyclerview_keluarga.Keluarga> dataList) { this.dataList = dataList; }

    @NonNull
    @Override
    public KeluargaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_keluarga, parent, false);
        return new KeluargaViewHolder(view);
    }

    public void onBindViewHolder(KeluargaViewHolder holder, int position) {
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtStatus.setText(dataList.get(position).getStatus());
        holder.srcGambar.setImageDrawable(dataList.get(position).getGambar());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class KeluargaViewHolder extends RecyclerView.ViewHolder {
        private TextView txtNama, txtStatus;
        private ImageView srcGambar;

        public KeluargaViewHolder(View itemView){
            super(itemView);
            txtNama =(TextView)itemView.findViewById(R.id.tv_nama);
            txtStatus =(TextView)itemView.findViewById(R.id.tv_status);
            srcGambar =(ImageView)itemView.findViewById(R.id.gambar);
        }
    }
}
