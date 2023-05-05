package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    //correct
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESS AS ADMIN", Toast.LENGTH_SHORT).show();
                    openMainMenu();
                }
                else if(username.getText().toString().equals("user") && password.getText().toString().equals("user")){
                    //correct
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESS AS USER", Toast.LENGTH_SHORT).show();
                    openMainMenu();
                }
                else {
                    //incorrect
                    Toast.makeText(MainActivity.this, "LOGIN FAILED", Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
    public void openMainMenu(){
        Intent intent = new Intent(this, MenuUtama.class);
        startActivity(intent);
    }
}