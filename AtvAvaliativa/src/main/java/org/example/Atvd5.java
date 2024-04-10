package org.example;

import java.util.Scanner;
public class Atvd5 {
    public static void main(String[]args){
        int soma = 0;
        Scanner numero = new Scanner(System.in);
        System.out.print("Informe o número para verificar se é perfeito: ");
        int num = numero.nextInt();
        for (int i = 1; i < num ; i++){
            if(num % i == 0){
                soma += i;
            }
        }
        if (soma == num){
            System.out.println("Este número é perfeito!");
        }
        else
            System.out.println("Este número não é perfeito!");
    }
}
