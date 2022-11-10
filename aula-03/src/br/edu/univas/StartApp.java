package br.edu.univas;

import java.util.Scanner;

public class StartApp {

    public static void main(String[] args) {
//        int a = 10;
//        System.out.println(a);
//        test1(a);
//        System.out.println(a);
//        String nome = "Rodrigo";
//        test2(nome);
//        System.out.println(nome);

        int[] notas = new int[2];
        notas[0] = 10;
        notas[1] = 14;
        System.out.println("Nota 1:" + notas[0]);
        System.out.println("Nota 2:" + notas[1]);

        test3(notas);

        notas[0] = 10;
        notas[1] = 14;
        System.out.println("Nota 1:" + notas[0]);
        System.out.println("Nota 2:" + notas[1]);
    }

    public static void test3(int[] x) {
        x[0] = 9;
        x[1] = 13;
        System.out.println("Nota 1:" + x[0]);
        System.out.println("Nota 2:" + x[1]);
    }

    public static void test1(int x) {
        x = 15;
        System.out.println(x);
    }

    public static void test2(String x) {
        x = "João";
        System.out.println(x);
    }


}
