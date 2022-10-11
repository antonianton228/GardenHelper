package com.example.evgenijaproject;

import android.content.Context;
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

import java.util.ArrayList;

public class plantAdapter extends ArrayAdapter<Plant> {
    private Context con;
    private int res;

    public plantAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Plant> objects) {
        super(context, resource, objects);
        this.con = context;
        this.res = resource;
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(con);
        convertView = layoutInflater.inflate(res, parent, false);



        ImageView imageView = convertView.findViewById(R.id.image);
        TextView txtName = convertView.findViewById(R.id.txtName);
        TextView txtSub = convertView.findViewById(R.id.txtSub);

        getItem(position).check();

        imageView.setImageResource(getItem(position).getImage());
        txtName.setText(getItem(position).getName());
        txtSub.setText(getItem(position).getSub());



        return convertView;

    }


}
