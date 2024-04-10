package org.example;

public class ContarParesImpares {
    public static void main(String[] args){
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int countPar = 0, countImpar = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0){
               countPar += 1;
            }else{
                countImpar += 1;
            }
        }
        System.out.println("Quantidade de números pares: "+ countPar);
        System.out.println("Quantidade de números impares: "+ countImpar);
    }
}
