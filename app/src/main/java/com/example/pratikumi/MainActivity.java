package com.example.pratikumi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.pratikumi.views.InputActivity;

public class MainActivity extends AppCompatActivity {

    Button btMulai;
    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btMulai = findViewById(R.id.btMulai);

        Log.i(TAG, "Siklus OnCreate");

        btMulai.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent mulai = new Intent(MainActivity.this, InputActivity.class);
                startActivity(mulai);

            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Siklus onStart");
        Toast.makeText(this, "Siklus onstrat", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "Siklus onResume");
        Toast.makeText(this, "Siklus onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "Siklus onPause");
        Toast.makeText(this, "Siklus onPause", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG, "Siklus onStop");
        Toast.makeText(this, "Siklus onStop", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Siklus onDestroy");
        Toast.makeText(this, "Siklus onDestroy", Toast.LENGTH_SHORT).show();
    }
}