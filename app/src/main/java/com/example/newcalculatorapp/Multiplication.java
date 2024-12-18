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

public class Multiplication extends AppCompatActivity {

    TextView t2;
    String getNum5,getNum6,result;
    int num5,num6,product;
    EditText et3,et4;
    Button b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_multiplication);

        et3=(EditText) findViewById(R.id.n5);
        et4=(EditText) findViewById(R.id.n6);

        b5=(Button) findViewById(R.id.mabt);
        b6=(Button) findViewById(R.id.mbbt);

        t2=(TextView) findViewById(R.id.r1);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


        getNum5=et3.getText().toString();
        getNum6=et4.getText().toString();
        num5=Integer.parseInt(getNum5);
        num6=Integer.parseInt(getNum6);
        product=num5*num6;
        result=String.valueOf(product);
        t2.setText(result);
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