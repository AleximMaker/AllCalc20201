package com.example.alexim.allcalc;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FisActivity extends AppCompatActivity {
    private Button R1;
    private int mCount = 0;
    private TextView tV;

    @Override
    protected void onCreate(Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fis);
        R1 = findViewById(R.id.R1);
        tV = findViewById(R.id.textView);
       // String textFromTextViewToSave=savedInstanceState.getString("str1");
       // tV.setText(textFromTextViewToSave);
    }
   // @Override
   // public void onSaveInstanceState(Bundle state) {
        //находим TextView
      //  super.onSaveInstanceState(state);
       // TextView tV = (TextView) this.findViewById(R.id.textView);
        //String textFromTextViewToSave = (String) tV.getText();
        //state.putString("str1", textFromTextViewToSave);
   // }
    public void OnClick(View v){
        R1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tV.setText("Я насчитал " + ++mCount + " ворон");
            }
        });
    }
}
