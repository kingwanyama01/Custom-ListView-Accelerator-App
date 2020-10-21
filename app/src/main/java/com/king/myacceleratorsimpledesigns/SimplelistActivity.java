package com.king.myacceleratorsimpledesigns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class SimplelistActivity extends AppCompatActivity {
    ListView mSimpleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simplelist);
        mSimpleList = findViewById(R.id.my_simple_list);

        mSimpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name  = parent.getItemAtPosition(position).toString();

                Toast.makeText(SimplelistActivity.this, name+" clicked", Toast.LENGTH_SHORT).show();
                Log.d("mytest", name+" clicked");
            }
        });

    }
}