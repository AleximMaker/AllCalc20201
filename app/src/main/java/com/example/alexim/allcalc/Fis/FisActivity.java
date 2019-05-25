package com.example.alexim.allcalc.Fis;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alexim.allcalc.R;

import static java.lang.Math.sqrt;

public class FisActivity extends AppCompatActivity {
    /*private Button R1;
    private int mCount = 0;
    private TextView tV;*/

    @Override
    protected void onCreate(Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fis);
       /* R1 = findViewById(R.id.R1);
        tV = findViewById(R.id.textView);
        if (savedInstanceState != null){String textFromTextViewToSave=savedInstanceState.getString("str1");
        tV.setText(textFromTextViewToSave);}*/
    }
   /* @Override
    public void onSaveInstanceState(Bundle state) {
        //находим TextView
        super.onSaveInstanceState(state);
        TextView tV = (TextView) this.findViewById(R.id.textView);
        String textFromTextViewToSave = (String) tV.getText();
        state.putString("str1", textFromTextViewToSave);
    }
    public void OnClick(View v){
        R1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tV.setText("Я насчитал " + ++mCount + " использований равно");

            }
        });
    }*/
   public void F1(View v){
       TextView operationField1 = (TextView) findViewById(R.id.operationField1f);
       EditText numberField1 = (EditText) findViewById(R.id.numberField1f);
       EditText numberField2 = (EditText) findViewById(R.id.numberField2f);
       if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("")
               && !numberField1.getText().toString().equals(".") && !numberField2.getText().toString().equals(".")) {
           double v1 = Double.parseDouble(numberField1.getText().toString());
           double t = Double.parseDouble(numberField2.getText().toString());
           double result = 0;
          result = v1 * t;
           operationField1.setText(Double.toString(result));
       } else {
           Toast toast = Toast.makeText(getApplicationContext(),
                   "Введите числа!", Toast.LENGTH_SHORT);
           toast.show();
       }
   }
    public void F2(View v){
        TextView operationField1 = (TextView) findViewById(R.id.operationField2f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField3f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField4f);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".") && !numberField2.getText().toString().equals(".")) {
            double l = Double.parseDouble(numberField1.getText().toString());
            double t = Double.parseDouble(numberField2.getText().toString());
            double result = 0;
            result = l / t;
            operationField1.setText(Double.toString(result));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void F3(View v){
        TextView operationField1 = (TextView) findViewById(R.id.operationField3f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField5f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField6f);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".") && !numberField2.getText().toString().equals(".")) {
            double s = Double.parseDouble(numberField1.getText().toString());
            double t = Double.parseDouble(numberField2.getText().toString());
            double result = 0;
            result = (Math.abs(s)) / t;
            operationField1.setText(Double.toString(result));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void F4(View v){
        TextView operationField1 = (TextView) findViewById(R.id.operationField4f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField7f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField8f);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".") && !numberField2.getText().toString().equals(".")) {
            double v1 = Double.parseDouble(numberField1.getText().toString());
            double t = Double.parseDouble(numberField2.getText().toString());
            double result = 0;
            result = v1 / t;
            operationField1.setText(Double.toString(result));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void F5(View v){
        TextView operationField1 = (TextView) findViewById(R.id.operationField5f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField9f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField10f);
        EditText numberField3 = (EditText) findViewById(R.id.numberField11f);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".") && !numberField2.getText().toString().equals(".")
                && !numberField3.getText().toString().equals("") && !numberField3.getText().toString().equals(".")) {
            double v0 = Double.parseDouble(numberField1.getText().toString());
            double t = Double.parseDouble(numberField2.getText().toString());
            double a = Double.parseDouble(numberField3.getText().toString());
            double result = 0;
            result = v0 + a*t;
            operationField1.setText(Double.toString(result));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void F6(View v){
        TextView operationField1 = (TextView) findViewById(R.id.operationField6f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField12f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField13f);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".") && !numberField2.getText().toString().equals(".")) {
            double v1 = Double.parseDouble(numberField1.getText().toString());
            double v0 = Double.parseDouble(numberField2.getText().toString());
            double result = 0;
            result = (v1 + v0)/2;
            operationField1.setText(Double.toString(result));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void F7(View v){
        TextView operationField1 = (TextView) findViewById(R.id.operationField7f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField14f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField15f);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".") && !numberField2.getText().toString().equals(".")) {
            double v1 = Double.parseDouble(numberField1.getText().toString());
            double t = Double.parseDouble(numberField2.getText().toString());
            double result = 0;
            result = v1 * t;
            operationField1.setText(Double.toString(result));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void F8(View v){
        TextView operationField1 = (TextView) findViewById(R.id.operationField8f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField16f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField17f);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".") && !numberField2.getText().toString().equals(".")) {
            double g = Double.parseDouble(numberField1.getText().toString());
            double h = Double.parseDouble(numberField2.getText().toString());
            double result = 0;
            result = sqrt(2 *g * h);
            operationField1.setText(Double.toString(result));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
    public void F9(View v){
        TextView operationField1 = (TextView) findViewById(R.id.operationField8f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField16f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField17f);
        if (!numberField1.getText().toString().equals("") && !numberField2.getText().toString().equals("")
                && !numberField1.getText().toString().equals(".") && !numberField2.getText().toString().equals(".")) {
            double h = Double.parseDouble(numberField1.getText().toString());
            double g = Double.parseDouble(numberField2.getText().toString());
            double result = 0;
            result = sqrt((2 * h)/g);
            operationField1.setText(Double.toString(result));
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Введите числа!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    public void Del1f(View view){
        TextView operationField1 = (TextView) findViewById(R.id.operationField1f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField1f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField2f);
        operationField1.setText("Ответ:");
        numberField1.setText("");
        numberField2.setText("");

    }
    public void Del2f(View view){
        TextView operationField1 = (TextView) findViewById(R.id.operationField2f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField3f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField4f);
        operationField1.setText("Ответ:");
        numberField1.setText("");
        numberField2.setText("");

    }
    public void Del3f(View view){
        TextView operationField1 = (TextView) findViewById(R.id.operationField3f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField5f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField6f);
        operationField1.setText("Ответ:");
        numberField1.setText("");
        numberField2.setText("");

    }
    public void Del4f(View view){
        TextView operationField1 = (TextView) findViewById(R.id.operationField4f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField7f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField8f);
        operationField1.setText("Ответ:");
        numberField1.setText("");
        numberField2.setText("");

    }
    public void Del5f(View view){
        TextView operationField1 = (TextView) findViewById(R.id.operationField5f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField9f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField10f);
        EditText numberField3 = (EditText) findViewById(R.id.numberField11f);
        operationField1.setText("Ответ:");
        numberField1.setText("");
        numberField2.setText("");
        numberField3.setText("");

    }
    public void Del6f(View view){
        TextView operationField1 = (TextView) findViewById(R.id.operationField6f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField12f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField13f);
        operationField1.setText("Ответ:");
        numberField1.setText("");
        numberField2.setText("");

    }
    public void Del7f(View view){
        TextView operationField1 = (TextView) findViewById(R.id.operationField7f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField14f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField15f);
        operationField1.setText("Ответ:");
        numberField1.setText("");
        numberField2.setText("");

    }
    public void Del8f(View view){
        TextView operationField1 = (TextView) findViewById(R.id.operationField8f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField16f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField17f);
        operationField1.setText("Ответ:");
        numberField1.setText("");
        numberField2.setText("");

    }
    public void Del9f(View view){
        TextView operationField1 = (TextView) findViewById(R.id.operationField9f);
        EditText numberField1 = (EditText) findViewById(R.id.numberField18f);
        EditText numberField2 = (EditText) findViewById(R.id.numberField19f);
        operationField1.setText("Ответ:");
        numberField1.setText("");
        numberField2.setText("");

    }
}
