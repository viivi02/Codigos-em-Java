package org.example;
import java.util.Scanner;
public class Multiplicacao {
    public static void main(String[] args) {
        Scanner numero1 = new Scanner(System.in);
        Scanner numero2 = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int num1 = numero1.nextInt();
        System.out.println("Informe o segundo número: ");
        int num2 = numero2.nextInt();
        int resultado = num1 * num2;
        System.out.println("O resultado da multiplicação é: "+resultado);
    }
}
