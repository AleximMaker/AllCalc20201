package com.example.alexim.allcalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alexim.allcalc.R;

import static java.lang.Math.sqrt;

public class MatActivity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mat3);
    }
    public void Kvad(View view) {
        TextView operationField1 = (TextView) findViewById(R.id.operationField01);
        EditText numberField1 = (EditText) findViewById(R.id.numberField01);
        EditText numberField2 = (EditText) findViewById(R.id.numberField02);
        EditText numberField3 = (EditText) findViewById(R.id.numberField03);
        TextView operationField2 = (TextView) findViewById(R.id.operationField02);
        TextView operationField3 = (TextView) findViewById(R.id.operationField03);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("") && !numberField3.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".") && !numberField2.getText().toString().equals(".")
                && !numberField3.getText().toString().equals("."))
        {double a = Double.parseDouble(numberField1.getText().toString());
            double b = Double.parseDouble(numberField2.getText().toString());
            double c = Double.parseDouble(numberField3.getText().toString());
            double D,x1,x2,x0;
            D = b*b-4*a*c;
            if (D == 0)
            {
                x0 = (-b)/(2*a);
                operationField1.setText(Double.toString(D));
                operationField2.setText(Double.toString(x0));
                operationField3.setText(Double.toString(x0));
            } else if(D > 0){ x1 = (((-b)+sqrt(D)))/(2*a); x2 = (-b-sqrt(D))/(2*a);
                operationField1.setText(Double.toString(D));
                operationField2.setText(Double.toString(x1));
                operationField3.setText(Double.toString(x2));
            }else if(D<0){Toast toast = Toast.makeText(getApplicationContext(),"Дискриминант меньше 0, а значит корней нет!", Toast.LENGTH_SHORT);
                toast.show();
            }} else {Toast toast = Toast.makeText(getApplicationContext(),
                "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();}
    }
    public void Del01(View v){
        Button Del4 =(Button)findViewById(R.id.Del01);
        TextView operationField1 = (TextView) findViewById(R.id.operationField01);
        TextView operationField2 = (TextView) findViewById(R.id.operationField02);
        TextView operationField3 = (TextView) findViewById(R.id.operationField03);
        EditText numberField7 = (EditText) findViewById(R.id.numberField01);
        EditText numberField8 = (EditText) findViewById(R.id.numberField02);
        EditText numberField9 = (EditText) findViewById(R.id.numberField03);
        operationField1.setText("");
        operationField2.setText("");
        operationField3.setText("");
        numberField7.setText("");
        numberField8.setText("");
        numberField9.setText("");
    }
}