package com.example.new_kasirpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class home extends AppCompatActivity {

    private ImageButton btn_calculator, btn_favorite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_calculator = findViewById(R.id.btn_calculator);

        btn_calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (home.this, calculator.class);
                startActivity(i);
            }
        });
    }


    public void favorite(View view) {
        Intent intent = new Intent(home.this, favorites.class);
        startActivity(intent);

    }

    public void reports(View view) {
        Intent intent = new Intent(home.this, reports.class);
        startActivity(intent);
    }


    public void keranjang(View view) {
        Intent intent = new Intent(home.this, keranjang_transaksi.class);
        startActivity(intent);
    }

    public void akun(View view) {
        Intent intent = new Intent(home.this, akun.class);
        startActivity(intent);
    }
}
