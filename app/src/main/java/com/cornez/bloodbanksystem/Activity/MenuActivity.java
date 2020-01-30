package com.cornez.bloodbanksystem.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.cornez.bloodbanksystem.R;

public class MenuActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;

    public Button User_Profile, Help, Reminder, Request, FindDonor, AddRequest,Blood_bank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        User_Profile = findViewById(R.id.user_profile_btn);
        Help = findViewById(R.id.help_btn);
        Reminder = findViewById(R.id.reminder_btn);
        Request = findViewById(R.id.req_btn);
        FindDonor = findViewById(R.id.find_Donor_btn);
        AddRequest = findViewById(R.id.blood_Req_btn);
        Blood_bank = findViewById(R.id.blood_bank_btn);

        Blood_bank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Blood_bank();
            }
        });

        AddRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddRequest();
            }
        });
        FindDonor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FindDonor();
            }
        });
        Request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Request();
            }
        });
        Reminder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Reminder();
            }
        });
        Help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HelpActivity();
            }


        });
        User_Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddDonor();
            }
        });
    }

    public void AddDonor() {
        Intent intent = new Intent(this, AddDonor.class);
        startActivity(intent);
    }

    public void HelpActivity() {
        Intent intent = new Intent(this, HelpChartActivity.class);
        startActivity(intent);
    }

    public void Reminder() {
        Intent intent = new Intent(this, ReminderActivity.class);
        startActivity(intent);
    }

    public void Request() {
        Intent intent = new Intent(this, SearchActivity.class);
        startActivity(intent);
    }

    public void FindDonor() {
        Intent intent = new Intent(this, Retreve.class);
        startActivity(intent);
    }

    public void AddRequest(){

        Intent intent = new Intent(this, BloodGroupActivity.class);
        startActivity(intent);
    }

    private void Blood_bank() {
        Intent intent = new Intent(this,BloodBank.class);
        startActivity(intent);
    }




}

