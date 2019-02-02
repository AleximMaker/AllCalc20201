package com.example.alexim.allcalc;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alexim.allcalc.R;

public class MatActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mat2);

    }
    public void Minus(View view) {
        Button Del =(Button)findViewById(R.id.Del2);
        TextView operationField1 = (TextView) findViewById(R.id.operationField2);
        EditText numberField1 = (EditText) findViewById(R.id.numberField3);
        EditText numberField2 = (EditText) findViewById(R.id.numberField4);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".") && !numberField2.getText().toString().equals(".")) {
            double one = Double.parseDouble(numberField1.getText().toString());
            double two = Double.parseDouble(numberField2.getText().toString());
            double resR = (one - two)*(one - two);
            operationField1.setText(Double.toString(resR));
        } else {Toast toast = Toast.makeText(getApplicationContext(),
                "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();}
    }
    public void Plus(View view) {
        Button Del2 =(Button)findViewById(R.id.Del);
        TextView operationField2 = (TextView) findViewById(R.id.operationField1);
        EditText numberField3 = (EditText) findViewById(R.id.numberField1);
        EditText numberField4 = (EditText) findViewById(R.id.numberField2);
        if (!numberField3.getText().toString().equals("") && !numberField4.getText().toString().equals("")
                && !numberField3.getText().toString().equals(".") && !numberField4.getText().toString().equals(".")) {
            double one = Double.parseDouble(numberField3.getText().toString());
            double two = Double.parseDouble(numberField4.getText().toString());
            double resR = (one + two)*(one + two);
            operationField2.setText(Double.toString(resR));
        } else {Toast toast = Toast.makeText(getApplicationContext(),
                "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();}
    }
    public void MinusD(View view) {
        Button Del3 =(Button)findViewById(R.id.Del3);
        TextView operationField3 = (TextView) findViewById(R.id.operationField3);
        EditText numberField5 = (EditText) findViewById(R.id.numberField5);
        EditText numberField6 = (EditText) findViewById(R.id.numberField6);
        if (!numberField5.getText().toString().equals("") && !numberField6.getText().toString().equals("")
                && !numberField5.getText().toString().equals(".") && !numberField6.getText().toString().equals(".")) {
            double one = Double.parseDouble(numberField5.getText().toString());
            double two = Double.parseDouble(numberField6.getText().toString());
            double resR = (one + two)*(one - two);
            operationField3.setText(Double.toString(resR));
        } else {Toast toast = Toast.makeText(getApplicationContext(),
                "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();}
    }
    public void Minus3(View view) {
        Button Del4 =(Button)findViewById(R.id.Del4);
        TextView operationField4 = (TextView) findViewById(R.id.operationField4);
        EditText numberField7 = (EditText) findViewById(R.id.numberField7);
        EditText numberField8 = (EditText) findViewById(R.id.numberField8);
        if (!numberField7.getText().toString().equals("") && !numberField8.getText().toString().equals("")
                && !numberField7.getText().toString().equals(".") && !numberField8.getText().toString().equals(".")) {
            double one = Double.parseDouble(numberField7.getText().toString());
            double two = Double.parseDouble(numberField8.getText().toString());
            double resR = (one - two)*(one*one+one*two+two*two);
            operationField4.setText(Double.toString(resR));
        } else {Toast toast = Toast.makeText(getApplicationContext(),
                "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();}
    }

    public void Plus3(View view) {
        Button Del5 =(Button)findViewById(R.id.Del5);
        TextView operationField4 = (TextView) findViewById(R.id.operationField5);
        EditText numberField7 = (EditText) findViewById(R.id.numberField9);
        EditText numberField8 = (EditText) findViewById(R.id.numberField10);
        if (!numberField7.getText().toString().equals("") && !numberField8.getText().toString().equals("")
                && !numberField7.getText().toString().equals(".") && !numberField8.getText().toString().equals(".")) {
            double one = Double.parseDouble(numberField7.getText().toString());
            double two = Double.parseDouble(numberField8.getText().toString());
            double resR = (one + two)*(one*one-one*two+two*two);
            operationField4.setText(Double.toString(resR));
        } else {Toast toast = Toast.makeText(getApplicationContext(),
                "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();}
    }
    public void ThreePlus(View view) {
        Button Del5 =(Button)findViewById(R.id.Del6);
        TextView operationField4 = (TextView) findViewById(R.id.operationField6);
        EditText numberField7 = (EditText) findViewById(R.id.numberField11);
        EditText numberField8 = (EditText) findViewById(R.id.numberField12);
        if (!numberField7.getText().toString().equals("") && !numberField8.getText().toString().equals("")
                && !numberField7.getText().toString().equals(".") && !numberField8.getText().toString().equals(".")) {
            double one = Double.parseDouble(numberField7.getText().toString());
            double two = Double.parseDouble(numberField8.getText().toString());
            double resR =(one+two)*(one+two)*(one+two) ;
            operationField4.setText(Double.toString(resR));
        } else {Toast toast = Toast.makeText(getApplicationContext(),
                "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();}
    }
    public void ThreeMinus(View view) {
        Button Del5 =(Button)findViewById(R.id.Del7);
        TextView operationField4 = (TextView) findViewById(R.id.operationField7);
        EditText numberField7 = (EditText) findViewById(R.id.numberField14);
        EditText numberField8 = (EditText) findViewById(R.id.numberField15);
        if (!numberField7.getText().toString().equals("") && !numberField8.getText().toString().equals("")
                && !numberField7.getText().toString().equals(".") && !numberField8.getText().toString().equals(".")) {
            double one = Double.parseDouble(numberField7.getText().toString());
            double two = Double.parseDouble(numberField8.getText().toString());
            double resR =(one+two)*(one+two)*(one+two) ;
            operationField4.setText(Double.toString(resR));
        } else {Toast toast = Toast.makeText(getApplicationContext(),
                "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();}
    }
    public void Del(View v){
        Button Del =(Button)findViewById(R.id.Del);
        TextView operationField1 = (TextView) findViewById(R.id.operationField1);
        EditText numberField1 = (EditText) findViewById(R.id.numberField1);
        EditText numberField2 = (EditText) findViewById(R.id.numberField2);
        operationField1.setText("");
        numberField1.setText("");
        numberField2.setText("");
    }
    public void Del2(View v){
        Button Del2 =(Button)findViewById(R.id.Del2);
        TextView operationField2 = (TextView) findViewById(R.id.operationField2);
        EditText numberField3 = (EditText) findViewById(R.id.numberField3);
        EditText numberField4 = (EditText) findViewById(R.id.numberField4);
        operationField2.setText("");
        numberField3.setText("");
        numberField4.setText("");
    }
    public void Del3(View v){
        Button Del3 =(Button)findViewById(R.id.Del3);
        TextView operationField3 = (TextView) findViewById(R.id.operationField3);
        EditText numberField5 = (EditText) findViewById(R.id.numberField5);
        EditText numberField6 = (EditText) findViewById(R.id.numberField6);
        operationField3.setText("");
        numberField5.setText("");
        numberField6.setText("");
    }
    public void Del4(View v){
        Button Del4 =(Button)findViewById(R.id.Del4);
        TextView operationField4 = (TextView) findViewById(R.id.operationField4);
        EditText numberField7 = (EditText) findViewById(R.id.numberField7);
        EditText numberField8 = (EditText) findViewById(R.id.numberField8);
        operationField4.setText("");
        numberField7.setText("");
        numberField8.setText("");
    }

    public void Del5(View v){
        Button Del4 =(Button)findViewById(R.id.Del5);
        TextView operationField4 = (TextView) findViewById(R.id.operationField5);
        EditText numberField7 = (EditText) findViewById(R.id.numberField9);
        EditText numberField8 = (EditText) findViewById(R.id.numberField10);
        operationField4.setText("");
        numberField7.setText("");
        numberField8.setText("");
    }

    public void Del6(View v){
        Button Del4 =(Button)findViewById(R.id.Del6);
        TextView operationField4 = (TextView) findViewById(R.id.operationField6);
        EditText numberField7 = (EditText) findViewById(R.id.numberField11);
        EditText numberField8 = (EditText) findViewById(R.id.numberField12);
        operationField4.setText("");
        numberField7.setText("");
        numberField8.setText("");
    }
    public void Del7(View v){
        Button Del4 =(Button)findViewById(R.id.Del7);
        TextView operationField4 = (TextView) findViewById(R.id.operationField7);
        EditText numberField7 = (EditText) findViewById(R.id.numberField14);
        EditText numberField8 = (EditText) findViewById(R.id.numberField15);
        operationField4.setText("");
        numberField7.setText("");
        numberField8.setText("");
    }
}

