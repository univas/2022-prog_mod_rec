package br.edu.univas;

public class StartApp {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            double valor = soma(10, 16);
            System.out.println("Soma: " + valor);

            valor = subtracao(10, 16);
            System.out.println("Subtração: " + valor);

            valor = multiplicacao(10, 16);
            System.out.println("Multiplicação: " + valor);

            valor = divisao(10, 16);
            System.out.println("Divisão: " + valor);
        }
    }

    public static double soma(int a, int b) {
        double valor = a + b;
        return valor;
    }

    public static double subtracao(int a, int b) {
        double valor = a - b;
        return valor;
    }

    public static double multiplicacao(int a, int b) {
        return a * b;
    }

    public static double divisao(int a, int b) {
        return (double) a / b;
    }
}
