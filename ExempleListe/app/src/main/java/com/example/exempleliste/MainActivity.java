package com.example.exempleliste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<jeu> mesJeux;
    private ListView mListeV;
    private JeuAdapter jeuAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListeV= (ListView)findViewById(R.id.maListe);

        jeuAdapter= new JeuAdapter(getApplicationContext(),0);

        mesJeux= new ArrayList<>();

        mesJeux.add(new jeu("Need for Speed - Carbon",9F));
        mesJeux.add(new jeu("nakoo dall - diadieuf",50F));
        mesJeux.add(new jeu("Pes2020 - Egame",500F));
        mesJeux.add(new jeu("GTA - ViceCity",45F));
        mesJeux.add(new jeu("Lamb - Carbon",9));

        mListeV.setAdapter(jeuAdapter);
        jeuAdapter.addAll(mesJeux);
    }
}
