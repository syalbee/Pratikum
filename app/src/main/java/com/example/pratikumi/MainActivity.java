package com.example.pratikumi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pratikumi.views.InputActivity;

public class MainActivity extends AppCompatActivity {

    Button btMulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btMulai = findViewById(R.id.btMulai);

        btMulai.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent mulai = new Intent(MainActivity.this, InputActivity.class);
                startActivity(mulai);

            }
        });

    }
}