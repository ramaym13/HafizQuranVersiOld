package org.d3ifcool.hafizquran.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import org.d3ifcool.hafizquran.Adapter.AdapterDoa;
import org.d3ifcool.hafizquran.Adapter.AdapterTajwid;
import org.d3ifcool.hafizquran.ItemModel.Doa;
import org.d3ifcool.hafizquran.ItemModel.Tajwid;
import org.d3ifcool.hafizquran.JsonModel.DataDoa;
import org.d3ifcool.hafizquran.R;

import java.util.ArrayList;

public class DoaActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Doa> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa);

        recyclerView = findViewById(R.id.rv_doa);
        recyclerView.setHasFixedSize(true);

        list.addAll(DataDoa.getListData());

        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        DividerItemDecoration decoration = new DividerItemDecoration(this,manager.getOrientation());
        recyclerView.addItemDecoration(decoration);
        AdapterDoa adapterDoa = new AdapterDoa(list);
        recyclerView.setAdapter(adapterDoa);
    }
}
