package com.tuannguyen.bai2buoi1;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    Button btn1, btn2, btn3, btn4;
    EditText edt1, edt2, edt3;
    String input1,input2;
    int a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = (EditText) findViewById(R.id.edt1);
        edt2 = (EditText) findViewById(R.id.edt2);
        edt3 = (EditText) findViewById(R.id.edt3);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 = edt1.getText().toString();
                input2 = edt2.getText().toString();
                a = Integer.parseInt(input1);
                b = Integer.parseInt(input2);
                edt3.setText(String.valueOf(a+b));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 = edt1.getText().toString();
                input2 = edt2.getText().toString();
                a = Integer.parseInt(input1);
                b = Integer.parseInt(input2);
                edt3.setText(String.valueOf(a-b));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 = edt1.getText().toString();
                input2 = edt2.getText().toString();
                a = Integer.parseInt(input1);
                b = Integer.parseInt(input2);
                edt3.setText(String.valueOf(a*b));
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1 = edt1.getText().toString();
                input2 = edt2.getText().toString();
                a = Integer.parseInt(input1);
                b = Integer.parseInt(input2);
                edt3.setText(String.valueOf(a/b));
            }
        });

    }


}
