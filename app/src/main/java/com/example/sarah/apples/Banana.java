package com.example.sarah.apples;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Banana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banana);
    }


    public void onClick(View view)
    {
        Intent b = new Intent(this, MainActivity.class);
        startActivity(b);
    }
}
