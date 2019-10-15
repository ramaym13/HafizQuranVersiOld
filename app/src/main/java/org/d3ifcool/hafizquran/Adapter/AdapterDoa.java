package org.d3ifcool.hafizquran.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.d3ifcool.hafizquran.ItemModel.Doa;
import org.d3ifcool.hafizquran.R;

import java.util.ArrayList;

public class AdapterDoa extends RecyclerView.Adapter<AdapterDoa.ViewHolder> {

    private ArrayList<Doa> listDoa;

    public AdapterDoa(ArrayList<Doa> listDoa) {
        this.listDoa = listDoa;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_doa, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Doa doa= listDoa.get(position);
        holder.tv_nmr.setText(doa.getNmr_doa());
        holder.tv_judul_doa.setText(doa.getJudul_doa());
        holder.tv_ayat.setText(doa.getDoa());
        holder.tv_latin.setText(doa.getLatin());
        holder.tv_arti.setText(doa.getArti());
    }

    @Override
    public int getItemCount() {
        return listDoa.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView tv_nmr,tv_judul_doa, tv_ayat,tv_latin,tv_arti;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_nmr = itemView.findViewById(R.id.nmr_doa);
            tv_judul_doa = itemView.findViewById(R.id.tv_judul_doa);
            tv_ayat = itemView.findViewById(R.id.tv_ayat_doa);
            tv_latin = itemView.findViewById(R.id.tv_latin);
            tv_arti = itemView.findViewById(R.id.tv_arti);
        }
    }
}
