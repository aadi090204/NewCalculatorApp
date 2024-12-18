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

public class Subtraction extends AppCompatActivity {


    TextView t;
    EditText et5,et6;
    Button b5,b6;
    String getNum3,getNum4,result;
    int num3,num4,diff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_subtraction);


        et5=(EditText) findViewById(R.id.n3);
        et6=(EditText) findViewById(R.id.n4);
        b5=(Button) findViewById(R.id.sabt);
        b6=(Button) findViewById(R.id.sbbt);
        t=(TextView) findViewById(R.id.res1);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum3=et5.getText().toString();
                getNum4=et6.getText().toString();
                num3=Integer.parseInt(getNum3);
                num4=Integer.parseInt(getNum4);
                diff=num3-num4;
                result=String.valueOf(diff);
                t.setText(result);

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob7=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob7);
            }
        });



    }
}