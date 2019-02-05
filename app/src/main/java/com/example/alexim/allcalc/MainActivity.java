package com.example.alexim.allcalc;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import com.example.alexim.allcalc.DialogFragment.FormDialogFragment;
import com.example.alexim.allcalc.DialogFragment.Form2DialogFragment;


public class MainActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener{

    private TextView mSelectText;
    private DataAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSelectText = (TextView) findViewById(R.id.info);
        final GridView g = (GridView) findViewById(R.id.gridView1);
        mAdapter = new DataAdapter(getApplicationContext(),
                android.R.layout.simple_list_item_1);
        g.setAdapter(mAdapter);
        g.setOnItemSelectedListener(this);
        g.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                // TODO Auto-generated method stub
                mSelectText.setText("Выбранный элемент: "
                        + mAdapter.getItem(position));

                switch (position) {
                    case 0:
                        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                        FormDialogFragment fragment = FormDialogFragment.newInstance();
                        fragment.show(ft, "form_dialog");
                        break;
                    case 1:
                        FragmentTransaction ft2 = getSupportFragmentManager().beginTransaction();
                        Form2DialogFragment fragment2 = Form2DialogFragment.newInstance();
                        fragment2.show(ft2, "form_dialog");
                        break;

                }
            }

        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position,
                               long id) {
        mSelectText.setText("Выбранный элемент: " + mAdapter.getItem(position));
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        mSelectText.setText("Выбранный элемент: ничего");
    }



}
