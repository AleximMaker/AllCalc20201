package com.example.alexim.allcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alexim.allcalc.R;

public class MatActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mat4);

    }

    public void Minus(View view) {
        TextView operationField1 = (TextView) findViewById(R.id.operationField1);
        EditText numberField1 = (EditText) findViewById(R.id.numberField1);
        EditText numberField2 = (EditText) findViewById(R.id.numberField2);
        EditText numberField3 = (EditText) findViewById(R.id.numberField3);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("") && !numberField3.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".") && !numberField2.getText().toString().equals(".") &&
                !numberField3.getText().toString().equals(".")) {
            double a = Double.parseDouble(numberField1.getText().toString());
            double p = Double.parseDouble(numberField2.getText().toString());
            double g = Double.parseDouble(numberField3.getText().toString());
            double result = 0,result2 = 0,e,resR;
            for (double i=0; i<=p; i++){
                result = 1;
                e = i;
                while (e>0){
                    result*=a;
                    e--;
                }
            }
            for (double i=0; i<=g; i++){
                result2 = 1;
                e = i;
                while (e > 0){
                    result2*=a;
                    e--;
                }
            }
            resR = result * result2;
            operationField1.setText(Double.toString(resR));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void St2(View view) {
        TextView operationField1 = (TextView) findViewById(R.id.operationField2);
        EditText numberField1 = (EditText) findViewById(R.id.numberField4);
        EditText numberField2 = (EditText) findViewById(R.id.numberField5);
        EditText numberField3 = (EditText) findViewById(R.id.numberField6);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("") && !numberField3.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".") && !numberField2.getText().toString().equals(".") &&
                !numberField3.getText().toString().equals(".")) {
            double a = Double.parseDouble(numberField1.getText().toString());
            double p = Double.parseDouble(numberField2.getText().toString());
            double g = Double.parseDouble(numberField3.getText().toString());
            double result = 0,result2 = 0,e,resR;
            for (double i=0; i<=p; i++){
                result = 1;
                e = i;
                while (e>0){
                    result*=a;
                    e--;
                }
            }
            for (double i=0; i<=g; i++){
                result2 = 1;
                e = i;
                while (e > 0){
                    result2*=a;
                    e--;
                }
            }
            resR = result / result2;
            operationField1.setText(Double.toString(resR));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void St3(View view) {
        TextView operationField1 = (TextView) findViewById(R.id.operationField3);
        EditText numberField1 = (EditText) findViewById(R.id.numberField7);
        EditText numberField2 = (EditText) findViewById(R.id.numberField8);
        EditText numberField3 = (EditText) findViewById(R.id.numberField9);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("") && !numberField3.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".") && !numberField2.getText().toString().equals(".") &&
                !numberField3.getText().toString().equals(".")) {
            double a = Double.parseDouble(numberField1.getText().toString());
            double p = Double.parseDouble(numberField2.getText().toString());
            double g = Double.parseDouble(numberField3.getText().toString());
            double result,e,resR = 0;
            result = p * g;
            for (double i=0; i<=result; i++){
                resR = 1;
                e = i;
                while (e>0){
                    resR*=a;
                    e--;
                }
            }
            operationField1.setText(Double.toString(resR));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void St4(View view) {
        TextView operationField1 = (TextView) findViewById(R.id.operationField4);
        EditText numberField1 = (EditText) findViewById(R.id.numberField10);
        EditText numberField2 = (EditText) findViewById(R.id.numberField11);
        EditText numberField3 = (EditText) findViewById(R.id.numberField12);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("") && !numberField3.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".") && !numberField2.getText().toString().equals(".") &&
                !numberField3.getText().toString().equals(".")) {
            double a = Double.parseDouble(numberField1.getText().toString());
            double p = Double.parseDouble(numberField2.getText().toString());
            double g = Double.parseDouble(numberField3.getText().toString());
            double result,e,resR = 0;
            result = a / p;
            for (double i=0; i<=g; i++){
                resR = 1;
                e = i;
                while (e>0){
                    resR*=result;
                    e--;
                }
            }
            operationField1.setText(Double.toString(resR));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void St5(View view) {
        TextView operationField1 = (TextView) findViewById(R.id.operationField5);
        EditText numberField1 = (EditText) findViewById(R.id.numberField13);
        EditText numberField2 = (EditText) findViewById(R.id.numberField14);
        EditText numberField3 = (EditText) findViewById(R.id.numberField15);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("") && !numberField3.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".") && !numberField2.getText().toString().equals(".") &&
                !numberField3.getText().toString().equals(".")) {
            double a = Double.parseDouble(numberField1.getText().toString());
            double p = Double.parseDouble(numberField2.getText().toString());
            double g = Double.parseDouble(numberField3.getText().toString());
            double result,e,resR = 0;
            result = a * p;
            for (double i=0; i<=g; i++){
                resR = 1;
                e = i;
                while (e>0){
                    resR*=result;
                    e--;
                }
            }
            operationField1.setText(Double.toString(resR));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void Del(View v){
        TextView operationField1 = (TextView) findViewById(R.id.operationField1);
        EditText numberField1 = (EditText) findViewById(R.id.numberField1);
        EditText numberField2 = (EditText) findViewById(R.id.numberField2);
        EditText numberField3 = (EditText) findViewById(R.id.numberField3);
        operationField1.setText("Ответ:");
        numberField1.setText("");
        numberField2.setText("");
        numberField3.setText("");
    }
    public void Del2(View view){
        TextView operationField1 = (TextView) findViewById(R.id.operationField2);
        EditText numberField1 = (EditText) findViewById(R.id.numberField4);
        EditText numberField2 = (EditText) findViewById(R.id.numberField5);
        EditText numberField3 = (EditText) findViewById(R.id.numberField6);
        operationField1.setText("Ответ:");
        numberField1.setText("");
        numberField2.setText("");
        numberField3.setText("");
    }
    public void Del3(View view){
        TextView operationField1 = (TextView) findViewById(R.id.operationField3);
        EditText numberField1 = (EditText) findViewById(R.id.numberField7);
        EditText numberField2 = (EditText) findViewById(R.id.numberField8);
        EditText numberField3 = (EditText) findViewById(R.id.numberField9);
        operationField1.setText("Ответ:");
        numberField1.setText("");
        numberField2.setText("");
        numberField3.setText("");
    }
    public void Del4(View view){
        TextView operationField1 = (TextView) findViewById(R.id.operationField4);
        EditText numberField1 = (EditText) findViewById(R.id.numberField10);
        EditText numberField2 = (EditText) findViewById(R.id.numberField11);
        EditText numberField3 = (EditText) findViewById(R.id.numberField12);
        operationField1.setText("Ответ:");
        numberField1.setText("");
        numberField2.setText("");
        numberField3.setText("");
    }
    public void Del5(View view){
        TextView operationField1 = (TextView) findViewById(R.id.operationField5);
        EditText numberField1 = (EditText) findViewById(R.id.numberField13);
        EditText numberField2 = (EditText) findViewById(R.id.numberField14);
        EditText numberField3 = (EditText) findViewById(R.id.numberField15);
        operationField1.setText("Ответ:");
        numberField1.setText("");
        numberField2.setText("");
        numberField3.setText("");
    }
}

