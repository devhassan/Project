package com.cornez.bloodbanksystem.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.cornez.bloodbanksystem.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    DatabaseReference reference;
    ArrayList<User_req> list;
    Adaptor_req adaptor_req;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        recyclerView = findViewById(R.id.myRecycler_req);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<User_req>();



        reference = FirebaseDatabase.getInstance().getReference().child("User_Req");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for(DataSnapshot dataSnapshot1: dataSnapshot.getChildren())
                {
                    User_req u = dataSnapshot1.child("req").getValue(User_req.class);
                    list.add(u);

                }

                adaptor_req = new Adaptor_req(SearchActivity.this,list);
                recyclerView.setAdapter(adaptor_req);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(SearchActivity.this, "Something wrong", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
