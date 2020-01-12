package com.example.islam_is_peace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class Kalima_Language4 extends AppCompatActivity {
    MaterialButton english4,bangla4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalima__language4);

        english4=findViewById(R.id.english4);
        bangla4=findViewById(R.id.bangla4);

        english4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent english4=new Intent(Kalima_Language4.this,Tamjid_English.class);
                startActivity(english4);
            }
        });
        bangla4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bangla4=new Intent(Kalima_Language4.this,Tamjid_Bangla.class);
                startActivity(bangla4);
            }
        });
    }
}
