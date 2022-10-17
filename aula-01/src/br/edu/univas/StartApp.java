package br.edu.univas;

import java.util.Scanner;

public class StartApp {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Hello World!");
        System.out.println("Digite o primeiro número:");
        int a = leitura.nextInt();
        System.out.println("Digite o segundo número:");
        int b = leitura.nextInt();
        soma(a, b);
        subtracao(a, b);
        multiplicacao(a, b);
        divisao(a, b);

        System.out.println("Bye bye");
    }

    public static void soma(int a, int b) {
        int soma = a + b;
        System.out.println("Soma: " + soma);
    }

    public static void subtracao(int x, int y) {
        int subtracao = x - y;
        System.out.println("Subtração: " + subtracao);
    }

    public static void multiplicacao(int m, int n) {
        int resultado = m * n;
        System.out.println("Multiplicação: " + resultado);
    }

    public static void divisao(int i, int j) {
        int resultado = i / j;
        System.out.println("Divisão: " + resultado);
    }

}
