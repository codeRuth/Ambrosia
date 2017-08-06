package com.coderuth.ambrosia.ambrosia.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.coderuth.ambrosia.ambrosia.R;

public class AddTrackerActivity extends AppCompatActivity {
    private Button mBtGoBack;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        this.getActionBar().setDisplayHomeAsUpEnabled(true);
        mBtGoBack = (Button) findViewById(R.id.bt_go_back);

        mBtGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
