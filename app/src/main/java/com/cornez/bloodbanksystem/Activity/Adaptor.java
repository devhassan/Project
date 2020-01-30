package com.cornez.bloodbanksystem.Activity;


import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cornez.bloodbanksystem.R;

import java.util.ArrayList;

public class Adaptor extends RecyclerView.Adapter<Adaptor.MyViewHolder> {

    Context context;
    ArrayList<User> users;
    //User is A model class name from which we get over data
    public Adaptor(Context c , ArrayList<User> p){
        context = c;
        users = p;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder (LayoutInflater.from(context).inflate(R.layout.cardview, parent, false));

    }
        //holder carry viewHolder Point

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(users.get(position).getName_R());
        holder.Number.setText(users.get(position).getNumber_R());
        holder.Group.setText(users.get(position).getBlood_Group_R());
       // Picasso.profilepic.setText(profiles.get(position).getAddress_R()).into(holder.profilepic);



    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView name,Number,Group;
        //ImageView profilepic;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            //text
            name =  (TextView)itemView.findViewById(R.id.Name1);
            Number = (TextView)itemView.findViewById(R.id.Number1);
            Group =itemView.findViewById(R.id.B_Group);
            //image
            //profilepic = itemView.findViewById(R.id.imageView);
        }
    }

}
