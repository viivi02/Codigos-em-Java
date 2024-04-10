package org.example;

import java.util.Scanner;

public class Atvd3 {
    public static void main(String[]args){
        int resultado = 0;
        Scanner numero = new Scanner(System.in);
        System.out.print("Informe o número para fazer a tabuada: ");
        int num = numero.nextInt();
        for (int i = 0; i <=10; i++){
           resultado = num * i;
           System.out.println(num +" x "+ i +" = "+ resultado);
        }
    }
}
