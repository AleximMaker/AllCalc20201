package com.example.alexim.allcalc;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.example.alexim.allcalc.DialogFragment.Form2DialogFragment;
import com.example.alexim.allcalc.DialogFragment.Form4DialogFragment;
import com.example.alexim.allcalc.DialogFragment.FormDialogFragment;
import com.example.alexim.allcalc.Mat.MatActivity;
import com.example.alexim.allcalc.Mat.MatActivity2;

public class TwoMenu extends AppCompatActivity {
    String[] Names = {"Математика", "Физика","Геометрия"};
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_menu);
        ListView listView= (ListView)findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, Names);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
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
                    case 2:
                        FragmentTransaction ft4 = getSupportFragmentManager().beginTransaction();
                        Form4DialogFragment fragment4 = Form4DialogFragment.newInstance();
                        fragment4.show(ft4, "form_dialog");
                        break;
                }


            }

    });
    }
}
