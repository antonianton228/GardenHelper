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

                array.add(new NeedClass("Полить", "если осень стоит сухая и жаркая, необходимо проводить еженедельные поливы малиновых кустов (по 2 лейки под каждый)", new Date(0), 7, 9));
                array.add(new NeedClass("Прорыхлить", "с последующим неглубоким рыхлением земли каждую неделю под растениями", new Date(0), 7, 9));
                array.add(new NeedClass("Удобрить", "соломой или опилками слоем 5 см", new Date(0), 7, 9));

                array.add(new NeedClass("Полить", "если осень стоит сухая и жаркая, необходимо проводить еженедельные поливы малиновых кустов (по 2 лейки под каждый)", new Date(0), 7, 10));
                array.add(new NeedClass("Прорыхлить", "с последующим неглубоким рыхлением земли каждую неделю под растениями", new Date(0), 7, 10));
                array.add(new NeedClass("Удобрить", "соломой или опилками слоем 5 см", new Date(0), 7, 10));

                array.add(new NeedClass("Полить", "если осень стоит сухая и жаркая, необходимо проводить еженедельные поливы малиновых кустов (по 2 лейки под каждый)", new Date(0), 7, 11));
                array.add(new NeedClass("Прорыхлить", "с последующим неглубоким рыхлением земли каждую неделю под растениями", new Date(0), 7, 11));
                array.add(new NeedClass("Удобрить", "соломой или опилками слоем 5 см", new Date(0), 7, 11));



                array.add(new NeedClass("Полить", "Именно в это время растениям необходимы регулярные, обильные поливы. Через день по три лейки.", new Date(0), 2, 6));
                array.add(new NeedClass("Прорыхлить", "После каждого полива хорошо прорыхлите землю вокруг кустов на глубину не больше 6 – 7 см, чтобы не повредить поверхностную корневую систему растений", new Date(0), 2, 6));
                array.add(new NeedClass("Подкормить", "В начале месяца начинается цветение и кустам необходимы калий, фосфор и микроэлементы.В конце июня начинают образовываться завязи. И здесь растениям нужен калий", new Date(0), 2, 6));

                array.add(new NeedClass("Полить", "Именно в это время растениям необходимы регулярные, обильные поливы. Через день по три лейки.", new Date(0), 2, 7));
                array.add(new NeedClass("Прорыхлить", "После каждого полива хорошо прорыхлите землю вокруг кустов на глубину не больше 6 – 7 см, чтобы не повредить поверхностную корневую систему растений", new Date(0), 2, 7));
                array.add(new NeedClass("Подкормить", "В начале месяца начинается цветение и кустам необходимы калий, фосфор и микроэлементы.В конце июня начинают образовываться завязи. И здесь растениям нужен калий", new Date(0), 2, 7));

                array.add(new NeedClass("Полить", "Именно в это время растениям необходимы регулярные, обильные поливы. Через день по три лейки.", new Date(0), 2, 8));
                array.add(new NeedClass("Прорыхлить", "После каждого полива хорошо прорыхлите землю вокруг кустов на глубину не больше 6 – 7 см, чтобы не повредить поверхностную корневую систему растений", new Date(0), 2, 8));
                array.add(new NeedClass("Подкормить", "В начале месяца начинается цветение и кустам необходимы калий, фосфор и микроэлементы.В конце июня начинают образовываться завязи. И здесь растениям нужен калий", new Date(0), 2, 8));





                Gson gson = new Gson();
                String json = gson.toJson(array);
                ret = new Object[] {R.drawable.malina, "Малина", "Нет уведомлений", "Кустарниковое растение со сладкими тёмно-красными ягодами, а также сами ягоды его. Растение плохо переносит засуху и сухую землю. По этой причине следует обеспечивать кустам правильный полив. Из-за отсутствия влаги у малины начнут желтеть и высыхать листья. По этой причине для ягоды рекомендуется выбирать места с влажной почвой, которая только положительно будет отражаться на урожае. Важнейший период в уходе за малиной – осень.", json};
                intent.putExtra("plantArr", ret);
                setResult(RESULT_OK, intent);

                finish();
                break;
            case R.id.plant2:
                array = new ArrayList<>();

                array.add(new NeedClass("Полив", "регулярный (один раз в неделю)", new Date(0), 7, 1));
                array.add(new NeedClass("Полив", "регулярный (один раз в неделю)", new Date(0), 7, 2));
                array.add(new NeedClass("Полив", "регулярный (один раз в неделю)", new Date(0), 7, 3));
                array.add(new NeedClass("Полив", "регулярный (один раз в неделю)", new Date(0), 7, 4));
                array.add(new NeedClass("Полив", "регулярный (один раз в неделю)", new Date(0), 7, 5));
                array.add(new NeedClass("Полив", "регулярный (один раз в неделю)", new Date(0), 7, 6));
                array.add(new NeedClass("Полив", "регулярный (один раз в неделю)", new Date(0), 7, 7));
                array.add(new NeedClass("Полив", "регулярный (один раз в неделю)", new Date(0), 7, 8));
                array.add(new NeedClass("Полив", "регулярный (один раз в неделю)", new Date(0), 7, 9));
                array.add(new NeedClass("Полив", "регулярный (один раз в неделю)", new Date(0), 7, 10));
                array.add(new NeedClass("Полив", "регулярный (один раз в неделю)", new Date(0), 7, 11));
                array.add(new NeedClass("Полив", "регулярный (один раз в неделю)", new Date(0), 7, 12));

                array.add(new NeedClass("Прорыхлить", "Желательно рыхлить междурядья, особенно в начальный период роста, а сами растения гороха —окучивать.\n", new Date(0), 7, 1));
                array.add(new NeedClass("Прорыхлить", "Желательно рыхлить междурядья, особенно в начальный период роста, а сами растения гороха —окучивать.\n", new Date(0), 7, 2));
                array.add(new NeedClass("Прорыхлить", "Желательно рыхлить междурядья, особенно в начальный период роста, а сами растения гороха —окучивать.\n", new Date(0), 7, 3));
                array.add(new NeedClass("Прорыхлить", "Желательно рыхлить междурядья, особенно в начальный период роста, а сами растения гороха —окучивать.\n", new Date(0), 7, 4));
                array.add(new NeedClass("Прорыхлить", "Желательно рыхлить междурядья, особенно в начальный период роста, а сами растения гороха —окучивать.\n", new Date(0), 7, 5));
                array.add(new NeedClass("Прорыхлить", "Желательно рыхлить междурядья, особенно в начальный период роста, а сами растения гороха —окучивать.\n", new Date(0), 7, 6));
                array.add(new NeedClass("Прорыхлить", "Желательно рыхлить междурядья, особенно в начальный период роста, а сами растения гороха —окучивать.\n", new Date(0), 7, 7));
                array.add(new NeedClass("Прорыхлить", "Желательно рыхлить междурядья, особенно в начальный период роста, а сами растения гороха —окучивать.\n", new Date(0), 7, 8));
                array.add(new NeedClass("Прорыхлить", "Желательно рыхлить междурядья, особенно в начальный период роста, а сами растения гороха —окучивать.\n", new Date(0), 7, 9));
                array.add(new NeedClass("Прорыхлить", "Желательно рыхлить междурядья, особенно в начальный период роста, а сами растения гороха —окучивать.\n", new Date(0), 7, 10));
                array.add(new NeedClass("Прорыхлить", "Желательно рыхлить междурядья, особенно в начальный период роста, а сами растения гороха —окучивать.\n", new Date(0), 7, 11));
                array.add(new NeedClass("Прорыхлить", "Желательно рыхлить междурядья, особенно в начальный период роста, а сами растения гороха —окучивать.\n", new Date(0), 7, 12));


                gson = new Gson();
                json = gson.toJson(array);
                ret = new Object[] {R.drawable.goroh, "Горох", "Нет уведомлений", "Род однолетних и многолетних травянистых растений семейства бобовые. Широко используется как пищевая и кормовая культура. Имеет длинные (до 2,5 м) травянистые стебли с несколькими черешками, на которых расположены перистые листья, заканчивающиеся разветвленными усиками. При помощи этих усиков растение вьется по опоре и удерживается в вертикальном положении.", json};
                intent.putExtra("plantArr", ret);
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.plant3:
                array = new ArrayList<>();
                array.add(new NeedClass("Побелить", "От вредителей", new Date(0), 100, 9));
                array.add(new NeedClass("Побелить", "От вредителей", new Date(0), 100, 10));
                array.add(new NeedClass("Побелить", "От вредителей", new Date(0), 100, 11));



                array.add(new NeedClass("Побелить", "Побелку деревьев ранней весной (в феврале-марте) либо побелка смылась или сильно облупилась за зиму..", new Date(0), 100, 3));
                array.add(new NeedClass("Побелить", "Побелку деревьев ранней весной (в феврале-марте) либо побелка смылась или сильно облупилась за зиму..", new Date(0), 100, 4));
                array.add(new NeedClass("Побелить", "Побелку деревьев ранней весной (в феврале-марте) либо побелка смылась или сильно облупилась за зиму..", new Date(0), 100, 5));

                array.add(new NeedClass("Обрезка", "Так, в весенний период в первую очередь проводитсясанитарная обрезка, т.е. вам нужно удалить все поломанные и сухие ветви, которые не пережили зиму.", new Date(0), 100, 3));
                array.add(new NeedClass("Обрезка", "Так, в весенний период в первую очередь проводитсясанитарная обрезка, т.е. вам нужно удалить все поломанные и сухие ветви, которые не пережили зиму.", new Date(0), 100, 4));
                array.add(new NeedClass("Обрезка", "Так, в весенний период в первую очередь проводитсясанитарная обрезка, т.е. вам нужно удалить все поломанные и сухие ветви, которые не пережили зиму.", new Date(0), 100, 5));

                array.add(new NeedClass("Рыхление ", "Очевидно, что за зиму земля уплотняется, поэтому в первую очередь вам нужно провести рыхление приствольного круга, чтобы обеспечить полноценный доступ воздуха и питательной влаги к корневой системе. ", new Date(0), 100, 3));
                array.add(new NeedClass("Рыхление ", "Очевидно, что за зиму земля уплотняется, поэтому в первую очередь вам нужно провести рыхление приствольного круга, чтобы обеспечить полноценный доступ воздуха и питательной влаги к корневой системе. ", new Date(0), 100, 4));
                array.add(new NeedClass("Рыхление ", "Очевидно, что за зиму земля уплотняется, поэтому в первую очередь вам нужно провести рыхление приствольного круга, чтобы обеспечить полноценный доступ воздуха и питательной влаги к корневой системе. ", new Date(0), 100, 5));

                array.add(new NeedClass("Полоть ", "не стоит забыватьо прополке от сорняков", new Date(0), 7, 3));
                array.add(new NeedClass("Полоть ", "не стоит забыватьо прополке от сорняков", new Date(0), 7, 4));
                array.add(new NeedClass("Полоть ", "не стоит забыватьо прополке от сорняков", new Date(0), 7, 5));




                gson = new Gson();
                json = gson.toJson(array);
                ret = new Object[] {R.drawable.grusha, "Груша", "Нет уведомлений", "Фруктовое дерево со съедобными плодами, имеющими форму округлого конуса, а также самый плод этого дерева.", json};
                intent.putExtra("plantArr", ret);
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.plant4:
                array = new ArrayList<>();
                array.add(new NeedClass("Удобрить", "Весной ваньку мокрого стоит подкормить удобрениями. Их можно вносить каждый две недели. Избыток азота ванька не любит, тогда он не цветет. ", new Date(0), 1, 3));
                array.add(new NeedClass("Удобрить", "Весной ваньку мокрого стоит подкормить удобрениями. Их можно вносить каждый две недели. Избыток азота ванька не любит, тогда он не цветет. ", new Date(0), 1, 4));
                array.add(new NeedClass("Удобрить", "Весной ваньку мокрого стоит подкормить удобрениями. Их можно вносить каждый две недели. Избыток азота ванька не любит, тогда он не цветет. ", new Date(0), 1, 5));

                for(int i = 2; i < 12; i++) {
                    array.add(new NeedClass("Проверить грунт для полива", "Особенно важно поливать цветок в период вегетации(роста  и развития растения.) — в это время ему нужно больше воды. Если грунт станет сухим, растение может сбросить листья. Зимой часто поливать цветок не надо, чтобы корни не загнили.", new Date(0), 1, i));
                }

                gson = new Gson();
                json = gson.toJson(array);
                ret = new Object[] {R.drawable.vanya, "Ванька мокрый", "Нет уведомлений", "Недотрога, вечноцвет, огонек, цветок Ванька мокрый – все это названия одно растения, которое достаточно часто встречается в наших квартирах. Родина этого симпатичного цветка – тропическая Азия и Африка. Он является одним из наиболее ", json};
                intent.putExtra("plantArr", ret);
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.plant5:
                array = new ArrayList<>();
                array.add(new NeedClass("Поливать", "Когда появляются бутоны или почва проседает на 6 - 8 см.", new Date(0), 7, 6));
                array.add(new NeedClass("Поливать", "Когда появляются бутоны или почва проседает на 6 - 8 см.", new Date(0), 7, 7));
                array.add(new NeedClass("Поливать", "Когда появляются бутоны или почва проседает на 6 - 8 см.", new Date(0), 7, 8));

                array.add(new NeedClass("Разрыхлить", "", new Date(0), 7, 6));
                array.add(new NeedClass("Разрыхлить", "", new Date(0), 7, 7));
                array.add(new NeedClass("Разрыхлить", "", new Date(0), 7, 8));

                array.add(new NeedClass("Подкормить", "", new Date(0), 7, 6));
                array.add(new NeedClass("Подкормить", "", new Date(0), 7, 7));
                array.add(new NeedClass("Подкормить", "", new Date(0), 7, 8));


                gson = new Gson();
                json = gson.toJson(array);
                ret = new Object[] {R.drawable.potato, "Картошка", "Нет уведомлений", "Род овоща, растение со съедобными клубнями, богатыми крахмалом, а также сами клубни. картофель любит рыхлую, хорошо прогреваемую солнцем почву, но в то же время достаточно требователен к её влажности. Грядки для его выращивания должны в течение всего светового дня освещаться солнцем.", json};
                intent.putExtra("plantArr", ret);
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.plant6:
                array = new ArrayList<>();
                for(int i = 1; i <= 12; i++) {
                    array.add(new NeedClass("Полить", "теплой водой, не замачивая  листья", new Date(0), 1, i));
                }




                gson = new Gson();
                json = gson.toJson(array);
                ret = new Object[] {R.drawable.chriz, "Хризантема ", "Нет уведомлений", "декоративное растение с пышными махровыми цветками. Она любит влагу, но болото в горшке ей не подходит", json};
                intent.putExtra("plantArr", ret);
                setResult(RESULT_OK, intent);
                finish();
                break;


            case R.id.plant7:
                array = new ArrayList<>();
                for(int i = 4; i <= 9; i++) {
                    array.add(new NeedClass("поливать", "рано утром", new Date(0), 7, i));
                    array.add(new NeedClass("подкармливать", "удобрением по 1 горсти золы", new Date(0), 7, i));
                    array.add(new NeedClass("прорыхлить", "рано утром", new Date(0), 7, i));
                    array.add(new NeedClass("обработать от сорняков", "", new Date(0), 7, i));
                }
                gson = new Gson();
                json = gson.toJson(array);




                ret = new Object[] {R.drawable.klubnika, "Клубника", "Нет уведомлений", "название крупноплодных видов растений рода Земляника (Fragaria) семейства Розовые, а также их плодов. Название относится к землянике зелёной (Fragaria viridis), землянике мускусной (Fragaria moschata), землянике ананасной (Fragaria × ananassa). Клубника не любит:\n" +
                        "1. сорняки;\n" +
                        "2. густую посадку;\n" +
                        "3. низину и открытое место посадки;\n" +
                        "4. засуху;\n" +
                        "5. кислую и бедную почву \n", json};
                intent.putExtra("plantArr", ret);
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.plant8:
                array = new ArrayList<>();
                for(int i = 4; i <= 9; i++) {
                    array.add(new NeedClass("прорыхлить", "при появлении 2-3 листиков чеснока ", new Date(0), 7, i));
                    array.add(new NeedClass("удобрить ", "торфом или перегноем", new Date(0), 7, i));
                    array.add(new NeedClass("полив", "регулярно раз в неделю ", new Date(0), 7, i));
                }


                gson = new Gson();
                json = gson.toJson(array);
                ret = new Object[] {R.drawable.chesnok, "чеснок", "Луковичное растение с острым вкусом и резким запахом. Чеснок любит солнце, сажать его лучше на отдельной приподнятой незатененной грядке, но если свободного места не достаточно, можно посадить чеснок по соседству с клубникой, картофелем, черной смородиной, гладиолусами и тюльпанами.", "Тут описание", json};
                intent.putExtra("plantArr", ret);
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.plant9:
                array = new ArrayList<>();

                for(int i = 4; i <= 9; i++) {
                    array.add(new NeedClass("Полить", "", new Date(0), 7, i));
                    array.add(new NeedClass("пропыхлить ", "", new Date(0), 7, i));
                    array.add(new NeedClass("подкормить", "", new Date(0), 7, i));
                }

                gson = new Gson();
                json = gson.toJson(array);
                ret = new Object[] {R.drawable.svekla, "свекла", "Нет уведомлений", "Корнеплод, растение с толстым сладким корнем, идущим в пищу. Она любит плодородную почву, легкие суглинки или супеси. Свекла более теплолюбива, нежели остальные корнеплоды. Высевать ее можно только в почву, прогревшуюся до 8 градусов. При посеве или высадке рассады почва должна быть плодородной на глубину до 30–40см.", json};
                intent.putExtra("plantArr", ret);
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.plant10:
                array = new ArrayList<>();

                for(int i = 6; i <= 8; i++) {
                    array.add(new NeedClass("Полив", "1 раз в два-три дня", new Date(0), 2, i));
                    array.add(new NeedClass("Подкормка ", "В 2 периода", new Date(0), 45, i));
                    array.add(new NeedClass("Рыхление", "Раз в неделю", new Date(0), 7, i));
                }

                gson = new Gson();
                json = gson.toJson(array);
                ret = new Object[] {R.drawable.redis, "Редис", "Нет уведомлений", "это культурное растение, корнеплод. Существует редис самых различных расцветок: от ярко-красного до желтого и белого. На вопрос, сколько же весит 1 редиски, можно ответить, что средний вес одной единицы составляет 15 – 35 грамм, но встречаются и крупные сорта, весящие до 100 – 150 грамм.Редис, как и любая овощная культура, имеет свои особенности выращивания: не боится холода, любит свет, щедрый и регулярный полив, плодородную рыхлую почву, требует хорошей подкормки, не переносит загущенные посадки, не любит жары и засушливого климата", json};
                intent.putExtra("plantArr", ret);
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.plant11:
                array = new ArrayList<>();


                for(int i = 9; i <= 11; i++) {
                    array.add(new NeedClass("Глубоко перекапать землю.", "", new Date(0), 100, i));
                    array.add(new NeedClass("Внести удобрения.( перегной, коровяк) ", "В 2 периода", new Date(0), 100, i));
                   }

                for(int i = 3; i <= 5; i++) {
                    array.add(new NeedClass("прорыхлить ", "чтобы к семенам свободно поступали жидкость и воздух.", new Date(0), 100, i));

                }

                for(int i = 6; i <= 8; i++) {
                    array.add(new NeedClass("Рыхление ", "", new Date(0), 14, i));
                    array.add(new NeedClass("Укрытие ", "В жару", new Date(0), 1, i));
                    array.add(new NeedClass("Полив", "Раз в неделю", new Date(0), 2, i));
                }



                gson = new Gson();
                json = gson.toJson(array);
                ret = new Object[] {R.drawable.ukrop, "Укроп ", "Нет уведомлений", "это травянистое растение, обладающее мощным пряным ароматом. Высота одиночного прямого стебля варьируется от 0,4 до 1,5 м, его темно-зеленая поверхность является тонко-бороздчатой.", json};
                intent.putExtra("plantArr", ret);
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.plant12:
                array = new ArrayList<>();
                for(int i = 6; i <= 8; i++) {
                    array.add(new NeedClass("Поливать", "2 раза в день", new Date(0), 1, i));
                    array.add(new NeedClass("Подкормить", "", new Date(0), 45, i));
                    array.add(new NeedClass("Прополоть", "", new Date(0), 7, i));
                }
                gson = new Gson();
                json = gson.toJson(array);
                ret = new Object[] {R.drawable.petrushka, "Петрушка", "Нет уведомлений", "огородное растение, корень и листья к-рого употр. как приправа к кушаньям. Петрушка любит плодородные с хорошим освещением почвы, хотя неплохо себя чувствует и под кронами деревьев. Не любит свежий навоз. Боится сквозняков.", json};
                intent.putExtra("plantArr", ret);
                setResult(RESULT_OK, intent);
                finish();
                break;

        }
    }
}