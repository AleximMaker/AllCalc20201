package com.example.alexim.allcalc.Geo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alexim.allcalc.R;

public class GeoActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo2);
    }

    public void OBK(View view) {
        TextView operationField1 = (TextView) findViewById(R.id.operationField_ob1);
        EditText numberField1 = (EditText) findViewById(R.id.numberField_ob1);
        if (!numberField1.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".")) {
            double one = Double.parseDouble(numberField1.getText().toString());
            double resR = one * one* one;
            operationField1.setText(Double.toString(resR));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void OBP(View view) {
        TextView operationField1 = (TextView) findViewById(R.id.operationField_ob2);
        EditText numberField1 = (EditText) findViewById(R.id.numberField_ob2);
        EditText numberField2 = (EditText) findViewById(R.id.numberField_ob2_2);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".") && !numberField2.getText().toString().equals(".")) {
            double one = Double.parseDouble(numberField1.getText().toString());
            double two = Double.parseDouble(numberField2.getText().toString());
            double resR = (one * two)* 3;
            operationField1.setText(Double.toString(resR));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void OBKO(View view) {
        TextView operationField1 = (TextView) findViewById(R.id.operationField_ob3);
        EditText numberField1 = (EditText) findViewById(R.id.numberField_ob3);
        EditText numberField2 = (EditText) findViewById(R.id.numberField_ob3_2);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".") && !numberField2.getText().toString().equals(".")) {
            double one = Double.parseDouble(numberField1.getText().toString());
            double two = Double.parseDouble(numberField2.getText().toString());
            double resR = (one / 3 ) * two;
            operationField1.setText(Double.toString(resR));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void OBC(View view) {
        TextView operationField1 = (TextView) findViewById(R.id.operationField_ob4);
        EditText numberField1 = (EditText) findViewById(R.id.numberField_ob4);
        EditText numberField2 = (EditText) findViewById(R.id.numberField_ob4_2);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".") && !numberField2.getText().toString().equals(".")) {
            double one = Double.parseDouble(numberField1.getText().toString());
            double two = Double.parseDouble(numberField2.getText().toString());
            double resR = (one * two);
            operationField1.setText(Double.toString(resR));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void Del(View v){
        Button Del =(Button)findViewById(R.id.Del);
        TextView operationField1 = (TextView) findViewById(R.id.operationField_ob1);
        EditText numberField1 = (EditText) findViewById(R.id.numberField_ob1);
        operationField1.setText("Ответ");
        numberField1.setText("");
    }
    public void Del2(View v){
        Button Del =(Button)findViewById(R.id.Del2);
        TextView operationField1 = (TextView) findViewById(R.id.operationField_ob2);
        EditText numberField1 = (EditText) findViewById(R.id.numberField_ob2);
        EditText numberField2 = (EditText) findViewById(R.id.numberField_ob2_2);
        operationField1.setText("Ответ");
        numberField1.setText("");
        numberField2.setText("");
    }
    public void Del3(View v){
        Button Del =(Button)findViewById(R.id.Del3);
        TextView operationField1 = (TextView) findViewById(R.id.operationField_ob3);
        EditText numberField1 = (EditText) findViewById(R.id.numberField_ob3);
        EditText numberField2 = (EditText) findViewById(R.id.numberField_ob3_2);
        operationField1.setText("Ответ");
        numberField1.setText("");
        numberField2.setText("");
    }
    public void Del4(View v){
        Button Del =(Button)findViewById(R.id.Del4);
        TextView operationField1 = (TextView) findViewById(R.id.operationField_ob4);
        EditText numberField1 = (EditText) findViewById(R.id.numberField_ob4);
        EditText numberField2 = (EditText) findViewById(R.id.numberField_ob4_2);
        operationField1.setText("Ответ");
        numberField1.setText("");
        numberField2.setText("");
    }
}
