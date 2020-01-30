package com.cornez.bloodbanksystem.Activity;

public class User_req {
    private String Name,Mobile,N_Bags,City,Hospital,Message,Blood_group;

    public User_req() {
    }

    public User_req(String name, String mobile, String n_Bags, String city, String hospital, String message, String blood_group) {
        Name = name;
        Mobile = mobile;
        N_Bags = n_Bags;
        City = city;
        Hospital = hospital;
        Message = message;
        Blood_group = blood_group;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getN_Bags() {
        return N_Bags;
    }

    public void setN_Bags(String n_Bags) {
        N_Bags = n_Bags;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getHospital() {
        return Hospital;
    }

    public void setHospital(String hospital) {
        Hospital = hospital;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getBlood_group() {
        return Blood_group;
    }

    public void setBlood_group(String blood_group) {
        Blood_group = blood_group;
    }
}
