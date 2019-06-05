package com.example.alexim.allcalc.DialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.alexim.allcalc.Fis.Fis2;
import com.example.alexim.allcalc.Fis.Fis3;
import com.example.alexim.allcalc.Geo.GeoActivity;
import com.example.alexim.allcalc.Geo.GeoActivity2;
import com.example.alexim.allcalc.Geo.GeoActivity3;
import com.example.alexim.allcalc.R;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;
import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

public class Form4DialogFragment extends DialogFragment {

    public static Form4DialogFragment newInstance(){
        return new Form4DialogFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NO_TITLE, R.style.FormDialog);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_two_3,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button Geo1 = (Button) view.findViewById(R.id.Geo1);
        Geo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), GeoActivity.class);
                startActivity(intent);
            }
        });
        Button Geo2 = (Button) view.findViewById(R.id.Geo2);
        Geo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), GeoActivity2.class);
                startActivity(intent);
            }
        });
        Button Fis3_2 = (Button) view.findViewById(R.id.Geo3);
        Fis3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), GeoActivity3.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        if (getDialog() != null && getDialog().getWindow() != null) {
            getDialog().getWindow().setLayout(MATCH_PARENT, WRAP_CONTENT);
            getDialog().getWindow().setGravity(Gravity.BOTTOM);
        }
    }
}
