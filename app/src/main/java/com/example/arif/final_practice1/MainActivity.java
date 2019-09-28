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


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+".");
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(null);
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans==null){
                    ans.setText("");
                }
                else{
                    var1=Double.parseDouble(ans.getText()+"");
                    add=true;
                    ans.setText(null);
                }
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans==null){
                    ans.setText("");
                }
                else{
                    var1=Double.parseDouble(ans.getText()+"");
                    sub=true;
                    ans.setText(null);
                }
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans==null){
                    ans.setText("");
                }
                else{
                    var1=Double.parseDouble(ans.getText()+"");
                    mul=true;
                    ans.setText(null);
                }
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans==null){
                    ans.setText("");
                }
                else{
                    var1=Double.parseDouble(ans.getText()+"");
                    div=true;
                    ans.setText(null);
                }
            }
        });
        bmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ans==null){
                    ans.setText("");
                }
                else{
                    var1=Double.parseDouble(ans.getText()+"");
                    mod=true;
                    ans.setText(null);
                }
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2=Double.parseDouble(ans.getText()+"");
                if(add==true){
                    ans.setText(var1+var2+"");
                    add=false;
                }
                if(sub==true){
                    ans.setText(var1-var2+"");
                    sub=false;
                }
                if(mul==true){
                    ans.setText(var1*var2+"");
                    mul=false;
                }
                if(div==true){
                    ans.setText(var1/var2+"");
                    div=false;
                }
                if(mod==true){
                    if(var2==0){
                        ans.setText("error");
                    }
                    else{
                        ans.setText(var1%var2+"");
                        mod=false;
                    }

                }
            }
        });


    }
}
