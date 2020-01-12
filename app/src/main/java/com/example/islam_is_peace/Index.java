package com.example.islam_is_peace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class Index extends AppCompatActivity {
    TextView index;
    MaterialButton kalima,ajan,salat,quotes,dua,developer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        index=findViewById(R.id.index);
        kalima=findViewById(R.id.material_btn1);
        ajan=findViewById(R.id.material_btn2);
        salat=findViewById(R.id.material_btn3);
        quotes=findViewById(R.id.material_btn4);
        dua=findViewById(R.id.material_btn5);
        developer=findViewById(R.id.developer);

        kalima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kalima=new Intent(Index.this,Four_Kalima.class);
                startActivity(kalima);
            }
        });
        ajan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ajan=new Intent(Index.this,Ajan.class);
                startActivity(ajan);
            }
        });
        salat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent salat=new Intent(Index.this,Namaz.class);
                startActivity(salat);
            }
        });
        quotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quotes=new Intent(Index.this,Quotes.class);
                startActivity(quotes);
            }
        });
        dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dua=new Intent(Index.this,Dua.class);
                startActivity(dua);
            }
        });

        developer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent developer=new Intent(Index.this,Developer.class);
                startActivity(developer);
            }
        });
    }
}
