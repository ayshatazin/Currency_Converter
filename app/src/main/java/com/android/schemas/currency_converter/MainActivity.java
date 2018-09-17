package com.android.schemas.currency_converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private RadioButton radioButton;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private RadioButton radioButton4;
    private RadioButton radioButton5;
    private RadioButton radioButton6;
    private RadioButton radioButton7;
    private RadioButton radioButton8;
    private RadioButton radioButton9;
    private RadioButton radioButton10;
    private Button button;
    private TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.edittext);
        radioButton = (RadioButton) findViewById(R.id.radioButton);
        radioButton1 = (RadioButton) findViewById(R.id.radioButton2);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton3);
        radioButton3 = (RadioButton) findViewById(R.id.radioButton4);
        radioButton4 = (RadioButton) findViewById(R.id.radioButton5);
        radioButton5 = (RadioButton) findViewById(R.id.radioButton6);
        radioButton6 = (RadioButton) findViewById(R.id.radioButton7);
        radioButton7 = (RadioButton) findViewById(R.id.radioButton8);
        radioButton8 = (RadioButton) findViewById(R.id.radioButton9);
        radioButton9 = (RadioButton) findViewById(R.id.radioButton10);

        button = (Button) findViewById(R.id.button);
        textview = (TextView) findViewById(R.id.textview);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double num1 = Double.parseDouble(editText.getText().toString());
                Double result = 0.0;

               if(radioButton.isChecked()) {
                   result = num1 * 0.86;
               }
               else if(radioButton1.isChecked()) {
                   result = num1 - 0.02;
               }
               else if(radioButton2.isChecked()) {
                   result = num1 * 0.08;
               }
               else if(radioButton3.isChecked()) {
                   result = num1 * 0.09;
               }
               else if(radioButton4.isChecked()) {
                   result = num1 * 13.35;
               }
               else if(radioButton5.isChecked()) {
                   result = num1 * 1;
               }
               else if(radioButton6.isChecked()) {
                   result = num1 * 1.95;
               }
               else if(radioButton7.isChecked()) {
                   result = num1 * 1;
               }
               else if(radioButton8.isChecked()) {
                   result = num1 * 0.04;
               }
               else if(radioButton9.isChecked()) {
                   result = num1 * 0.02;
               }
               textview.setText("Converted Amont is    " + result);
            }
        });
    }

}
