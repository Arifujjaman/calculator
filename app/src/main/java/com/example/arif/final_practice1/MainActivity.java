package com.example.arif.final_practice1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bmod,bac,bequal,bdot;
    TextView ans;
    boolean add,mul,sub,div,mod;
    double var1,var2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b4=findViewById(R.id.btn4);
        b5=findViewById(R.id.btn5);
        b6=findViewById(R.id.btn6);
        b7=findViewById(R.id.btn7);
        b8=findViewById(R.id.btn8);
        b9=findViewById(R.id.btn9);
        b0=findViewById(R.id.btn0);
        bdot=findViewById(R.id.btndot);
        badd=findViewById(R.id.btnadd);
        bsub=findViewById(R.id.btnsub);
        bmul=findViewById(R.id.btnmul);
        bac=findViewById(R.id.btnac);
        bmod=findViewById(R.id.btnmod);
        bequal=findViewById(R.id.btneq);
        bdiv=findViewById(R.id.btndiv);
        ans=findViewById(R.id.text);


        


    }
}
