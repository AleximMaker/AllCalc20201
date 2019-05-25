package com.example.alexim.allcalc.Fis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alexim.allcalc.R;

import static java.lang.Math.cos;

public class Fis3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fis3);
    }
    public void F2_1(View v){
        TextView operationField1 = (TextView) findViewById(R.id.operationField1_1f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField1_1f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField1_2f);
        EditText numberField3 = (EditText) findViewById(R.id.numberField1_3f);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".") && !numberField2.getText().toString().equals(".")
                && !numberField3.getText().toString().equals(".") && !numberField3.getText().toString().equals("")) {
            double f = Double.parseDouble(numberField1.getText().toString());
            double s = Double.parseDouble(numberField2.getText().toString());
            double a = Double.parseDouble(numberField3.getText().toString());
            double result = 0;
            result = f * s * cos(a);
            operationField1.setText(Double.toString(result));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void F3_1(View v){
        TextView operationField1 = (TextView) findViewById(R.id.operationField2_1f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField2_1f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField2_2f);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".") && !numberField2.getText().toString().equals(".")) {
            double a = Double.parseDouble(numberField1.getText().toString());
            double t = Double.parseDouble(numberField2.getText().toString());
            double result = 0;
            result= a / t;
            operationField1.setText(Double.toString(result));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void F4_1(View v){
        TextView operationField1 = (TextView) findViewById(R.id.operationField3_1f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField3_1f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField3_2f);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".") && !numberField2.getText().toString().equals(".")) {
            double a = Double.parseDouble(numberField1.getText().toString());
            double A = Double.parseDouble(numberField2.getText().toString());
            double result = 0;
            result= a / A;
            operationField1.setText(Double.toString(result));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void Del1_1f(View view){
        TextView operationField1 = (TextView) findViewById(R.id.operationField1_1f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField1_1f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField1_2f);
        EditText numberField3 = (EditText) findViewById(R.id.numberField1_3f);
        operationField1.setText("Ответ:");
        numberField1.setText("");
        numberField2.setText("");
        numberField3.setText("");
    }
    public void Del2_1f(View view){
        TextView operationField1 = (TextView) findViewById(R.id.operationField1_1f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField1_1f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField1_2f);
        operationField1.setText("Ответ:");
        numberField1.setText("");
        numberField2.setText("");
    }
    public void Del3_1f(View view){
        TextView operationField1 = (TextView) findViewById(R.id.operationField3_1f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField3_1f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField3_2f);
        operationField1.setText("Ответ:");
        numberField1.setText("");
        numberField2.setText("");
    }
}
