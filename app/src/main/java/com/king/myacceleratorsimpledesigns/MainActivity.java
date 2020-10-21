package com.king.myacceleratorsimpledesigns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button mBtnSimpleList, mBtnCustomList;
    ImageView mImgTz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnSimpleList = findViewById(R.id.btn_simple_list);
        mBtnCustomList = findViewById(R.id.btn_custom_list);
        mImgTz = findViewById(R.id.img_tz);

        mImgTz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Image clicked", Toast.LENGTH_SHORT).show();
            }
        });

        mBtnSimpleList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SimplelistActivity.class));
            }
        });

        mBtnCustomList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),CustomlistActivity.class));
            }
        });
    }
}