package com.example.islam_is_peace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class Four_Kalima extends AppCompatActivity {
    TextView four_kalima;
    MaterialButton taiyeba,shahadat,tawheed,tamjid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four__kalima);

        four_kalima=findViewById(R.id.Four_kalima);
        taiyeba=findViewById(R.id.taiyeba);
        shahadat=findViewById(R.id.shahadat);
        tawheed=findViewById(R.id.tauhid);
        tamjid=findViewById(R.id.tamjid);

        taiyeba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent taiyeba=new Intent(Four_Kalima.this,Kalima_Language.class);
                startActivity(taiyeba);
            }
        });

        shahadat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shahadat=new Intent(Four_Kalima.this,Kalima_Language2.class);
                startActivity(shahadat);
            }
        });
        tawheed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tawheed=new Intent(Four_Kalima.this,Kalima_Language3.class);
                startActivity(tawheed);
            }
        });
        tamjid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tamjid=new Intent(Four_Kalima.this,Kalima_Language4.class);
                startActivity(tamjid);
            }
        });
    }
}
