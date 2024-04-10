package org.example;
import java.util.Scanner;
public class Atvd7 {
    public static void main(String[]args){
        Scanner numero = new Scanner(System.in);
        System.out.print("Informe o número inteiro: ");
        int num = numero.nextInt();
        if (num % 2 == 0 ){
            System.out.println("Este número é par!");
        }else
            System.out.println("Este número é impar!");
    }
}
