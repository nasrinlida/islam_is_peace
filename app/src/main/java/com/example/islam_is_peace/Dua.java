package com.example.islam_is_peace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class Dua extends AppCompatActivity {
    MaterialButton durood_english,durood_bangla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);

        durood_english=findViewById(R.id.durood_english);
        durood_bangla=findViewById(R.id.durood_bangla);

        durood_english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent durood_english=new Intent(Dua.this,Durood_english.class);
                startActivity(durood_english);
            }
        });
        durood_bangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent durood_bangla=new Intent(Dua.this,Durood_Bangla.class);
                startActivity(durood_bangla);
            }
        });
    }
}
