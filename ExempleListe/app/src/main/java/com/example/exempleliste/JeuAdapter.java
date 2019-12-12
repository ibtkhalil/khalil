package com.example.exempleliste;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class JeuAdapter extends ArrayAdapter<jeu> {
    public JeuAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        View v;
        LayoutInflater layoutInflater=(LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v=layoutInflater.inflate(R.layout.jeu_cell,null);

        jeu currentJeu=getItem(position);

        TextView nomJeu=(TextView)v.findViewById(R.id.titreJeu);
        TextView prixJeu=(TextView)v.findViewById(R.id.prixJeu);

        nomJeu.setText(currentJeu.getNomJeu());
        prixJeu.setText(String.valueOf(currentJeu.getPrix()));

        return v;

    }
}
