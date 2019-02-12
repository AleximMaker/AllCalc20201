package com.example.alexim.allcalc;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class TwoMenu extends ListActivity {
    private static final String[] catNames = { "Математика", "Физика","Математика", "Физика","Математика", "Физика","Математика", "Физика" };


    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, catNames);
        setListAdapter(mAdapter);

    }
}
