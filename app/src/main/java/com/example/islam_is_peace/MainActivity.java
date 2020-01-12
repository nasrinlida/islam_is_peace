package com.example.islam_is_peace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    ImageView book;
    MaterialButton goto_index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        book=findViewById(R.id.book);
        goto_index=findViewById(R.id.goto_index);

        goto_index.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goto_index = new Intent(MainActivity.this,Index.class);
                startActivity(goto_index);
            }
        });


    }
}
