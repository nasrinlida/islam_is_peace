package com.example.islam_is_peace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class Kalima_Language2 extends AppCompatActivity {
    MaterialButton english2,bangla2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalima__language2);

        english2=findViewById(R.id.english2);
        bangla2=findViewById(R.id.bangla2);

        english2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent english2=new Intent(Kalima_Language2.this,Shahadat_English.class);
                startActivity(english2);
            }
        });

        bangla2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bangla2=new Intent(Kalima_Language2.this,Shahadat_Bangla.class);
                startActivity(bangla2);
            }
        });
    }
}
