package org.example;

import java.util.Scanner;

public class Atvd2 {
    public static void main(String[]args){
        Scanner numero = new Scanner(System.in);
        System.out.print("Informe o número: ");
        int num = numero.nextInt();
        for (int i = 2; i <= num; i++) {
            int y = 0;
            for (int x = 2; x < i; x++ ) {
                if (i % x == 0){
                    y++;
                    break;
                }
            }
            if (y == 0) {
                System.out.println(i);
            }
        }
    }
}
