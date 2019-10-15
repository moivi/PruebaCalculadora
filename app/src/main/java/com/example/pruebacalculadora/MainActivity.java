package com.example.pruebacalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt1,bt2,bt3,bt4;
    TextView msj,rel;
    EditText num1,num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1=(Button) findViewById(R.id.btn1);
        bt2=(Button) findViewById(R.id.btn2);
        bt3=(Button) findViewById(R.id.btn3);
        bt4=(Button) findViewById(R.id.btn4);
        msj=(TextView) findViewById(R.id.msg);
        num1=(EditText) findViewById(R.id.edit1);
        num2=(EditText) findViewById(R.id.edit2);
        rel=(TextView) findViewById(R.id.resul);

        bt1.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        int n1 =Integer.parseInt(num1.getText().toString());
        int n2 =Integer.parseInt(num2.getText().toString());

        if (view.getId()==R.id.btn1)
        {
            Intent intentBtn1 =new Intent(this,Activity_suma.class);
            startActivity(intentBtn1);
        }
        else if (view.getId()==R.id.btn2)
        {
            Intent intentBtn2 =new Intent(this,Acticity_resta.class);
            startActivity(intentBtn2);
        }
        else if (view.getId()==R.id.btn3)
        {
            rel.setText("la multiplicacion "+(n1*n2));
        }
        else if (view.getId()==R.id.btn4)
        {
            Toast.makeText(this,"LA DIVISION ES : "+(n1/n2),Toast.LENGTH_LONG).show();
        }
    }
}
