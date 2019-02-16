package com.example.alexim.allcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Math.sqrt;

public class Fis2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fis2);
    }
    public void F2_1(View v){
        TextView operationField1 = (TextView) findViewById(R.id.operationField1_1f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField1_1f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField1_2f);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".") && !numberField2.getText().toString().equals(".")) {
            double m = Double.parseDouble(numberField1.getText().toString());
            double a = Double.parseDouble(numberField2.getText().toString());
            double result = 0;
            result = m * a;
            operationField1.setText(Double.toString(result));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void F2_2(View v){
        TextView operationField1 = (TextView) findViewById(R.id.operationField2_1f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField2_1f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField2_2f);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".") && !numberField2.getText().toString().equals(".")) {
            double k = Double.parseDouble(numberField1.getText().toString());
            double x = Double.parseDouble(numberField2.getText().toString());
            double result = 0;
            result = k * x;
            operationField1.setText(Double.toString(result));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void F3_2(View v){
        TextView operationField1 = (TextView) findViewById(R.id.operationField3_1f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField3_1f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField3_2f);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".") && !numberField2.getText().toString().equals(".")) {
            double k = Double.parseDouble(numberField1.getText().toString());
            double x = Double.parseDouble(numberField2.getText().toString());
            double result = 0,e;
            for (double i=0; i<=x; i++){
                result = 0;
                e = i;
                while (e>0){
                    result+=k;
                    e--;
                }
            }
            operationField1.setText(Double.toString(result));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void F4_2(View v){
        TextView operationField1 = (TextView) findViewById(R.id.operationField4_1f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField4_1f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField4_2f);
        EditText numberField3 = (EditText) findViewById(R.id.numberField5_2f);
        EditText numberField4 = (EditText) findViewById(R.id.numberField6_2f);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".") && !numberField2.getText().toString().equals(".")
                && !numberField3.getText().toString().equals("")&& !numberField4.getText().toString().equals("")
                && !numberField3.getText().toString().equals(".")&& !numberField4.getText().toString().equals(".")) {
            double G = Double.parseDouble(numberField1.getText().toString());
            double M = Double.parseDouble(numberField2.getText().toString());
            double m = Double.parseDouble(numberField3.getText().toString());
            double r = Double.parseDouble(numberField4.getText().toString());
            double result = 0,RESr = 0,e,Mm,Del;
            for (double i=0; i<=2; i++){
                RESr = 1;
                e = i;
                while (e>0){
                    RESr*=r;
                    e--;
                }
            }
            result = G * ((M*m)/RESr);
            operationField1.setText(Double.toString(result));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void F6_1(View v){
        TextView operationField1 = (TextView) findViewById(R.id.operationField6_1f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField7_1f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField8_2f);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".") && !numberField2.getText().toString().equals(".")) {
            double g = Double.parseDouble(numberField1.getText().toString());
            double r = Double.parseDouble(numberField2.getText().toString());
            double result = 0;
            result = sqrt(g * r);
            operationField1.setText(Double.toString(result));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void Del2_1f(View view){
        TextView operationField1 = (TextView) findViewById(R.id.operationField1_1f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField1_1f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField1_2f);
        operationField1.setText("Ответ:");
        numberField1.setText("");
        numberField2.setText("");
    }
    public void Del2_2f(View view){
        TextView operationField1 = (TextView) findViewById(R.id.operationField2_1f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField2_1f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField2_2f);
        operationField1.setText("Ответ:");
        numberField1.setText("");
        numberField2.setText("");
    }
    public void Del3_2f(View view){
        TextView operationField1 = (TextView) findViewById(R.id.operationField3_1f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField3_1f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField3_2f);
        operationField1.setText("Ответ:");
        numberField1.setText("");
        numberField2.setText("");
    }
    public void Del4_2f(View view){
        TextView operationField1 = (TextView) findViewById(R.id.operationField4_1f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField4_1f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField4_2f);
        EditText numberField3 = (EditText) findViewById(R.id.numberField5_2f);
        EditText numberField4 = (EditText) findViewById(R.id.numberField6_2f);
        operationField1.setText("Ответ:");
        numberField1.setText("");
        numberField2.setText("");
        numberField3.setText("");
        numberField4.setText("");
    }
    public void Del6_1f(View view){
        TextView operationField1 = (TextView) findViewById(R.id.operationField6_1f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField7_1f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField8_2f);
        operationField1.setText("Ответ:");
        numberField1.setText("");
        numberField2.setText("");

    }
}
