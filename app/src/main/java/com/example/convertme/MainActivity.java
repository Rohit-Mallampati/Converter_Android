package com.example.convertme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalcDis();
            }
        });

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalcWeigh();
            }
        });
    }
    public void CalcDis(){
        Intent intent1 = new Intent(this, CalcDis.class);
        startActivity(intent1);
    }

    public void CalcWeigh(){
        Intent intent2 = new Intent(this, CalcWeigh.class);
        startActivity(intent2);
    }
}
