package com.example.islam_is_peace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class Surah_List extends AppCompatActivity {
    TextView surah;
    MaterialButton fatiha,ikhlas,kausar,nas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah__list);

        surah=findViewById(R.id.surah);
        fatiha=findViewById(R.id.fatiha);
        ikhlas=findViewById(R.id.ikhlas);
        kausar=findViewById(R.id.kausar);
        nas=findViewById(R.id.nas);

        fatiha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fatiha=new Intent(Surah_List.this,Fatiha_Language.class);
                startActivity(fatiha);
            }
        });
        ikhlas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ikhlas=new Intent(Surah_List.this,Ikhlas_Language.class);
                startActivity(ikhlas);
            }
        });
        kausar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kausar=new Intent(Surah_List.this,Kausar_Language.class);
                startActivity(kausar);
            }
        });

        nas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nas=new Intent(Surah_List.this,Nas_Language.class);
                startActivity(nas);
            }
        });
    }
}
