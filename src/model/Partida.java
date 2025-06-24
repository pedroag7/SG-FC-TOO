package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Partida {
    private String resultado;
    private String adversario;
    private int golsPro;
    private int golsContra;
    private LocalDate data;
    private ArrayList<Atleta> escalacao;
    private Atleta mvp;

    public Partida(int golsPro, int golsContra) {
        this.golsPro = golsPro;
        this.golsContra = golsContra;
        calcRes();
        this.escalacao = new ArrayList<>();
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getAdversario() {
        return adversario;
    }

    public void setAdversario(String adversario) {
        this.adversario = adversario;
    }

    public int getGolsPro() {
        return golsPro;
    }

    public void setGolsPro(int golsPro) {
        this.golsPro = golsPro;
    }

    public int getGolsContra() {
        return golsContra;
    }

    public void setGolsContra(int golsContra) {
        this.golsContra = golsContra;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public ArrayList<Atleta> getEscalacao() {
        return escalacao;
    }

   /* public void setEscalacao(ArrayList<Atleta> escalacao) {
        this.escalacao = escalacao;
    }*/

    public Atleta getMvp() {
        return mvp;
    }

    public void setMvp(Atleta mvp) {
        this.mvp = mvp;
    }

    public void addEscalacao(Atleta atleta) {
        this.escalacao.add(atleta);
    }

    public String calcRes() {
        if (golsPro > golsContra) {
            resultado = "Vitoria";
        } else if (golsPro == golsContra) {
            resultado = "Empate";
        }else {
            resultado = "Derrota";
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Adversario: " + adversario + ", Resultado: " + resultado;
    }
}
