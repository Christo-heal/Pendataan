package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.material.button.MaterialButton;

public class ViewData extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_data);
        Intent intent = getIntent();
        String namaview = intent.getStringExtra(MenuUtama.EXTRA_NAMA);
        String alamatview = intent.getStringExtra(MenuUtama.EXTRA_ALAMAT);
        String umurview = intent.getStringExtra(MenuUtama.EXTRA_UMUR);
        String pekerjaanview = intent.getStringExtra(MenuUtama.EXTRA_PEKERJAAN);
        String gajiview = intent.getStringExtra(MenuUtama.EXTRA_GAJI);
        String statusview = intent.getStringExtra(MenuUtama.EXTRA_STATUS);

        String listData[] = {namaview,alamatview,umurview,pekerjaanview,gajiview,statusview};

        listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(ViewData.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,listData);

        listView.setAdapter(adapter);
        MaterialButton backbtn = (MaterialButton) findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViewData.this, MenuUtama.class);
                startActivity(intent);
            }
        });
    }

}