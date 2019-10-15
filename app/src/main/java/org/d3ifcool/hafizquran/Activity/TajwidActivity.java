package org.d3ifcool.hafizquran.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import org.d3ifcool.hafizquran.Adapter.AdapterTajwid;
import org.d3ifcool.hafizquran.ItemModel.Tajwid;
import org.d3ifcool.hafizquran.JsonModel.DataTajwid;
import org.d3ifcool.hafizquran.R;

import java.util.ArrayList;

public class TajwidActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Tajwid> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tajwid);
        recyclerView = findViewById(R.id.recyclerview_tajwid);
        recyclerView.setHasFixedSize(true);

        list.addAll(DataTajwid.getListData());

        tampilData();
    }

    private void tampilData() {
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        DividerItemDecoration decoration = new DividerItemDecoration(this,manager.getOrientation());
        recyclerView.addItemDecoration(decoration);
        AdapterTajwid adapterTajwid = new AdapterTajwid(list);
        recyclerView.setAdapter(adapterTajwid);
    }
}
