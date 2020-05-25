package com.example.convertme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class CalcWeigh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_weigh);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.unit_converter, menu);
        return true;
    }


    public void get_data(View v){

        EditText inputTextbox = (EditText)findViewById(R.id.inputTextbox1);
        double input = Double.valueOf(inputTextbox.getText().toString());

        RadioButton lbs = (RadioButton)findViewById(R.id.pounds);
        RadioButton kg = (RadioButton)findViewById(R.id.kg);

        double returnval = 0;
        String units = "";
        String result = "";
        if (lbs.isChecked()){
            returnval = input*0.453592;
            units = "kg";
        }


        else if (kg.isChecked()){
            returnval = 2.2*input;
            units = "pounds";
        }

        result = Double.toString(returnval);

        TextView tv = (TextView)findViewById(R.id.result1);
        tv.setText(result);

        TextView unitonresult = (TextView)findViewById(R.id.unit1);
        unitonresult.setText(units);
    }
}
