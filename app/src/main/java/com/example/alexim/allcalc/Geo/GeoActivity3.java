package com.example.alexim.allcalc.Geo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alexim.allcalc.R;

public class GeoActivity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo3);
    }
    public void PRK(View view) {
        TextView operationField1 = (TextView) findViewById(R.id.operationField_pr1);
        EditText numberField1 = (EditText) findViewById(R.id.numberField_pr1);
        if (!numberField1.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".")) {
            double one = Double.parseDouble(numberField1.getText().toString());
            double resR = 2 * 3.14159 * one;
            operationField1.setText(Double.toString(resR));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void PRT(View view) {
        TextView operationField1 = (TextView) findViewById(R.id.operationField_pr2);
        EditText numberField1 = (EditText) findViewById(R.id.numberField_pr2_2);
        EditText numberField2 = (EditText) findViewById(R.id.numberField_pr2_3);
        EditText numberField3 = (EditText) findViewById(R.id.numberField_pr2_4);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("") && !numberField3.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".")&& !numberField2.getText().toString().equals(".")&& !numberField3.getText().toString().equals(".")) {
            double one = Double.parseDouble(numberField1.getText().toString());
            double two = Double.parseDouble(numberField2.getText().toString());
            double three = Double.parseDouble(numberField3.getText().toString());
            double resR = one + two + three;
            operationField1.setText(Double.toString(resR));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void PRP(View view) {
        TextView operationField1 = (TextView) findViewById(R.id.operationField_pr3);
        EditText numberField1 = (EditText) findViewById(R.id.numberField_pr3);
        EditText numberField2 = (EditText) findViewById(R.id.numberField_pr3_2);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".")&& !numberField2.getText().toString().equals(".")) {
            double one = Double.parseDouble(numberField1.getText().toString());
            double two = Double.parseDouble(numberField2.getText().toString());
            double resR = 2 * (one + two);
            operationField1.setText(Double.toString(resR));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void PRKV(View view) {
        TextView operationField1 = (TextView) findViewById(R.id.operationField_pr4);
        EditText numberField1 = (EditText) findViewById(R.id.numberField_pr4);
        if (!numberField1.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".")) {
            double one = Double.parseDouble(numberField1.getText().toString());
            double resR = 4 * one;
            operationField1.setText(Double.toString(resR));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void PRTR(View view) {
        TextView operationField1 = (TextView) findViewById(R.id.operationField_pr5);
        EditText numberField1 = (EditText) findViewById(R.id.numberField_pr5);
        EditText numberField2 = (EditText) findViewById(R.id.numberField_pr5_2);
        EditText numberField3 = (EditText) findViewById(R.id.numberField_pr5_3);
        EditText numberField4 = (EditText) findViewById(R.id.numberField_pr5_4);
        if (!numberField1.getText().toString().equals("")&& !numberField2.getText().toString().equals("")
                && !numberField4.getText().toString().equals("")&& !numberField3.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".")&& !numberField2.getText().toString().equals(".")
                && !numberField3.getText().toString().equals(".")&& !numberField4.getText().toString().equals(".")) {
            double one = Double.parseDouble(numberField1.getText().toString());
            double resR = 4 * one;
            operationField1.setText(Double.toString(resR));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void Del(View v){
        Button Del =(Button)findViewById(R.id.Del);
        TextView operationField1 = (TextView) findViewById(R.id.operationField_pr1);
        EditText numberField1 = (EditText) findViewById(R.id.numberField_pr1);
        operationField1.setText("Ответ");
        numberField1.setText("");
    }
    public void Del2(View v){
        Button Del =(Button)findViewById(R.id.Del2);
        TextView operationField1 = (TextView) findViewById(R.id.operationField_pr2);
        EditText numberField1 = (EditText) findViewById(R.id.numberField_pr2_2);
        EditText numberField2 = (EditText) findViewById(R.id.numberField_pr2_3);
        EditText numberField3 = (EditText) findViewById(R.id.numberField_pr2_4);
        operationField1.setText("Ответ");
        numberField1.setText("");
        numberField2.setText("");
        numberField3.setText("");
    }
    public void Del3(View v){
        Button Del =(Button)findViewById(R.id.Del3);
        TextView operationField1 = (TextView) findViewById(R.id.operationField_pr3);
        EditText numberField1 = (EditText) findViewById(R.id.numberField_pr3);
        EditText numberField2 = (EditText) findViewById(R.id.numberField_pr3_2);
        operationField1.setText("Ответ");
        numberField1.setText("");
        numberField2.setText("");
    }
    public void Del4(View v){
        Button Del =(Button)findViewById(R.id.Del4);
        TextView operationField1 = (TextView) findViewById(R.id.operationField_pr4);
        EditText numberField1 = (EditText) findViewById(R.id.numberField_pr4);
        operationField1.setText("Ответ");
        numberField1.setText("");
    }
}
