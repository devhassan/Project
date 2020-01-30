package com.cornez.bloodbanksystem.Activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cornez.bloodbanksystem.R;

import java.util.ArrayList;

public class Adaptor_req extends RecyclerView.Adapter<Adaptor_req.MyViewHolder>{

    Context context;
    ArrayList<User_req> user_reqs;

    public Adaptor_req(Context c , ArrayList<User_req> p){
        context = c;
        user_reqs = p;
    }

    @NonNull
    @Override
    public Adaptor_req.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Adaptor_req.MyViewHolder(LayoutInflater.from(context).inflate(R.layout.cardview_req, parent, false));
    }

    //holder carry viewHolder Point

    @Override
    public void onBindViewHolder(@NonNull Adaptor_req.MyViewHolder holder, int position) {
        holder.name.setText(user_reqs.get(position).getName());
        holder.city.setText(user_reqs.get(position).getCity());
        holder.Number.setText(user_reqs.get(position).getMobile());
        holder.blood_bag.setText(user_reqs.get(position).getN_Bags());
        holder.hospital.setText(user_reqs.get(position).getHospital());
        holder.Massage.setText(user_reqs.get(position).getMessage());
        holder.BloodGroup.setText(user_reqs.get(position).getBlood_group());

    }

    @Override
    public int getItemCount() {
        return user_reqs.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView name,city,blood_bag,Number,BloodGroup,hospital,Massage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            //text
            name =  (TextView)itemView.findViewById(R.id.name_req);
            city= (TextView)itemView.findViewById(R.id.city_req);
            Number = itemView.findViewById(R.id.number_req);
            blood_bag = itemView.findViewById(R.id.blood_req);
            hospital = itemView.findViewById(R.id.hosiptal_req);
            Massage = itemView.findViewById(R.id.massage_req);
            BloodGroup = itemView.findViewById(R.id.B_Group_req);



        }
    }

}
