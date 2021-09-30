package com.example.new_kasirpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class informasi_bisnis extends AppCompatActivity {
    private ImageButton btn_lanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi_bisnis);

        btn_lanjut = findViewById(R.id.btn_lanjut);

        btn_lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (informasi_bisnis.this, berlangganan.class);
                startActivity(i);
            }
        });
    }

}