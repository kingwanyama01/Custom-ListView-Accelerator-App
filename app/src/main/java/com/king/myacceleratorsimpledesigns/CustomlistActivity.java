package com.king.myacceleratorsimpledesigns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class CustomlistActivity extends AppCompatActivity {
    ListView mListPhone;
    CustomAdapter adapter;
    ArrayList<Item> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customlist);
        data = new ArrayList();
        mListPhone = findViewById(R.id.my_phone_list);

        Item p1 = new Item("Abubakar","0789000000",R.mipmap.icon_yangu);
        Item p2 = new Item("Albert","07650987654",R.drawable.img_one);
        Item p3 = new Item("Allen","0743000087",R.drawable.my_icon);
        Item p4 = new Item("Meshack","07210776343564",R.drawable.my_icon_two);
        Item p5 = new Item("Dativa","073435354343",R.drawable.img_one);
        Item p6 = new Item("Boniphave","0789000000",R.mipmap.icon_yangu);
        Item p7 = new Item("Chichi","07650987654",R.drawable.img_one);
        Item p8 = new Item("Deogratius","0743000087",R.drawable.my_icon);
        Item p9 = new Item("Edson","07210776343564",R.drawable.my_icon_two);
        Item p10 = new Item("Faustina","073435354343",R.drawable.img_one);
        Item p11 = new Item("Grace","0789000000",R.mipmap.icon_yangu);
        Item p12 = new Item("Holylight","07650987654",R.drawable.img_one);
        Item p13 = new Item("Vanessa","0743000087",R.drawable.my_icon);
        Item p14 = new Item("Salama","07210776343564",R.drawable.my_icon_two);
        Item p15 = new Item("Salmin","073435354343",R.drawable.img_one);
        data.add(p1);
        data.add(p2);
        data.add(p3);
        data.add(p4);
        data.add(p5);
        data.add(p6);
        data.add(p7);
        data.add(p8);
        data.add(p9);
        data.add(p10);
        data.add(p11);
        data.add(p12);
        data.add(p13);
        data.add(p14);
        data.add(p15);


        adapter = new CustomAdapter(this,data);
        mListPhone.setAdapter(adapter);
        mListPhone.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String name,phone;
                name = data.get(position).getName();
                phone = data.get(position).getPhone();

                Toast.makeText(CustomlistActivity.this, "Name is "+name+" and Phone is "+phone, Toast.LENGTH_SHORT).show();
            }
        });
    }
}