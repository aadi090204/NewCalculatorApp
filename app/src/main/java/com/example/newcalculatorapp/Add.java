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

public class Add extends AppCompatActivity {

    TextView t;
    EditText et7,et8;
    Button b5,b6;
    String getNum1,getNum2,result;
    int num1,num2,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);


        et7=(EditText) findViewById(R.id.n1);
        et8=(EditText) findViewById(R.id.n2);
        b5=(Button) findViewById(R.id.aabt);
        b6=(Button) findViewById(R.id.abbt);
        t=(TextView) findViewById(R.id.re);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getNum1=et7.getText().toString();
                getNum2=et8.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                sum=num1+num2;
                result=String.valueOf(sum);
                System.out.println(result);
                t.setText(result);
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