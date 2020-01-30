package com.cornez.bloodbanksystem.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cornez.bloodbanksystem.R;

public class HelpChartActivity extends AppCompatActivity {

    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_chart);

        back = findViewById(R.id.back_btn);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MenuActivity();
            }
        });
    }
        public void MenuActivity () {

            Intent intent = new Intent(this, MenuActivity.class);
            startActivity(intent);

        }

    }

