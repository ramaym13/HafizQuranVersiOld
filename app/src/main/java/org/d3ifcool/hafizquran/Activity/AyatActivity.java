package org.d3ifcool.hafizquran.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import org.d3ifcool.hafizquran.Adapter.AdapterListAyat;
import org.d3ifcool.hafizquran.ItemModel.ItemModelAyat;
import org.d3ifcool.hafizquran.JsonModel.JsonModelAyat;
import org.d3ifcool.hafizquran.R;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class AyatActivity extends AppCompatActivity {

    String TAG = AyatActivity.class.getSimpleName();

    public static final String EXTRA_NAMA = "nama";

    Context context;
    RecyclerView rv_ayat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayat);

        String nama = getIntent().getStringExtra(EXTRA_NAMA);
        getSupportActionBar().setTitle(nama);

        int posisi = getIntent().getIntExtra("surah_number",0);
        String nomor_surah = String.valueOf(posisi + 1);
        Log.d("nomo",nomor_surah);
        try {
            context = this;
            Gson gson = new Gson();
            JsonModelAyat model = gson.fromJson(loadJSONFromAssets(), JsonModelAyat.class);
            ArrayList<ItemModelAyat> modelAyats = new ArrayList<>();

            for (ItemModelAyat x: model.getItemssurah()){
                if (x.getNomorSurah().equals(nomor_surah)){
                    modelAyats.add(x);
                }
            }


            rv_ayat = findViewById(R.id.recyclerview_Ayat);
            LinearLayoutManager manager = new LinearLayoutManager(this);
            rv_ayat.setLayoutManager(manager);

            DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,manager.getOrientation());
//            dividerItemDecoration.setDrawable(getContex().getResources().getDrawable(R.drawable.garis_recyclareview));
            rv_ayat.addItemDecoration(dividerItemDecoration);

            AdapterListAyat adapterListAyat = new AdapterListAyat(AyatActivity.this,modelAyats);
            rv_ayat.setAdapter(adapterListAyat);

        } catch (Exception ex) {
            Log.e(TAG, ex.getMessage());
        }
    }

    public String loadJSONFromAssets() {
        String json = null;
        try {
            InputStream inputStream = context.getAssets().open("quran.json");
            int size = inputStream.available();
            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return json;
    }
}
