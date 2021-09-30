package com.example.new_kasirpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class petunjuk_pembayaran extends AppCompatActivity {

    private ImageButton btn_bayarsekarang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petunjuk_pembayaran);

        btn_bayarsekarang = findViewById(R.id.btn_bayarsekarang);

        btn_bayarsekarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (petunjuk_pembayaran.this, pembayaran_sukses.class);
                startActivity(i);
            }
        });
    }
}