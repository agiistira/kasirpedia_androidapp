package com.example.new_kasirpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton btn_buatakun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_buatakun = findViewById(R.id.btn_buatakun);

        btn_buatakun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (MainActivity.this, daftar.class);
                startActivity(i);
            }
        });
    }

    public void masuk(View view) {
        Intent intent = new Intent(MainActivity.this, login.class);
        startActivity(intent);
    }
}