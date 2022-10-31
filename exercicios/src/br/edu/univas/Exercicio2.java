package br.edu.univas;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        int birthdayYear = readBirthdayYear();
        int age = calcAge(birthdayYear);
        System.out.println("A idade é: " + age);
    }

    public static int readBirthdayYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento:");
        return scanner.nextInt();
    }

    public static int calcAge(int birthdayYear) {
        return 2022 - birthdayYear;
    }
}
