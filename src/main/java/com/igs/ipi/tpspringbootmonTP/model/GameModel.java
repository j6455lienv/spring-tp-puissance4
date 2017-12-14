package com.igs.ipi.tpspringbootmonTP.model;

public class GameModel {
    private String nom1;
    private String nom2;
    private int[][] tab = new int[7][6];

    public GameModel(String nom1, String nom2){
        this.nom1 = nom1;
        this.nom2 = nom2;
    }

    public String getNom1() {
        return nom1;
    }

    public void setNom1(String nom1) {
        this.nom1 = nom1;
    }

    public String getNom2() {
        return nom2;
    }

    public void setNom2(String nom2) {
        this.nom2 = nom2;
    }

    public int[][] getTab() {
        return tab;
    }

    public void setTab(int[][] tab) {
        this.tab = tab;
    }
}
