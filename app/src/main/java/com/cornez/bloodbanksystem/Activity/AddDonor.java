package com.cornez.bloodbanksystem.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.cornez.bloodbanksystem.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddDonor extends AppCompatActivity {

    EditText Name_R, City_R, Number_R, Address_R, DOB_R;
    Button Donor_Button_R;
    Spinner Blood_Group_R;

    FirebaseDatabase firebaseDatabase;

    DatabaseReference databaseReference;
    User user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_donor);

        Name_R = findViewById(R.id.Mobile);
        City_R = findViewById(R.id.city);
        Number_R = findViewById(R.id.number);
        Blood_Group_R = findViewById(R.id.blood_group);
        Address_R = findViewById(R.id.address);
        DOB_R = findViewById(R.id.DOB);
        Donor_Button_R = findViewById(R.id.reg_btn);

        databaseReference = FirebaseDatabase.getInstance().getReference("User_Donor");

        user = new User();




        Donor_Button_R.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//
                getValues();
                databaseReference.push().child("Donor").setValue(user);
            }
        });
    }

    private void getValues() {




//        databaseReference.push().child("Donor").setValue(user);
        user.setName_R(Name_R.getText().toString());
        user.setCity_R(City_R.getText().toString());
        user.setNumber_R(Number_R.getText().toString());
        user.setAddress_R(Address_R.getText().toString());
        user.setDOB_R(DOB_R.getText().toString());
        user.setBlood_Group_R(Blood_Group_R.getSelectedItem().toString());

    }


}
