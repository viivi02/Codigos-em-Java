package org.example;
import java.util.Scanner;
public class Atvd6 {
    public static void main(String[]args){
        Scanner numero = new Scanner(System.in);
        System.out.print("Informe o número: ");
        int num = numero.nextInt();
        int a = 0, b = 1, c = 0;
        while(c < num){
            c = a + b;
            a = b;
            b = c;
            if (c < num) {
                System.out.println(c);
            }
        }
        System.out.println(num);
    }
}
