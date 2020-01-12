package com.example.islam_is_peace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class Ajan_Language extends AppCompatActivity {
    MaterialButton ajan_english,ajan_bangla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajan__language);

        ajan_english=findViewById(R.id.ajan_english);
        ajan_bangla=findViewById(R.id.ajan_bangla);

        ajan_english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ajan_english=new Intent(Ajan_Language.this,Ajan_English.class);
                startActivity(ajan_english);
            }
        });

        ajan_bangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ajan_bangla=new Intent(Ajan_Language.this,Ajan_Bangla.class);
                startActivity(ajan_bangla);
            }
        });
    }
}
