package com.zentek.ethan.droplock;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button calc_button;
    private TextView result;
    private EditText etfirst,etsecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calc_button = (Button)findViewById(R.id.calc_button);
        calc_button.setOnClickListener(this);
        //removed toolbar creation section because there is not one.
        etfirst = (EditText)findViewById(R.id.input1);
        etsecond = (EditText)findViewById(R.id.input2);
        result = (TextView)findViewById(R.id.result);

    }

    @Override
    public void onClick(View calc_button) {
        String num1 = etfirst.getText().toString();
        String num2 = etsecond.getText().toString();
        switch(calc_button.getId()) {
            case R.id.calc_button:
                try {
                    int division = (Integer.parseInt(num1) / Integer.parseInt(num2));
                    result.setText((String.valueOf(division)));

                }
                catch(Exception e) {
                    result.setText("CALCULATION ERROR");
                }
                break;
        }
    }
}
