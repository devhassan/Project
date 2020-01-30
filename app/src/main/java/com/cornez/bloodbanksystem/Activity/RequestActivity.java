package com.cornez.bloodbanksystem.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cornez.bloodbanksystem.R;

public class RequestActivity extends AppCompatActivity {

    private Button A_P;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);

        A_P = findViewById(R.id.A_P);

        A_P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Search();
            }
        });
    }
        public void Search() {
            Intent intent = new Intent(this, Retreve.class);
            startActivity(intent);
        }
}
