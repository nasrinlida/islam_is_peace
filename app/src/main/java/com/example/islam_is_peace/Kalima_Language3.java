package com.example.islam_is_peace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class Kalima_Language3 extends AppCompatActivity {
    MaterialButton english3,bangla3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalima__language3);

        english3=findViewById(R.id.english3);
        bangla3=findViewById(R.id.bangla3);

        english3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent english3=new Intent(Kalima_Language3.this,Tawheed_English.class);
                startActivity(english3);
            }
        });
        bangla3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bangla3=new Intent(Kalima_Language3.this,Tawheed_Bangla.class);
                startActivity(bangla3);
            }
        });
    }
}
