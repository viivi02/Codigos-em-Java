package org.example;

public class Teste {
    public static void main(String[] args) {
        double quilometro = 2.8;
        double litro = 4.5;
        double metroCubico = 2.5;
        double barril = 3.0;

        double mtConv = ConversaoDeDados.convKmmt(quilometro);
        double dlConv = ConversaoDeDados.convLDl(litro);
        double pcConv = ConversaoDeDados.convMcPc(metroCubico);
        double dcConv = ConversaoDeDados.convBlDl(barril);
        double lConv = ConversaoDeDados.convBlL(barril);

        System.out.println("2.8 quilômetros correspondem a: " + mtConv + " metros");
        System.out.println("4.5 litros correspondem a: " + dlConv + " decilitros");
        System.out.println("2.5 metros cúbicos correspondem a: " + pcConv + " pés cúbicos");
        System.out.println("3.0 barris correspondem a: " + dcConv + " decalitros");
        System.out.println("3.0 barris correspondem a: " + lConv + " litros");
    }
}


