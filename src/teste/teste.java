package teste;


import model.Atleta;
import model.Stats;

import java.time.LocalDate;

public class teste {
    public static void main(String[] args) {
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
        dodi.setnCamisa("17");
        dodi.setFimContrato(LocalDate.of(2026, 1,1));
        dodi.setPosicao("Volante");
        dodi.setValorMercado(50000);
        dodi.setStats(dodiS);
        //dodiS.mediaGA();
        dodi.exibirDados();








    }
}
