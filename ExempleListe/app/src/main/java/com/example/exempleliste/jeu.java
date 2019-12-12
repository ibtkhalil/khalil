package com.example.exempleliste;

public class jeu {

    private String nomJeu;
    private float prix;

    public jeu(String nomJeu, float prix) {
        this.nomJeu = nomJeu;
        this.prix = prix;
    }

    public String getNomJeu() {
        return nomJeu;
    }

    public float getPrix() {
        return prix;
    }
}
