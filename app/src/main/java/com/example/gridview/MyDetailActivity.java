package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyDetailActivity extends AppCompatActivity {
    private Button btnBack;
    private Button btnBackMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_detail);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnBackMain = (Button) findViewById(R.id.btnHomeMain);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent _intent = new Intent(MyDetailActivity.this,MyListActivity.class);
                startActivity(_intent);
            }
        });
        btnBackMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent _intent = new Intent(MyDetailActivity.this,MainActivity.class);
                startActivity(_intent);
            }
        });
    }
}