package com.example.new_kasirpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class akun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akun);
    }
    public void kontak(View view) {
        Intent intent = new Intent(akun.this,kontak.class);
        startActivity(intent);
    }

    public void detail_kontak(View view) {
        Intent intent = new Intent(akun.this,detail_akun.class);
        startActivity(intent);
    }
}