package model;

public class Stats {
    private int gols;
    private int assits;
    private int partidas;
    private int quantMvp;
    private int soma;
    private int media;


    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getAssits() {
        return assits;
    }

    public void setAssits(int assits) {
        this.assits = assits;
    }

    public int getPartidas() {
        return partidas;
    }

    public void setPartidas(int partidas) {
        this.partidas = partidas;
    }

    public int getQuantMvp() {
        return quantMvp;
    }

    public void setQuantMvp(int quantMvp) {
        this.quantMvp = quantMvp;
    }

    public void mediaGA(){
        media = soma/partidas;
    }

    public void somaGA(){
        soma = gols + assits;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Stats{").append("Gols: ").append(gols).append(", Assistencias: ").append(assits).append(", Partidas: ").append(partidas).append(", MVPs: ").append(quantMvp).append(", Soma G/A: ").append(soma).append("Media G/A: ").append(media).append('}').toString();
    }
}
