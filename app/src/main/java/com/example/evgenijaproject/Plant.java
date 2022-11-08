package com.example.evgenijaproject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Plant {
    public Date is_wash;
    private final Date d1;
    private final Date d2;
    private final Date d3;


    int Image;
    String Name;
    String Opis;
    String Sub;
    String Wash_Range;
    ArrayList<NeedClass> Array;
    int Wash_Range_var;
    int Alarm;




    public Plant(int image, String name, String sub, String opis, ArrayList<NeedClass> array) {
        Image = image;
        Name = name;
        Sub = sub;
        Opis = opis;
        Array = array;
        Alarm = 0;

        Wash_Range = "1 день";
        Wash_Range_var = 86400;


        this.is_wash = new Date(0);
        this.d1 = new Date();
        this.d2 = new Date();
        this.d3 = new Date();
    }

    public int getImage() {
        return Image;
    }

    public String getName() {
        return Name;
    }

    public String getOpis() {return Opis;}

    public String getSub() {
        return Sub;
    }

    public Date getIs_wash() {
        return is_wash;
    }



    public String getWash_Range() {
        return Wash_Range;
    }

    public int getWash_Range_var() {
        return Wash_Range_var;
    }

    public void check(){
        TimeControl timeControl = new TimeControl();
        //int a = timeControl.check_everyday_func(is_wash);
        Alarm = 0;
        for(int i = 0; i < getArray().size(); i++){
            if (getArray().get(i).checkDate()){
                Alarm -= 1;
            }
            else{
                Alarm += 1;
            }
        }

        if (Alarm <= 0){
            Sub = "Нет уведомлений";
            Alarm = 0;
        }
        else{
            Sub = "У вас " + Alarm + " уведомлений";
        }
    }
    public ArrayList<NeedClass> getArray() {

        int curMonth = Integer.parseInt(new SimpleDateFormat("MM").format(new Date()));
        ArrayList<NeedClass> arrOfCurr = new ArrayList<NeedClass>();
        for(int i = 0; i < Array.size(); i++){

            if(Array.get(i).mon == curMonth){
                arrOfCurr.add(0, Array.get(i));
            }
        }
        return arrOfCurr;
    }


}
