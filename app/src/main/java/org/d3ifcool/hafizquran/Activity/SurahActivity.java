package org.d3ifcool.hafizquran.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.gson.Gson;

import org.d3ifcool.hafizquran.Adapter.AdapterListSurah;
import org.d3ifcool.hafizquran.ItemModel.ItemModelSurah;
import org.d3ifcool.hafizquran.JsonModel.JsonModelSurah;
import org.d3ifcool.hafizquran.OnClickListener;
import org.d3ifcool.hafizquran.R;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class SurahActivity extends AppCompatActivity {
    String TAG = SurahActivity.class.getSimpleName();

    List<ItemModelSurah> adapter;

    Context context;
    RecyclerView rv_surah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah);

        try {
            context = this;
            Gson gson = new Gson();
            JsonModelSurah model = gson.fromJson(loadJSONFromAssets(), JsonModelSurah.class);

            rv_surah =  findViewById(R.id.recyclerview_surah);
            LinearLayoutManager manager = new LinearLayoutManager(this);
            rv_surah.setLayoutManager(manager);

            DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,manager.getOrientation());
            rv_surah.addItemDecoration(dividerItemDecoration);


            AdapterListSurah adapterListSurah = new AdapterListSurah(SurahActivity.this,model.getItemModelSurahs());
            rv_surah.setAdapter(adapterListSurah);

            adapterListSurah.setOnClickCallBack(new AdapterListSurah.OnClickCallBack() {
                @Override
                public void onItemClick(ItemModelSurah data) {
                    Intent intent = new Intent(SurahActivity.this,AyatActivity.class);
                    intent.putExtra(AyatActivity.EXTRA_NAMA, ""+data.getNama());
                    startActivity(intent);
                }
            });


            adapterListSurah.setListener(new OnClickListener() {
                @Override
                public void action_click(int position) {
                    Intent intent = new Intent(SurahActivity.this,AyatActivity.class);
                    intent.putExtra("surah_number",position);
                    startActivity(intent);
                }
            });
//            CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), model.getItems());
//            lstView.setAdapter(customAdapter);

        } catch (Exception ex) {
            Log.e(TAG, ex.getMessage());
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.pencarian, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    public String loadJSONFromAssets() {
        String json = null;
        try {
            InputStream inputStream = context.getAssets().open("list_surah.json");
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
