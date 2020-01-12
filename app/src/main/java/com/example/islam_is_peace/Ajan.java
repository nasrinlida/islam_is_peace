package com.example.islam_is_peace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class Ajan extends AppCompatActivity {
    TextView ajan;
    MaterialButton ajan_ans,ajan_dua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajan);

        ajan=findViewById(R.id.ajan);
        ajan_ans=findViewById(R.id.ajan_ans);
        ajan_dua=findViewById(R.id.ajan_dua);

        ajan_ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ajan_ans=new Intent(Ajan.this,Ajan_Language.class);
                startActivity(ajan_ans);
            }
        });

        ajan_dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ajan_dua=new Intent(Ajan.this,Ajan_Language2.class);
                startActivity(ajan_dua);
            }
        });
    }
}
