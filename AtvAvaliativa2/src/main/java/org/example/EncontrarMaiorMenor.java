package org.example;

public class EncontrarMaiorMenor {
    public static void main(String[] args){
        int[] vetor = {10, 5, 7, 3, 1, 3, 11, 20, 6, 9};
        int maior = vetor[0], menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            } else if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }
}
