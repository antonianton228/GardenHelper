package com.example.evgenijaproject;

import static android.widget.Toast.LENGTH_SHORT;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


import android.app.ListActivity;
import android.content.SharedPreferences;
import android.widget.AdapterView;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;

import android.os.Bundle;

import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class MainActivity extends ListActivity{


    ArrayList<Plant> arrayList = new ArrayList<>();
    SharedPreferences pref;
    MainActivity self = this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        plantAdapter plantAdapter = new plantAdapter(this, R.layout.list_row,arrayList);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView)findViewById(android.R.id.list) ;
        TextView date_now = (TextView) findViewById(R.id.textView);
        date_now.setText(new Date().toString());




        for(int i = 0; i < 100; i++){
            Object f = load("arr" + i);
            if (f != null){
            arrayList.add((Plant)f);}
        else{
            break;
            }
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(self, PlantInfo.class);


                Gson gson = new Gson();
                String json = gson.toJson(arrayList.get(i));
                intent.putExtra("plant", json);
                intent.putExtra("index", "" + i);



                startActivityForResult(intent, 2);

            }
        });

        plantAdapter.notifyDataSetChanged();
        listView.setAdapter(plantAdapter);
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                date_now.setText(new Date().toString());
            }
        }, 0, 1000);




    }



    public void onMyButtonClick(View v) {

        Intent intent = new Intent(this, newplant.class);
        startActivityForResult(intent, 1);

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(requestCode == 1){
        plantAdapter plantAdapter = new plantAdapter(this, R.layout.list_row,arrayList);

        if (data == null) {

            return;}


        Object[] data1 = (Object[]) data.getSerializableExtra("plantArr");
            Gson gson = new Gson();

            ArrayList<NeedClass> obj1 = (ArrayList<NeedClass>) fromJson("" + data1[4], new TypeToken<ArrayList<NeedClass>>(){}.getType());
        Plant plant = new Plant((int)data1[0],(String) data1[1], (String) data1[2],(String) data1[3], obj1);
        arrayList.add(plant);
            plantAdapter.notifyDataSetChanged();
            setListAdapter(plantAdapter);}

        else if (resultCode == 2){
            plantAdapter plantAdapter = new plantAdapter(this, R.layout.list_row,arrayList);
            String data1 = (String) data.getSerializableExtra("plant");
            String data2 = (String) data.getSerializableExtra("index");
            Gson gson = new Gson();
            Plant obj1 = gson.fromJson(data1, Plant.class);
            arrayList.set(Integer.parseInt(data2), obj1);

            save("arr" + (data2), obj1);

            plantAdapter.notifyDataSetChanged();
            setListAdapter(plantAdapter);
        }
        for(int i = 0; i < arrayList.size(); i++){
            save("arr" + i, arrayList.get(i));
        }



    }


//    protected void onStart(){
//        super.onStart();
//        plantAdapter plantAdapter = new plantAdapter(this, R.layout.list_row,arrayList);
//        plantAdapter.notifyDataSetChanged();
//        setListAdapter(plantAdapter);
//        Toast.makeText(getApplicationContext(), "1",  Toast.LENGTH_SHORT).show();
//    }

    private void save(String f, Plant i){
        pref = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor ed = pref.edit();
        Gson gson = new Gson();
        String json = gson.toJson(i);
        ed.putString(f, json);
        ed.apply();
    }
    private Plant load(String f){
        pref = getPreferences(MODE_PRIVATE);
        Gson gson = new Gson();
        String json = pref.getString(f, "");
        Plant obj1 = gson.fromJson(json, Plant.class);
        return obj1;
    }
    public static Object fromJson(String jsonString, Type type) {
        return new Gson().fromJson(jsonString, type);
    }

    }
