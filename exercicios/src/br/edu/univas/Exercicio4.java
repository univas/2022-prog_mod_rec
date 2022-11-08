package br.edu.univas;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite o primeiro número:");
        int a = scanner.nextInt();

        System.out.println("Por favor digite o segundo número:");
        int b = scanner.nextInt();

        int maxNumber = getMaxNumber(a, b);
        System.out.println("Maior número: " + maxNumber);
    }

    public static int getMaxNumber(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }
}
