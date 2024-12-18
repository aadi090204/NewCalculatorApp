package com.example.newcalculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Divsion extends AppCompatActivity {


    TextView t5;

    String getNum7,getNum8,result;
    int num7,num8,quotient;
    EditText et1,et2;
    Button b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_divsion);


        et1=(EditText) findViewById(R.id.n7);
        et2=(EditText) findViewById(R.id.n8);
        b5=(Button) findViewById(R.id.dabt);
        b6=(Button) findViewById(R.id.dbbt);
        t5=(TextView) findViewById(R.id.r3);



        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum7=et1.getText().toString();
                getNum8=et2.getText().toString();
                num7=Integer.parseInt(getNum7);
                num8=Integer.parseInt(getNum8);
                quotient=num7/num8;
                result=String.valueOf(quotient);
                t5.setText(result);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob6=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob6);
            }
        });

    }
}