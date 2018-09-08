package com.example.admin.trainingandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String unit []={"LinearLayout","RenativeLayout","Sang"};
        ListView lvunit =(ListView) findViewById(R.id.lvUnit);

        ArrayAdapter<String>adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,unit);
        lvunit.setAdapter(adapter);

        lvunit.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intentLinearLayout = new Intent(MainActivity.this, LinearLayout.class);
                        startActivity(intentLinearLayout);
                        break;
                }




            }
        });




    }
}
