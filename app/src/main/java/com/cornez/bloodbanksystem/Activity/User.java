package com.cornez.bloodbanksystem.Activity;

public class User {
    private String Name_R, City_R, Number_R, Address_R, DOB_R,Blood_Group_R;
  //  private boolean permission;

    public User() {
    }

    public User(String name_R, String city_R, String number_R, String address_R, String DOB_R, String blood_Group_R) {
        Name_R = name_R;
        City_R = city_R;
        Number_R = number_R;
        Address_R = address_R;
        this.DOB_R = DOB_R;
        Blood_Group_R = blood_Group_R;
    }


    public String getName_R() {
        return Name_R;
    }

    public void setName_R(String name_R) {
        Name_R = name_R;
    }

    public String getCity_R() {
        return City_R;
    }

    public void setCity_R(String city_R) {
        City_R = city_R;
    }

    public String getNumber_R() {
        return Number_R;
    }

    public void setNumber_R(String number_R) {
        Number_R = number_R;
    }

    public String getAddress_R() {
        return Address_R;
    }

    public void setAddress_R(String address_R) {
        Address_R = address_R;
    }

    public String getDOB_R() {
        return DOB_R;
    }

    public void setDOB_R(String DOB_R) {
        this.DOB_R = DOB_R;
    }

    public String getBlood_Group_R() {
        return Blood_Group_R;
    }

    public void setBlood_Group_R(String blood_Group_R) {
        Blood_Group_R = blood_Group_R;
    }


}
