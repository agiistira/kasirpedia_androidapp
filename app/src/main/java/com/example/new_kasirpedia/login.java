package com.example.new_kasirpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void masuk(View view) {
        Intent intent = new Intent(login.this, informasi_bisnis.class);
        startActivity(intent);
    }

    public void daftar(View view) {
        Intent intent = new Intent(login.this,daftar.class);
        startActivity(intent);
    }
}