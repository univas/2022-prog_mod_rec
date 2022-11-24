package br.edu.univas;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite algo:");
        String palavra = scanner.nextLine();

        if (isPalindrome(palavra)) {
            System.out.println("É um palindrome!");
        } else {
            System.out.println("Não é um palindrome!");
        }
    }

    public static boolean isPalindrome(String word) {
        if (word.length() == 1) {
            return true;
        }

        if (word.charAt(0) ==
                word.charAt(word.length() - 1)) {
            return isPalindrome(
                    word.substring(
                            1, word.length() - 1));
        }

        return false;
    }
}
