package com.example.pruebacalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Acticity_resta extends AppCompatActivity implements View.OnClickListener {


    Button  anterior;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acticity_resta);

        anterior=(Button) findViewById(R.id.btnanterior);

        anterior.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intentBtnA =new Intent(this,MainActivity.class);
        startActivity(intentBtnA);
    }
}
