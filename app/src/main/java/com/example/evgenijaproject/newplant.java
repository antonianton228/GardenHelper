package com.example.evgenijaproject;

import static android.widget.Toast.LENGTH_SHORT;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Date;

public class newplant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newplant);
    }
    public void plant(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        Object[] ret = new Object[]{};
        System.out.println(v.getId());
        switch (v.getId()){
            case R.id.plant1:
                ArrayList<NeedClass> array = new ArrayList<>();
                array.add(new NeedClass("Полить", "1 день", new Date(0), 1, 1));
                Gson gson = new Gson();
                String json = gson.toJson(array);
                ret = new Object[] {R.drawable.ficus, "Фикус", "Нет уведомлений", "Тут описание", json};
                intent.putExtra("plantArr", ret);
                setResult(RESULT_OK, intent);

                finish();
                break;
            case R.id.plant2:
                array = new ArrayList<>();
                array.add(new NeedClass("Выкопать", "120 дней", new Date(0), 120, 1));
                gson = new Gson();
                json = gson.toJson(array);
                ret = new Object[] {R.drawable.potato, "Картофель", "Нет уведомлений", "Тут описание", json};
                intent.putExtra("plantArr", ret);
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.plant3:
                array = new ArrayList<>();
                array.add(new NeedClass("Полить", "1 день", new Date(0), 1, 1));
                gson = new Gson();
                json = gson.toJson(array);
                ret = new Object[] {R.drawable.ukrop, "Укроп", "Нет уведомлений", "Тут описание", json};
                intent.putExtra("plantArr", ret);
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.plant4:
                array = new ArrayList<>();
                array.add(new NeedClass("Полить", "1 день", new Date(0), 1, 1));
                gson = new Gson();
                json = gson.toJson(array);
                ret = new Object[] {R.drawable.parrot, "Морковь", "Нет уведомлений", "Тут описание", json};
                intent.putExtra("plantArr", ret);
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.plant5:
                array = new ArrayList<>();
                array.add(new NeedClass("Подкормить", "365 день", new Date(0), 365, 1));
                gson = new Gson();
                json = gson.toJson(array);
                ret = new Object[] {R.drawable.cherry, "Черешня", "Нет уведомлений", "Тут описание", json};
                intent.putExtra("plantArr", ret);
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.plant6:
                array = new ArrayList<>();
                array.add(new NeedClass("Полить", "1 день", new Date(0), 1, 1));
                gson = new Gson();
                json = gson.toJson(array);
                ret = new Object[] {R.drawable.rodondedron, "Рододендрон", "Нет уведомлений", "Тут описание", json};
                intent.putExtra("plantArr", ret);
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.plant7:
                array = new ArrayList<>();
                array.add(new NeedClass("Собрать", "365 дней", new Date(0), 365, 1));
                gson = new Gson();
                json = gson.toJson(array);
                ret = new Object[] {R.drawable.riabina, "Рябина", "Нет уведомлений", "Тут описание", json};
                intent.putExtra("plantArr", ret);
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.plant8:
                array = new ArrayList<>();
                array.add(new NeedClass("Собрать", "365 дней", new Date(0), 365, 1));
                gson = new Gson();
                json = gson.toJson(array);
                ret = new Object[] {R.drawable.apple, "Яблоня", "Нет уведомлений", "Тут описание", json};
                intent.putExtra("plantArr", ret);
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.plant9:
                array = new ArrayList<>();
                array.add(new NeedClass("Собрать", "365 дней", new Date(0), 365, 1));
                gson = new Gson();
                json = gson.toJson(array);
                ret = new Object[] {R.drawable.berry, "Черника", "Нет уведомлений", "Тут описание", json};
                intent.putExtra("plantArr", ret);
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.plant10:
                array = new ArrayList<>();
                array.add(new NeedClass("Собрать", "365 дней", new Date(0), 365, 1));
                gson = new Gson();
                json = gson.toJson(array);
                ret = new Object[] {R.drawable.malina, "Малина", "Нет уведомлений", "Тут описание", json};
                intent.putExtra("plantArr", ret);
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.plant11:
                array = new ArrayList<>();
                array.add(new NeedClass("Полить", "1 день", new Date(0), 365, 1));
                gson = new Gson();
                json = gson.toJson(array);
                ret = new Object[] {R.drawable.fasol, "Фасоль", "Нет уведомлений", "Тут описание", json};
                intent.putExtra("plantArr", ret);
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.plant12:
                array = new ArrayList<>();
                array.add(new NeedClass("Найти", "1 день", new Date(0), 1, 1));
                gson = new Gson();
                json = gson.toJson(array);
                ret = new Object[] {R.drawable.cocos, "Кокос", "Нет уведомлений", "Тут описание", json};
                intent.putExtra("plantArr", ret);
                setResult(RESULT_OK, intent);
                finish();
                break;

        }
    }
}