package model;

import java.time.LocalDate;

public abstract class Pessoa {
    protected String nome;
    protected String sobrenome;
    protected LocalDate dataNascimento;
    protected int idade;



    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int calcularIdade() {
        LocalDate data = LocalDate.now();
        int ano = data.getYear();
        int anoNasc = dataNascimento.getYear();
        idade = ano - anoNasc;
        return idade;
    }

    public abstract void bonusSalario();

    public abstract void exibirDados();
}
