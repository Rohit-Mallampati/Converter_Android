package com.example.convertme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class CalcDis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_dis);
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

        RadioButton miles = (RadioButton)findViewById(R.id.miles);
        RadioButton km = (RadioButton)findViewById(R.id.km);

        double returnval = 0;
        String units = "";
        String result = "";
        if (miles.isChecked()){
            returnval  =  input*1.609;
            units = "km";
        }

        else if (km.isChecked()){
            returnval  =  input*0.62137;
            units = "miles";

        }

        result = Double.toString(returnval);

        TextView tv = (TextView)findViewById(R.id.result1);
        tv.setText(result);

        TextView unitonresult = (TextView)findViewById(R.id.unit1);
        unitonresult.setText(units);
    }
}
