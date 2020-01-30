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

public class BloodGroupActivity extends AppCompatActivity {

    EditText Name, Mobile, N_Bags, City, Hospital, Message;
    Spinner blood_group;
    Button button;

    User_req user_req;

    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_group);



        Name = findViewById(R.id.Name);
        Mobile = findViewById(R.id.Mobile);
        N_Bags = findViewById(R.id.bag);
        City = findViewById(R.id.city);
        Hospital = findViewById(R.id.HospitalName);
        Message = findViewById(R.id.Massage);
        blood_group = findViewById(R.id.spinner);
        button = findViewById(R.id.button);

        databaseReference = FirebaseDatabase.getInstance().getReference("User_Req");

        user_req = new User_req();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AddRequest();

                databaseReference.push().child("req").setValue(user_req);
            }
        });
    }
//
    private void AddRequest() {


        user_req.setName(Name.getText().toString());
        user_req.setMobile(Mobile.getText().toString());
        user_req.setN_Bags(N_Bags.getText().toString());
        user_req.setCity(City.getText().toString());
        user_req.setHospital(Hospital.getText().toString());
        user_req.setMessage(Message.getText().toString());
        user_req.setBlood_group(blood_group.getSelectedItem().toString());


    }


}
