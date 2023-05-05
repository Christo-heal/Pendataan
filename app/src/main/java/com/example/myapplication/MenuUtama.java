package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MenuUtama extends AppCompatActivity {

    public static final String EXTRA_NAMA = "com.example.myapplication.EXTRA_NAMA";
    public static final String EXTRA_ALAMAT = "com.example.myapplication.EXTRA_ALAMAT";
    public static final String EXTRA_KOTA = "com.example.myapplication.EXTRA_KOTA";
    public static final String EXTRA_UMUR = "com.example.myapplication.EXTRA_UMUR";
    public static final String EXTRA_PEKERJAAN = "com.example.myapplication.EXTRA_PEKERJAAN";
    public static final String EXTRA_GAJI = "com.example.myapplication.EXTRA_GAJI";
    public static final String EXTRA_STATUS = "com.example.myapplication.EXTRA_STATUS";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);

        TextView nama = (TextView) findViewById(R.id.nama);
        TextView alamat = (TextView) findViewById(R.id.alamat);
        TextView kota = (TextView) findViewById(R.id.kota);
        TextView umur = (TextView) findViewById(R.id.umur);
        TextView pekerjaan = (TextView) findViewById(R.id.pekerjaan);
        TextView gaji = (TextView) findViewById(R.id.gaji);
        TextView status = (TextView) findViewById(R.id.status);


        Button viewbtn = (Button) findViewById(R.id.viewbtn);
        Button deletebtn = (Button) findViewById(R.id.deletebtn);

        viewbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (!(nama.getText().toString().isEmpty()) && !(alamat.getText().toString().isEmpty()) &&
                        !(umur.getText().toString().isEmpty()) && !(pekerjaan.getText().toString().isEmpty()) &&
                        !(gaji.getText().toString().isEmpty()) && !(status.getText().toString().isEmpty())) {

                    openViewData();
                } else {
                    Toast.makeText(MenuUtama.this, "ISI DATA DENGAN LENGKAP", Toast.LENGTH_SHORT).show();
                }

            }
        });

        deletebtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuUtama.this, MenuUtama.class);
                startActivity(intent);
            }
        });

    }
    public void openViewData(){
        EditText nama = (EditText) findViewById(R.id.nama);
        String name = nama.getText().toString();

        EditText alamat = (EditText) findViewById(R.id.alamat);
        String address = alamat.getText().toString();

        EditText umur = (EditText) findViewById(R.id.umur);
        String age = umur.getText().toString();

        EditText pekerjaan = (EditText) findViewById(R.id.pekerjaan);
        String job = pekerjaan.getText().toString();

        EditText gaji = (EditText) findViewById(R.id.gaji);
        String salary = gaji.getText().toString();

        EditText status = (EditText) findViewById(R.id.status);
        String stat = status.getText().toString();

        Intent intent = new Intent(this, ViewData.class);
        intent.putExtra(EXTRA_NAMA, name);
        intent.putExtra(EXTRA_ALAMAT, address);
        intent.putExtra(EXTRA_UMUR, age);
        intent.putExtra(EXTRA_PEKERJAAN, job);
        intent.putExtra(EXTRA_GAJI, salary);
        intent.putExtra(EXTRA_STATUS, stat);
        startActivity(intent);
    }

}