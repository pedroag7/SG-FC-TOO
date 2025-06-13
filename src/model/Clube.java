package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Clube {
    private String nome;
    private LocalDate criacao;
    private ArrayList<Atleta> atletas;
    private ArrayList<Partida> partidas;

    public Clube() {
        this.atletas = new ArrayList<>();
        this.partidas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getCriacao() {
        return criacao;
    }

    public void setCriacao(LocalDate criacao) {
        this.criacao = criacao;
    }

    public ArrayList<Atleta> getAtletas() {
        return atletas;
    }

    public ArrayList<Partida> getPartidas() {
        return partidas;
    }

    public void adicionarAtleta(Atleta atleta) {
        this.atletas.add(atleta);
    }
    public void adicionarPartida(Partida partida) {
        this.partidas.add(partida);
    }

    public void exibirAtletas() {
        System.out.println("Atletas: ");
        for (Atleta atleta : atletas) {
            System.out.println(atletas);
        }
    }

    public void exibirPartidas() {
        System.out.println("Partidas: ");
        for (Partida partida : partidas) {
            System.out.println(partida);
        }
    }

}
