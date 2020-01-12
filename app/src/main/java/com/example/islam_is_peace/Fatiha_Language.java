package com.example.islam_is_peace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class Fatiha_Language extends AppCompatActivity {
    MaterialButton english,bangla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fatiha__language);

        english=findViewById(R.id.english);
        bangla=findViewById(R.id.bangla);

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent english=new Intent(Fatiha_Language.this,Fatiha_English.class);
                startActivity(english);
            }
        });
        bangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bangla=new Intent(Fatiha_Language.this,Fatiha_Bangla.class);
                startActivity(bangla);
            }
        });


    }
}
