package org.example;

public class Atvd1 {
    public static void main(String[]args){
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
            if (i <100) {
                System.out.print(i + " + ");
            }
            else
                System.out.print(i);
        }
        System.out.println(" = " + soma);
    }
}
