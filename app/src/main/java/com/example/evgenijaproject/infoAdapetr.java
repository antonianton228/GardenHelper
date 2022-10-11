package com.example.evgenijaproject;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class infoAdapetr extends ArrayAdapter<NeedClass> {
    private Context con;
    private int res;

    public infoAdapetr(@NonNull Context context, int resource, @NonNull ArrayList<NeedClass> objects) {
        super(context, resource, objects);
        this.con = context;
        this.res = resource;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(con);
        convertView = layoutInflater.inflate(res, parent, false);

        TextView nameNeed = convertView.findViewById(R.id.NameNeed);
        TextView des = convertView.findViewById(R.id.washingDes);
        TextView last = convertView.findViewById(R.id.lastWash2);
        TextView mes = convertView.findViewById(R.id.notifyWash);

        nameNeed.setText(getItem(position).getName());
        des.setText(getItem(position).getDes());
        last.setText(new SimpleDateFormat("dd.MM.yyyy").format(getItem(position).getLast()));
        if (getItem(position).checkDate()){
            mes.setText("Пока ничего делать не нужно");
            mes.setTextColor(Color.parseColor("#269E0B"));
        }
        else{
            mes.setText("Необходимо выполнить действие(нажмите на это поле после выполнения)");
            mes.setTextColor(Color.parseColor("#FF0000"));

        }






        return convertView;

    }



}
