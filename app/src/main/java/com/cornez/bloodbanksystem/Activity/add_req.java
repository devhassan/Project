package com.cornez.bloodbanksystem.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.cornez.bloodbanksystem.R;

public class add_req extends AppCompatActivity {

    private Spinner Blood_group1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_req);

        Blood_group1 = findViewById(R.id.spinner);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(add_req.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.Blood_Group));
        myAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        Blood_group1.setAdapter(myAdapter);
    }
}
