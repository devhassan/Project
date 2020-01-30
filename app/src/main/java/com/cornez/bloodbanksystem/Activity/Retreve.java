package com.cornez.bloodbanksystem.Activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.cornez.bloodbanksystem.R;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Retreve extends AppCompatActivity {

    //ListView listView;
    RecyclerView recyclerView;
    DatabaseReference reference;
    ArrayList<User> list;
    Adaptor adaptor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrive);


        recyclerView = findViewById(R.id.myRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<User>();



      //  final ArrayList<String> arrayList = new ArrayList<>();
      //  listView =findViewById(R.id.listView);
      //  final ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, arrayList);
      //  listView.setAdapter(adapter);

        reference = FirebaseDatabase.getInstance().getReference().child("User_Donor");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for(DataSnapshot dataSnapshot1: dataSnapshot.getChildren())
                {
                    User u = dataSnapshot1.child("Donor").getValue(User.class);
                    list.add(u);

                }

                adaptor = new Adaptor(Retreve.this,list);
                recyclerView.setAdapter(adaptor);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(Retreve.this, "Something wrong", Toast.LENGTH_SHORT).show();
            }
        });

//        reference.addChildEventListener(new ChildEventListener() {
//            @Override
//            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
//
//                for(DataSnapshot snapshot : dataSnapshot.getChildren())
//                {
//                    User user1 = snapshot.getValue(User.class);
//                    arrayList.add(user1.getName_R());
//                    arrayList.add(user1.getAddress_R());
//
//                    adapter.notifyDataSetChanged();
//                    Toast.makeText(getApplicationContext(), user1.getName_R(), Toast.LENGTH_LONG).show();
//                }
//            }
//
//            @Override
//            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
//
//            }
//
//            @Override
//            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {
//
//            }
//
//            @Override
//            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
//
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
    }


}




