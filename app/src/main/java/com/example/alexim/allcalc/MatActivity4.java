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
            for (double i=0; i<p; i++){
                result = 1;
                e = i;
                while (e>0){
                    result*=a;
                    e--;
                }
            }
            for (double i=0; i<g; i++){
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
    public void Del (View v){
        Button Del = (Button) findViewById(R.id.Del);
        TextView operationField1 = (TextView) findViewById(R.id.operationField1);
        EditText numberField1 = (EditText) findViewById(R.id.numberField1);
        EditText numberField2 = (EditText) findViewById(R.id.numberField2);
        EditText numberField3 = (EditText) findViewById(R.id.numberField3);
        operationField1.setText("");
        numberField1.setText("");
        numberField2.setText("");
        numberField3.setText("");
    }
}

