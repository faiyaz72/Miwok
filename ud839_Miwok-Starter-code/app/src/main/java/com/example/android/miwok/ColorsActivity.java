package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Miwok> colors = new ArrayList<Miwok>();

        colors.add(new Miwok("Blue", "jefje"));
        colors.add(new Miwok("Green", "jefje"));
        colors.add(new Miwok("Orange", "jefje"));
        colors.add(new Miwok("Green", "jefje"));
        colors.add(new Miwok("Purple", "jefje"));
        colors.add(new Miwok("Black", "jefje"));
        colors.add(new Miwok("White", "jefje"));


        ColorAdapter adapter = new ColorAdapter(this, colors);
        ListView listView = (ListView) findViewById(R.id.color_list);
        listView.setAdapter(adapter);

    }
}
