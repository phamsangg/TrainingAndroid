package com.example.admin.trainingandroid;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by admin on 8/12/2018.
 */

public class SpinnerActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner_layout);

        ArrayList<String> listMonHoc= new ArrayList<>();
        listMonHoc.add("Java");
        listMonHoc.add("C");
        listMonHoc.add("Python");
        listMonHoc.add("Android");
        listMonHoc.add("NoteJs");

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,listMonHoc);



    }
}

