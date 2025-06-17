package model;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private String funcao;
    private LocalDate dataContratacao;
    private double salario;
    private int tempoCasa = dataContratacao.getYear() - LocalDate.now().getYear();


    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public void bonusSalario() {
        if (tempoCasa >= 5 && tempoCasa < 10) {
            salario += salario * 0.3;
        } else if (tempoCasa >= 10) {
            salario += salario * 0.5;
        }
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Função: " + funcao);
        System.out.println("Data de Contratacao: " + dataContratacao);
        System.out.println("Salario: " + salario);
    }



    @Override
    public String toString() {
        return "Nome: " + nome + ", Função: " + funcao;
    }
}
