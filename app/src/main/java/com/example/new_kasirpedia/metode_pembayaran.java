package com.example.new_kasirpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class metode_pembayaran extends AppCompatActivity {

    private ImageButton btn_bayar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metode_pembayaran);

        btn_bayar = findViewById(R.id.btn_bayar);

        btn_bayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (metode_pembayaran.this, petunjuk_pembayaran.class);
                startActivity(i);
            }
        });
    }
}