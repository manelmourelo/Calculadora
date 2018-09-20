package com.example.manelmm3.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculadoraActivity extends AppCompatActivity {

    private TextView numview;
    private String num = "";
    private String operator = "";
    private String prev_num = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        numview = findViewById(R.id.curr_num);
        numview.setText(num);

    }

    public void OnClickDigit(View view){
        Button b = (Button) view;
        num+=b.getText().toString().charAt(0);
        numview.setText(num);
    }

    public void OnClickOperator(View view){
        Button b = (Button) view;
        operator = b.getText().toString();
        prev_num = num;
        num = "";
        numview.setText(num);
    }

    public void OnClickEqual(View view){
        String result = "";
        double result_num = 0;
        double num1 = Double.parseDouble(prev_num);
        double num2 = Double.parseDouble(num);
        if(operator.equals("+")){
            result_num = num1+num2;
        }
        else if(operator.equals("-")){
            result_num = num1-num2;
        }
        else if(operator.equals("*")){
            result_num = num1*num2;
        }
        else if(operator.equals("/")){
            result_num = num1/num2;
        }
        result = String.valueOf(result_num);
        prev_num = result;
        num = "";
        numview.setText(result);
    }

    public void OnClickDot(View view){

    }
}
