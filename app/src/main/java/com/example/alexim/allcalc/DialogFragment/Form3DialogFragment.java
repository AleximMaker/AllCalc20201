package com.example.alexim.allcalc.DialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.alexim.allcalc.Mat.MatActivity;
import com.example.alexim.allcalc.Mat.MatActivity2;
import com.example.alexim.allcalc.Mat.MatActivity3;
import com.example.alexim.allcalc.Mat.MatActivity4;
import com.example.alexim.allcalc.R;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static android.provider.Telephony.Mms.Part.FILENAME;
import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;
import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

public class Form3DialogFragment extends DialogFragment {

    public static Form3DialogFragment newInstance(){
        return new Form3DialogFragment();
    }
    final String LOG_TAG = "myLogs";

    final String FILENAME = "file";
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NO_TITLE, R.style.FormDialog);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_point_mat_two,container,false);
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


