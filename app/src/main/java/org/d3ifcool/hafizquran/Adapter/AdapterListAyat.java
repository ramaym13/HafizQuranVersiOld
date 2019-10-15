package org.d3ifcool.hafizquran.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import org.d3ifcool.hafizquran.ItemModel.ItemModelAyat;
import org.d3ifcool.hafizquran.R;

import java.util.List;

public class AdapterListAyat extends RecyclerView.Adapter<AdapterListAyat.ViewHolder> {

    String TAG = AdapterListAyat.class.getSimpleName();

    Context context;
    List<ItemModelAyat> itemModelAyats;

    public AdapterListAyat(Context context, List<ItemModelAyat> itemModelAyats) {
        this.context = context;
        this.itemModelAyats = itemModelAyats;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_ayat,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ItemModelAyat itemModelAyat = itemModelAyats.get(position);
        holder.tv_nomor_ayat.setText(itemModelAyat.getNomorAyat());
        holder.tv_textAyat.setText(itemModelAyat.getTextAyat());
        holder.tv_translate.setText(itemModelAyat.getTranslation());

    }

    @Override
    public int getItemCount() {
        return itemModelAyats.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv_nomor_ayat, tv_textAyat, tv_translate;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_nomor_ayat = itemView.findViewById(R.id.nomor_ayat);
            tv_textAyat = itemView.findViewById(R.id.text_ayat);
            tv_translate = itemView.findViewById(R.id.traslate_ayat);
        }
    }
}
