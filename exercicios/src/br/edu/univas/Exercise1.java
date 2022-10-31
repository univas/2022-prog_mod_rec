package br.edu.univas;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        String word = readWord();
        word = invertWord(word);
        System.out.println("Palavra invertida: " + word);
    }

    public static String readWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor digite uma palavra:");
        return scanner.nextLine();
    }

    public static String invertWord(String word) {
        String newWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            newWord += word.charAt(i);
        }
        return newWord;
    }
}
