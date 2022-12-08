package br.edu.univas;

import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite um número entre 50 e 100:");
        int valor = scanner.nextInt();

        if (valor % 2 == 0) {
            imprimeValores(2, valor);
        } else {
            imprimeValores(1, valor);
        }
    }

    public static void imprimeValores(int valorAtual, int valorFinal) {
        System.out.println(valorAtual);
        if (valorAtual != valorFinal) {
            imprimeValores(valorAtual + 2, valorFinal);
        }
    }

}
