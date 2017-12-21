package com.igs.ipi.tpspringbootmonTP.model;

public class GameModel {
    private String nom1;
    private String nom2;
    private int[][] gameTable = new int[6][7];
    private int playerTurn;
    private int winner;

    public GameModel(String nom1, String nom2){
        this.nom1 = nom1;
        this.nom2 = nom2;
    }

    public int getWinner() {
        return winner;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }

    public int getPlayerTurn() {
        return playerTurn;
    }

    public void setPlayerTurn(int playerTurn) {
        this.playerTurn = playerTurn;
    }


    public int[][] getGameTable() {
        return gameTable;
    }

    public void setGameTable(int[][] gameTable) {
        this.gameTable = gameTable;
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
        return gameTable;
    }

    public void setTab(int[][] tab) {
        this.gameTable = tab;
    }
}
