package com.example.alexim.allcalc;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Clear {
    public void C(View v){
        TextView operationField1 = (TextView) v.findViewById(R.id.operationField1);
        EditText numberField1 = (EditText) v.findViewById(R.id.numberField1);
        EditText numberField2 = (EditText) v.findViewById(R.id.numberField2);
        EditText numberField3 = (EditText) v.findViewById(R.id.numberField3);
        operationField1.setText("Ответ:");
        numberField1.setText("");
        numberField2.setText("");
        numberField3.setText("");
    }
}
