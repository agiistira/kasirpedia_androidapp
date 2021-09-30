package com.example.new_kasirpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class berlangganan extends AppCompatActivity {

    private ImageButton btn_berlangganan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berlangganan);

        btn_berlangganan = findViewById(R.id.btn_berlangganan);

        btn_berlangganan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (berlangganan.this, metode_pembayaran.class);
                startActivity(i);
            }
        });
    }
}