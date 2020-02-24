package com.example.mylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    public void StreamOne(View view){

        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
        startActivity(intent);
        Toast.makeText(this, "RTSP Stream", Toast.LENGTH_LONG).show();

    }

    public void StreamTwo(View view){

        Intent intent = new Intent(SecondActivity.this, FourthActivity.class);
        startActivity(intent);
        Toast.makeText(this, "HTML Stream", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
