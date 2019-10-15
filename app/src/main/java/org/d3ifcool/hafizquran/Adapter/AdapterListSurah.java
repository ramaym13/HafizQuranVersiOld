package org.d3ifcool.hafizquran.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import org.d3ifcool.hafizquran.Activity.AyatActivity;
import org.d3ifcool.hafizquran.ItemModel.ItemModelSurah;
import org.d3ifcool.hafizquran.OnClickListener;
import org.d3ifcool.hafizquran.R;

import java.util.List;

public class AdapterListSurah extends RecyclerView.Adapter<AdapterListSurah.ViewHolder> {
    String TAG =AdapterListSurah.class.getSimpleName();

    OnClickListener listener;

    private OnClickCallBack onClickCallBack;

    public void setOnClickCallBack(OnClickCallBack onClickCallBack) {
        this.onClickCallBack = onClickCallBack;
    }

    public void setListener(OnClickListener listener) {
        this.listener = listener;
    }

    Context context;
    List<ItemModelSurah> itemModelSurahs;

    public AdapterListSurah(Context context, List<ItemModelSurah> itemModelSurahs) {
        this.context = context;
        this.itemModelSurahs = itemModelSurahs;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_surah,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        final ItemModelSurah itemModelSurah = itemModelSurahs.get(position);
        holder.tv_nomor_surah.setText(itemModelSurah.getNomor());
        holder.tv_nama_surah.setText(itemModelSurah.getNama());
        holder.tv_arti_nama.setText(itemModelSurah.getArti());
        holder.tv_asma_surah.setText(itemModelSurah.getAsma());
        holder.tv_jumlah_ayat.setText("\t|\t"+itemModelSurah.getJumlah_Ayat()+"\tAyat");
        holder.tv_ditirinkanDi.setText(itemModelSurah.getDiturunkanDI());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickCallBack.onItemClick(itemModelSurahs.get(holder.getAdapterPosition()));
            }
        });

    }

    @Override
    public int getItemCount() {
        return itemModelSurahs.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_nomor_surah, tv_nama_surah, tv_arti_nama, tv_asma_surah, tv_jumlah_ayat,tv_ditirinkanDi;
        public ViewHolder(@NonNull final View itemView) {
            super(itemView);

            tv_nomor_surah = itemView.findViewById(R.id.nomor_surah);
            tv_nama_surah = itemView.findViewById(R.id.nama_surah);
            tv_arti_nama = itemView.findViewById(R.id.arti_nama_surah);
            tv_asma_surah = itemView.findViewById(R.id.asma_surah);
            tv_jumlah_ayat = itemView.findViewById(R.id.jumlahayat);
            tv_ditirinkanDi = itemView.findViewById(R.id.diturunkanDI);

            itemView.setOnClickListener(new View.OnClickListener() {


                public void onClick(View view) {
                    listener.action_click(getAdapterPosition());

                }
            });
        }
    }

    public  interface OnClickCallBack {
        void onItemClick(ItemModelSurah data);
    }
}
