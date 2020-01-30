package com.cornez.bloodbanksystem.Activity.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cornez.bloodbanksystem.R;

public class UserViewHolder extends RecyclerView.ViewHolder {

    public TextView name_R;
    public TextView city_R;
    public TextView number_R;
    public TextView address_R;
    public TextView dob_R;
    public TextView blood_Group_R;



    //
    public UserViewHolder(@NonNull View itemView) {
        super(itemView);

        name_R = itemView.findViewById(R.id.T);
        city_R = itemView.findViewById(R.id.TT);
        number_R = itemView.findViewById(R.id.TTT);
        address_R = itemView.findViewById(R.id.Tt);
        dob_R = itemView.findViewById(R.id.TTt);
        blood_Group_R = itemView.findViewById(R.id.TTTt);
    }
    }

