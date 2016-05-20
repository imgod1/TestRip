package com.example.gaokang.testrip;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.balysv.materialripple.MaterialRippleLayout;

public class MainActivity extends AppCompatActivity {

    private TextView txt_test1, txt_test2, txt_test3, txt_test4, txt_test5, txt_test6;
    private MaterialRippleLayout mrLayout1, mrLayout2, mrLayout3, mrLayout4, mrLayout5, mrLayout6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_test1 = (TextView) findViewById(R.id.txt_test1);
        mrLayout1 = (MaterialRippleLayout) findViewById(R.id.mrLayout1);
        mrLayout1.setRippleColor(Color.BLACK);
        txt_test1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });


        txt_test2 = (TextView) findViewById(R.id.txt_test2);
        mrLayout2 = (MaterialRippleLayout) findViewById(R.id.mrLayout2);
        mrLayout2.setRippleColor(Color.RED);
        txt_test2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });


        txt_test3 = (TextView) findViewById(R.id.txt_test3);
        mrLayout3 = (MaterialRippleLayout) findViewById(R.id.mrLayout3);
        mrLayout3.setRippleColor(Color.GREEN);
        txt_test3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        txt_test4 = (TextView) findViewById(R.id.txt_test4);
        mrLayout4 = (MaterialRippleLayout) findViewById(R.id.mrLayout4);
        mrLayout4.setRippleColor(Color.BLUE);
        txt_test4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });


        txt_test5 = (TextView) findViewById(R.id.txt_test5);
        mrLayout5 = (MaterialRippleLayout) findViewById(R.id.mrLayout5);
        mrLayout5.setRippleColor(Color.YELLOW);
        txt_test5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        txt_test6 = (TextView) findViewById(R.id.txt_test6);
        mrLayout6 = (MaterialRippleLayout) findViewById(R.id.mrLayout6);
        mrLayout6.setRippleColor(Color.LTGRAY);
        txt_test6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

    }
}
