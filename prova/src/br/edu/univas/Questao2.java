package br.edu.univas;

import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor digite um número entre 50 e 100:");
        long valor = scanner.nextLong();

        long somaTotal = somaValores(valor);
        System.out.println(somaTotal);
    }

    public static long somaValores(long valor) {
        if (valor == 1) {
            return 1;
        }

        return valor + somaValores(valor - 1);
    }

}
