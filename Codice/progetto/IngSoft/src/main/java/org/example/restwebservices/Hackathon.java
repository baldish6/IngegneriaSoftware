package org.example.restwebservices;

import java.util.ArrayList;

public class Hackathon {

    private String id;
    private String nome;
    private String regolamento;
    private String scadenza;
    private String dataInizio;
    private String dataFine;
    private String luogo;
    private String premio;
    private Integer maxDim;
    private Stato stato;
    private ArrayList<Mentore> mentore = new ArrayList<Mentore>();
    private Giudice giudice = new Giudice();
    private ArrayList<Team> teams = new ArrayList<Team>();

    public Hackathon(String id, String nome, String regolamento, String scadenza, String dataInizio, String dataFine, String luogo, String premio, Integer maxDim, Stato stato) {
        this.id = id;
        this.nome = nome;
        this.regolamento = regolamento;
        this.scadenza = scadenza;
        this.dataInizio = dataInizio;
        this.dataFine = dataFine;
        this.luogo = luogo;
        this.premio = premio;
        this.maxDim = maxDim;
        this.stato = stato;
        this.mentore.add(new Mentore());
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getRegolamento() {
        return regolamento;
    }

    public String getScadenza() {
        return scadenza;
    }

    public String getDataInizio() {
        return dataInizio;
    }

    public String getDataFine() {
        return dataFine;
    }

    public String getLuogo() {
        return luogo;
    }

    public String getPremio() {
        return premio;
    }

    public Integer getMaxDim() {
        return maxDim;
    }

    public Stato getStato() {
        return stato;
    }

    public ArrayList<Mentore> getMentore() {
        return mentore;
    }

    public Giudice getGiudice() {
        return giudice;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

}
