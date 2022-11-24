package br.edu.univas;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite a base:");
        int base = scanner.nextInt();

        System.out.println("Por favor digite o expoente:");
        int expoente = scanner.nextInt();

        int potencia = calculaPotencia(base, expoente);
        System.out.println(potencia);
    }

    public static int calculaPotencia(int base, int expoente) {
        if (expoente == 1) {
            return base;
        }

        return base * calculaPotencia(
                base, expoente - 1);
    }
}
