package com.example.admin.trainingandroid;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by admin on 8/10/2018.
 */

public class LinearLayout extends Activity {
    static TextView tvfp;
    static Button btnLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);
        init();
        tvfp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LinearLayout.this,"chạy rồi nè",Toast.LENGTH_LONG).show();

            }
        });
        btnLogin.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(LinearLayout.this,"chay click dài rồi nhé cu",Toast.LENGTH_LONG).show();
                return false;

            }
        });

    }
    public void init() {
        tvfp= (TextView) findViewById(R.id.tvFp);
        btnLogin=(Button) findViewById(R.id.btnLogin);

    }
}
