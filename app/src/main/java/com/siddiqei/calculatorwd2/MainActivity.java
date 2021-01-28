package com.siddiqei.calculatorwd2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText numberOne,numberTwo;
    private Button buttonPlus,buttonMinus;
    private TextView textAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberOne=findViewById(R.id.edittextnumber1);
        numberTwo=findViewById(R.id.editTextNumber2);
        buttonPlus=findViewById(R.id.buttonPlus);
        buttonMinus=findViewById(R.id.buttonMinus);
        textAns=findViewById(R.id.textViewAns);
        //Double.parseDouble
        /**
         *
         */


        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1=Double.parseDouble(numberOne.getText().toString());
                double num2=Double.parseDouble(numberTwo.getText().toString());
                textAns.setText(String.valueOf(num1+num2));
                numberOne.setText("");
                numberTwo.setText("");
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1=Double.parseDouble(numberOne.getText().toString());
                double num2=Double.parseDouble(numberTwo.getText().toString());
                textAns.setText(String.valueOf(num1-num2));
                numberOne.setText("");
                numberTwo.setText("");
            }
        });



    }

//    public double doPlus(double a, double b)
//    {
//        return a+b;
//    }
}