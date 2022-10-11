package com.example.evgenijaproject;

import java.util.Calendar;
import java.util.Date;

public class NeedClass {
    String Name;
    String Des;
    Date Last;
    int Delta;

    public String getName() {
        return Name;
    }

    public String getDes() {
        return Des;
    }

    public Date getLast() {
        return Last;
    }

    public void setDate(Date d){
        Last = d;
    }

    public NeedClass(String name, String des, Date last, int delta){
        Name = name;
        Des = des;
        Last = last;
        Delta = delta;
    }

    public boolean checkDate(){
        Calendar c = Calendar.getInstance();
        c.setTime(Last);
        c.add(Calendar.DATE, Delta);
        Date d1 = c.getTime();
        if(d1.getTime() >= new Date().getTime()){
            return true;
        }
        return false;
    }
}
