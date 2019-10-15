package org.d3ifcool.hafizquran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import org.d3ifcool.hafizquran.Activity.DoaActivity;
import org.d3ifcool.hafizquran.Activity.KompasActivity;
import org.d3ifcool.hafizquran.Activity.SurahActivity;
import org.d3ifcool.hafizquran.Activity.TajwidActivity;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rQuran, rKompas, rTajwid, rDoa;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rQuran = findViewById(R.id.relativela);
        rKompas = findViewById(R.id.relative_kompas);
        rTajwid = findViewById(R.id.relative_doa);
        rDoa = findViewById(R.id.relative_catatan);


        rTajwid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TajwidActivity.class);
                startActivity(intent);
            }
        });

        rDoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DoaActivity.class);
                startActivity(intent);
            }
        });

        rQuran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SurahActivity.class);
                startActivity(intent);
            }
        });

        rKompas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,KompasActivity.class);
                startActivity(intent);
            }
        });

    }
}
