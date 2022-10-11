package com.example.evgenijaproject;

import android.app.ListActivity;
import android.os.Bundle;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class TimeControl  extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public int check_everyday_func(Date old){

       if (Objects.equals(new SimpleDateFormat("dd-MM-yyyy").format(old), new SimpleDateFormat("dd-MM-yyyy").format(new Date()))){
            return 1;
        }
        return 0;
    }



}
