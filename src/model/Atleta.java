package model;

import java.time.LocalDate;

public class Atleta extends Pessoa {
    private String posicao;
    private String nCamisa;
    private double valorMercado;
    private LocalDate dataContratacao;
    private LocalDate fimContrato;
    private Stats stats;

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public String getnCamisa() {
        return nCamisa;
    }

    public void setnCamisa(String nCamisa) {
        this.nCamisa = nCamisa;
    }

    public LocalDate getFimContrato() {
        return fimContrato;
    }

    public void setFimContrato(LocalDate fimContrato) {
        this.fimContrato = fimContrato;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Posição: " + posicao);
        System.out.println("Numero Camisa: " + nCamisa);
        System.out.println("Valor de mercado" + valorMercado);
        System.out.println("Data de Contratacao: " + dataContratacao);
        System.out.println("Fim Contrato: " + fimContrato);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "Posição: " + posicao;
    }
}
