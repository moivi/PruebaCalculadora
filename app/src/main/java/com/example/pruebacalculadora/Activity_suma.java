package com.example.pruebacalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_suma extends AppCompatActivity implements View.OnClickListener {

    Button devolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);

        devolver=(Button) findViewById(R.id.btndevol);

        devolver.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Intent intentBtnD =new Intent(this,MainActivity.class);
        startActivity(intentBtnD);
    }
}
