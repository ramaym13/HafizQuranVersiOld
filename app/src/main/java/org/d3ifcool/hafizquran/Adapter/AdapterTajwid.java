package org.d3ifcool.hafizquran.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.d3ifcool.hafizquran.ItemModel.Tajwid;
import org.d3ifcool.hafizquran.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterTajwid extends RecyclerView.Adapter<AdapterTajwid.ViewHolder> {

    private ArrayList<Tajwid> listTajwid;

    public AdapterTajwid(ArrayList<Tajwid> listTajwid) {
        this.listTajwid = listTajwid;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tajwid, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Tajwid tajwid = listTajwid.get(position);
        holder.tv_JudulTajwid.setText(tajwid.getJudul_tajwid());
        holder.tv_DeskripsiTajwid.setText((tajwid.getDeskripsi_tajwid()));
    }

    @Override
    public int getItemCount() {
        return listTajwid.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView tv_JudulTajwid, tv_DeskripsiTajwid;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_JudulTajwid = itemView.findViewById(R.id.tv_judultajwid);
            tv_DeskripsiTajwid = itemView.findViewById(R.id.tv_deskripsitajwid);
        }
    }
}
