package com.example.evgenijaproject;

import static android.widget.Toast.LENGTH_SHORT;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class PlantInfo extends AppCompatActivity {


    SharedPreferences pref;
    private Plant plant;
    PlantInfo self = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_info);



        String plant_json = getIntent().getStringExtra("plant");





        Gson gson = new Gson();
        this.plant = gson.fromJson(plant_json, Plant.class);

        ImageView img = (ImageView) findViewById(R.id.Image);
        TextView name = (TextView) findViewById(R.id.Name);
        TextView des = (TextView) findViewById(R.id.description);
//        TextView wash_delay = (TextView) findViewById(R.id.WashingDes);
//        TextView lastWash = (TextView) findViewById(R.id.lastWash);
//        TextView message = (TextView) findViewById(R.id.NotifyWash);

        ArrayList<NeedClass> fullArray = plant.Array;




//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("Растение нужно поливать раз в " + plant.getWash_Range());
//        arrayList.add(new SimpleDateFormat("dd.MM.yyyy").format(plant.getIs_wash()));
//
//
        img.setImageResource(plant.getImage());
        name.setText(plant.getName());
        des.setText(plant.getOpis());
//
//        if (plant.check()){
//            arrayList.add("Растение поливать не нужно");
//            arrayList.add("#269E0B");
//        }
//        else{
//            arrayList.add("Необходимо полить растение");
//            arrayList.add("#FF0000");
//            }

        infoAdapetr infoAdapetr = new infoAdapetr(this, R.layout.list_needed, fullArray);

        infoAdapetr.notifyDataSetChanged();


        ListView listneed = (ListView)findViewById(R.id.listofneed);

        listneed.setAdapter(infoAdapetr);
        listneed.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(self, PlantInfo.class);
                fullArray.get(i).setDate(new Date());
                infoAdapetr.notifyDataSetChanged();
                listneed.setAdapter(infoAdapetr);


//                Gson gson = new Gson();
//                String json = gson.toJson(arrayList.get(i));
//                intent.putExtra("plant", json);
//                intent.putExtra("index", "" + i);



//                startActivityForResult(intent, 2);
                intent = new Intent(self, MainActivity.class);
                Gson gson = new Gson();
                String json = gson.toJson(plant);
                intent.putExtra("plant", json);
                intent.putExtra("index", getIntent().getStringExtra("index"));
                setResult(2, intent);



            }
        });

    }


//    public void onMyButtonClick(View v){
//    this.plant.is_wash = new Date();
//
//        TextView lastWash = (TextView) findViewById(R.id.lastWash);
//        TextView message = (TextView) findViewById(R.id.NotifyWash);
//        lastWash.setText(new SimpleDateFormat("dd.MM.yyyy").format(plant.getIs_wash()));
//        if (plant.check()){
//            message.setText("Растение поливать не нужно");
//            message.setTextColor(Color.parseColor("#269E0B"));
//        }
//        else{
//            message.setText("Необходимо полить растение");
//            message.setTextColor(Color.parseColor("#FF0000"));
//        }





//    }

    public void back(View v){
        Intent intent = new Intent(this, MainActivity.class);
        Gson gson = new Gson();
        String json = gson.toJson(plant);
        intent.putExtra("plant", json);
        intent.putExtra("index", getIntent().getStringExtra("index"));
        setResult(2, intent);
        finish();
    }


}