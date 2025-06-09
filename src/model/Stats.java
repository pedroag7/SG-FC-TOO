package model;

public abstract class Stats {
    private int gols;
    private int assits;
    private int partidas;
    private int quantMvp;

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

    public double mediaGA(){
        return (double) (gols + assits) / partidas;
    }

    public int somaGA(){
        int soma = 0;
        soma = gols + assits;
        return soma;
    }


}
