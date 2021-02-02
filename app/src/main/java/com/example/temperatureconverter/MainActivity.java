package com.example.temperatureconverter;


import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public CheckBox celsius, fahrenheit;
    public EditText tempadd;
    public TextView dtemp;
    double result;
    DecimalFormat df=new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        celsius = findViewById(R.id.checkBox_celsius);
        fahrenheit = findViewById(R.id.checkbox_fahrenheit);
        tempadd = findViewById(R.id.editText_temp);
        dtemp = findViewById(R.id.textView_displayTemp);


        celsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(celsius.isChecked()) {
                    double temp = Double.valueOf(tempadd.getText().toString());
                    result = (temp * 1.8) + 32;
                    dtemp.setText(String.valueOf(df.format(result) + "F"));
                }
            }
        });

        fahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fahrenheit.isChecked()) {
                    double temp = Double.valueOf(tempadd.getText().toString());
                    result = (temp - 32) * 0.56;
                    dtemp.setText(String.valueOf(df.format(result) + "C"));
                }
            }
        });



        }
    }
