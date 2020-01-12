package com.example.islam_is_peace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class Namaz extends AppCompatActivity {
    TextView namaz;
    MaterialButton surah,tashahhud,durood,dua_masura,dua_kunut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namaz);

        namaz=findViewById(R.id.namaz);
        surah=findViewById(R.id.surah);
        tashahhud=findViewById(R.id.tashahhud);
        durood=findViewById(R.id.durood);
        dua_masura=findViewById(R.id.dua_masura);
        dua_kunut=findViewById(R.id.dua_kunut);

        surah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent surah=new Intent(Namaz.this,Surah_List.class);
                startActivity(surah);
            }
        });



        tashahhud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tashahhud=new Intent(Namaz.this,Tashahhud_Language.class);
                startActivity(tashahhud);
            }
        });


        durood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent durood=new Intent(Namaz.this,Dorud_Language.class);
                startActivity(durood);
            }
        });


        dua_masura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dua_masura=new Intent(Namaz.this,Dua_Masura_Language.class);
                startActivity(dua_masura);
            }
        });


        dua_kunut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dua_kunut=new Intent(Namaz.this,Dua_Kunut_Language.class);
                startActivity(dua_kunut);
            }
        });


    }
}
