package br.edu.univas;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do {
            printMenu();
            option = scanner.nextInt();

            if (option == 9) {
                System.out.println("Bye bye");
            } else {
                calcOperation(scanner, option);
            }
        } while(option != 9);
    }

    public static void printMenu() {
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");
        System.out.println("9 - Sair");
        System.out.println("Digite uma opção:");
    }

    private static void calcOperation(Scanner scanner, int option) {
        System.out.println("Por favor digite o primeiro número:");
        int a = scanner.nextInt();
        System.out.println("Por favor digite o segundo número:");
        int b = scanner.nextInt();

        int result = 0;
        if (option == 1) {
            result = soma(a, b);
        } else if (option == 2) {
            result = subtracao(a, b);
        } else if (option == 3) {
            result = divisao(a, b);
        } else {
            result = multiplicao(a, b);
        }

        System.out.println("O resultado é: " + result);
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int subtracao(int a, int b) {
        return a - b;
    }

    public static int multiplicao(int a, int b) {
        return a * b;
    }

    public static int divisao(int a, int b) {
        return a / b;
    }
}
