package teste;


import model.*;

import java.time.LocalDate;

public class teste {
    public static void main(String[] args) {

        // teste alteta
        Atleta dodi =  new Atleta();

        Stats dodiS = new Stats();
        dodiS.setAssits(11);
        dodiS.setPartidas(30);
        dodiS.setQuantMvp(2);
        dodiS.setGols(6);

        dodi.setNome("Douglas");
        dodi.setSobrenome("moreira");
        dodi.setDataContratacao(LocalDate.of(2024, 10 ,1));
        dodi.setDataNascimento(LocalDate.of(1999, 4,1));
        dodi.setStats(dodiS);
        dodi.setnCamisa("17");
        dodi.setFimContrato(LocalDate.of(2026, 1,1));
        dodi.setPosicao(Posicao.Volante);
        dodi.setValorMercado(50000);
        dodiS.mediaGA();
        dodiS.somaGA();
        dodi.exibirDados();

        //teste partidas

        Partida p1 = new Partida();
        p1.setAdversario("porto alegre reds");
        p1.setData(LocalDate.now());
        p1.addEscalacao(dodi);
        p1.setGolsPro(5);
        p1.setGolsContra(0);
        p1.setResultado("vitoria do imortal tricolor rei de copas");
        p1.setMvp(dodi);
        System.out.println(p1);

        // teste clube

        Clube imortal = new Clube();
        imortal.setNome("Gremio FBPA");
        imortal.setCriacao(LocalDate.of(1903,9, 15));
        imortal.adicionarAtleta(dodi);
        imortal.adicionarPartida(p1);
        imortal.exibirAtletas();
        imortal.exibirPartidas();

        // teste funcionario

        Funcionario mano = new Funcionario();
        mano.setFuncao("tecnico");
        mano.setDataContratacao(LocalDate.of(2025, 4, 15));
        mano.setDataNascimento(LocalDate.of(1999, 4, 15));
        mano.setNome("brother");
        mano.setSobrenome("menezes");
        mano.setSalario(50000);

        System.out.println(mano);









    }
}
