package com.example.islam_is_peace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class Ajan_Language2 extends AppCompatActivity {
    MaterialButton ajan_dua_english,ajan_dua_bangla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajan__language2);

        ajan_dua_english=findViewById(R.id.ajan_english2);
        ajan_dua_bangla=findViewById(R.id.ajan_bangla2);

        ajan_dua_english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ajan_dua_english=new Intent(Ajan_Language2.this,Ajan_Dua_English.class);
                startActivity(ajan_dua_english);
            }
        });
        ajan_dua_bangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ajan_dua_bangla=new Intent(Ajan_Language2.this,Ajan_Dua_Bangla.class);
                startActivity(ajan_dua_bangla);
            }
        });
    }
}
