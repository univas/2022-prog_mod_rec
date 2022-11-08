package br.edu.univas;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        String changedWord = word.trim();

        System.out.println(changedWord);
    }

    public static String trim(String value) {
        String temp = value;

        while (temp.startsWith(" ")) {
            temp = temp.substring(1);
        }

        while (temp.endsWith(" ")) {
            temp = temp.substring(0, temp.length() - 1);
        }

        return temp;
    }
}
