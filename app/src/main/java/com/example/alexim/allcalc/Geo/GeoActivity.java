package com.example.alexim.allcalc.Geo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alexim.allcalc.R;

public class GeoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo);
    }
    public void KVS(View view) {
        TextView operationField1 = (TextView) findViewById(R.id.operationField_geo1);
        EditText numberField1 = (EditText) findViewById(R.id.numberField_geo1);
        if (!numberField1.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".")) {
            double one = Double.parseDouble(numberField1.getText().toString());
            double resR = one * one;
            operationField1.setText(Double.toString(resR));
        } else {Toast toast = Toast.makeText(getApplicationContext(),
                "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();}
    }
    public void KVD(View view) {
        TextView operationField1 = (TextView) findViewById(R.id.operationField_geo2);
        EditText numberField1 = (EditText) findViewById(R.id.numberField_geo2);
        if (!numberField1.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".")) {
            double one = Double.parseDouble(numberField1.getText().toString());
            double resR = (one * one)/2;
            operationField1.setText(Double.toString(resR));
        } else {Toast toast = Toast.makeText(getApplicationContext(),
                "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();}
    }
    public void PR(View view) {
        TextView operationField4 = (TextView) findViewById(R.id.operationField_geo3);
        EditText numberField7 = (EditText) findViewById(R.id.numberField_geo3);
        EditText numberField8 = (EditText) findViewById(R.id.numberField_geo3_2);
        if (!numberField7.getText().toString().equals("") && !numberField8.getText().toString().equals("")
                && !numberField7.getText().toString().equals(".") && !numberField8.getText().toString().equals(".")) {
            double one = Double.parseDouble(numberField7.getText().toString());
            double two = Double.parseDouble(numberField8.getText().toString());
            double resR =one*two ;
            operationField4.setText(Double.toString(resR));
        } else {Toast toast = Toast.makeText(getApplicationContext(),
                "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();}
    }
    public void TR(View view) {
        TextView operationField4 = (TextView) findViewById(R.id.operationField_geo4);
        EditText numberField1 = (EditText) findViewById(R.id.numberField_geo4);
        EditText numberField2 = (EditText) findViewById(R.id.numberField_geo4_2);
        EditText numberField3 = (EditText) findViewById(R.id.numberField_geo4_3);
        EditText numberField4 = (EditText) findViewById(R.id.numberField_geo4_4);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("")
                && !numberField3.getText().toString().equals("") && !numberField4.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".") && !numberField2.getText().toString().equals(".")
                && !numberField3.getText().toString().equals(".") && !numberField4.getText().toString().equals(".")) {
            double one = Double.parseDouble(numberField1.getText().toString());
            double two = Double.parseDouble(numberField2.getText().toString());
            double three = Double.parseDouble(numberField3.getText().toString());
            double four = Double.parseDouble(numberField4.getText().toString());
            double resR = (one * two * three) / (4 * four);
            operationField4.setText(Double.toString(resR));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void PRL(View view) {
        TextView operationField4 = (TextView) findViewById(R.id.operationField_geo5);
        EditText numberField7 = (EditText) findViewById(R.id.numberField_geo5);
        EditText numberField8 = (EditText) findViewById(R.id.numberField_geo5_1);
        if (!numberField7.getText().toString().equals("") && !numberField8.getText().toString().equals("")
                && !numberField7.getText().toString().equals(".") && !numberField8.getText().toString().equals(".")) {
            double one = Double.parseDouble(numberField7.getText().toString());
            double two = Double.parseDouble(numberField8.getText().toString());
            double resR =one*two ;
            operationField4.setText(Double.toString(resR));
        } else {Toast toast = Toast.makeText(getApplicationContext(),
                "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();}
    }
    public void TRAP(View view) {
        TextView operationField4 = (TextView) findViewById(R.id.operationField_geo6);
        EditText numberField7 = (EditText) findViewById(R.id.numberField_geo6);
        EditText numberField8 = (EditText) findViewById(R.id.numberField_geo6_2);
        EditText numberField9 = (EditText) findViewById(R.id.numberField_geo6_3);
        if (!numberField7.getText().toString().equals("") && !numberField8.getText().toString().equals("") && !numberField9.getText().toString().equals("")
                && !numberField7.getText().toString().equals(".") && !numberField8.getText().toString().equals(".")&& !numberField9.getText().toString().equals(".")) {
            double one = Double.parseDouble(numberField7.getText().toString());
            double two = Double.parseDouble(numberField8.getText().toString());
            double three = Double.parseDouble(numberField9.getText().toString());
            double resR = ((one+two) / 2)*three ;
            operationField4.setText(Double.toString(resR));
        } else {Toast toast = Toast.makeText(getApplicationContext(),
                "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();}
    }
    public void ROM(View view) {
        TextView operationField4 = (TextView) findViewById(R.id.operationField_geo7);
        EditText numberField7 = (EditText) findViewById(R.id.numberField_geo7);
        EditText numberField8 = (EditText) findViewById(R.id.numberField_geo7_2);
        if (!numberField7.getText().toString().equals("") && !numberField8.getText().toString().equals("")
                && !numberField7.getText().toString().equals(".") && !numberField8.getText().toString().equals(".")) {
            double one = Double.parseDouble(numberField7.getText().toString());
            double two = Double.parseDouble(numberField8.getText().toString());
            double resR =one*two ;
            operationField4.setText(Double.toString(resR));
        } else {Toast toast = Toast.makeText(getApplicationContext(),
                "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();}
    }
    public void KR(View view) {
        TextView operationField4 = (TextView) findViewById(R.id.operationField_geo8);
        EditText numberField7 = (EditText) findViewById(R.id.numberField_geo8);
        if (!numberField7.getText().toString().equals("") && !numberField7.getText().toString().equals(".")) {
            double one = Double.parseDouble(numberField7.getText().toString());
            double resR =(one*one)* 3.1415 ;
            operationField4.setText(Double.toString(resR));
        } else {Toast toast = Toast.makeText(getApplicationContext(),
                "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();}
    }
    public void Del(View v){
        Button Del =(Button)findViewById(R.id.Del_geo);
        TextView operationField1 = (TextView) findViewById(R.id.operationField_geo1);
        EditText numberField1 = (EditText) findViewById(R.id.numberField_geo1);
        operationField1.setText("Ответ");
        numberField1.setText("");
    }
    public void Del2(View v){
        Button Del =(Button)findViewById(R.id.Del2);
        TextView operationField1 = (TextView) findViewById(R.id.operationField_geo2);
        EditText numberField1 = (EditText) findViewById(R.id.numberField_geo2);
        operationField1.setText("Ответ");
        numberField1.setText("");
    }
    public void Del3(View v){
        Button Del =(Button)findViewById(R.id.Del3);
        TextView operationField1 = (TextView) findViewById(R.id.operationField_geo2);
        EditText numberField1 = (EditText) findViewById(R.id.numberField_geo2);
        operationField1.setText("Ответ");
        numberField1.setText("");
    }
    public void Del4(View v){
        Button Del =(Button)findViewById(R.id.Del4);
        TextView operationField1 = (TextView) findViewById(R.id.operationField_geo4);
        EditText numberField1 = (EditText) findViewById(R.id.numberField_geo4);
        EditText numberField2 = (EditText) findViewById(R.id.numberField_geo4_2);
        EditText numberField3 = (EditText) findViewById(R.id.numberField_geo4_3);
        EditText numberField4 = (EditText) findViewById(R.id.numberField_geo4_4);
        operationField1.setText("Ответ");
        numberField1.setText("");
        numberField2.setText("");
        numberField3.setText("");
        numberField4.setText("");
    }
    public void Del5(View v){
        Button Del =(Button)findViewById(R.id.Del5);
        TextView operationField1 = (TextView) findViewById(R.id.operationField_geo5);
        EditText numberField1 = (EditText) findViewById(R.id.numberField_geo5);
        EditText numberField2 = (EditText) findViewById(R.id.numberField_geo5_1);
        operationField1.setText("Ответ");
        numberField1.setText("");
        numberField2.setText("");
    }
    public void Del6(View v){
        Button Del =(Button)findViewById(R.id.Del6);
        TextView operationField1 = (TextView) findViewById(R.id.operationField_geo6);
        EditText numberField1 = (EditText) findViewById(R.id.numberField_geo6);
        EditText numberField2 = (EditText) findViewById(R.id.numberField_geo6_2);
        EditText numberField3 = (EditText) findViewById(R.id.numberField_geo6_3);
        operationField1.setText("Ответ");
        numberField1.setText("");
        numberField2.setText("");
        numberField3.setText("");
    }
    public void Del7(View v){
        Button Del =(Button)findViewById(R.id.Del7);
        TextView operationField1 = (TextView) findViewById(R.id.operationField_geo7);
        EditText numberField1 = (EditText) findViewById(R.id.numberField_geo7);
        EditText numberField2 = (EditText) findViewById(R.id.numberField_geo7_2);
        operationField1.setText("Ответ");
        numberField1.setText("");
        numberField2.setText("");
    }
    public void Del8(View v){
        Button Del =(Button)findViewById(R.id.Del8);
        TextView operationField1 = (TextView) findViewById(R.id.operationField_geo8);
        EditText numberField1 = (EditText) findViewById(R.id.numberField_geo8);
        operationField1.setText("Ответ");
        numberField1.setText("");
    }
}