package com.example.islam_is_peace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class Quotes extends AppCompatActivity {
    MaterialButton quotes_english,quotes_bangla;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);

        quotes_english=findViewById(R.id.quotes_english);
        quotes_bangla=findViewById(R.id.quotes_bangla);

        quotes_english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quotes_english=new Intent(Quotes.this,Quotes_English.class);
                startActivity(quotes_english);
            }
        });
        quotes_bangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quotes_bangla=new Intent(Quotes.this,Quotes_Bangla.class);
                startActivity(quotes_bangla);
            }
        });
    }
}
