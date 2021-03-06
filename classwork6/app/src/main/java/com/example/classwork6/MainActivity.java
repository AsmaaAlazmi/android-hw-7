package com.example.classwork6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        ArrayList<pokemon> mypokemon = new ArrayList<> ();

        pokemon p1 = new pokemon ("pikachu",R.drawable.pika,511,511,511);
        pokemon p2 = new pokemon ("water eater",R.drawable.water,511,511,511);
        pokemon p3 = new pokemon ("alpha human",R.drawable.p3,511,511,511);

        mypokemon.add (p1);
        mypokemon.add (p2);
        mypokemon.add (p3);

       RecyclerView rv = findViewById (R.id.RecyclerView);

        //ترتيب  ال recycel view
       rv.setHasFixedSize (true);
       RecyclerView.LayoutManager ln = new LinearLayoutManager(this);
       rv.setLayoutManager (ln);

    }
}