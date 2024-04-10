package org.example;

import java.util.Scanner;

public class Atvd4 {
    public static void main(String[]args){
        int fatorial = 1;
        Scanner numero = new Scanner(System.in);
        System.out.print("Informe o número para calcular o fatorial: ");
        int num = numero.nextInt();
        for (int i = 1; i <= num; i++){
            fatorial *= i;
            if (i < num) {
                System.out.print(i + " x ");
            }
            else
                System.out.print(i);
        }
        System.out.print(" = "+ fatorial);
    }
}
