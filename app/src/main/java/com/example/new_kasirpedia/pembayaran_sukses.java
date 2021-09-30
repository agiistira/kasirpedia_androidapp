package com.example.new_kasirpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class pembayaran_sukses extends AppCompatActivity {

    private ImageButton btn_lanjutkan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran_sukses);

        btn_lanjutkan = findViewById(R.id.btn_lanjutkan);

        btn_lanjutkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (pembayaran_sukses.this, home.class);
                startActivity(i);
            }
        });
    }
}