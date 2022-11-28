package br.edu.univas;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        int[] mediaTemperaturaMensal = leituraMediaTemperatura();
        int mediaTemperaturaAnual = calculaMediaTemperaturaAnual(mediaTemperaturaMensal);

        int[] temperaturasMensais = alterarValorTemperaturas(mediaTemperaturaMensal, mediaTemperaturaAnual);
        imprimeTemperaturaMensal(temperaturasMensais, mediaTemperaturaAnual);
    }

    public static int[] leituraMediaTemperatura() {
        int[] mediaTemperaturaMensal = new int[12];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 12; i++) {
            System.out.println("Por favor digite a média:");
            mediaTemperaturaMensal[i] = scanner.nextInt();
        }

        return mediaTemperaturaMensal;
    }

    public static int calculaMediaTemperaturaAnual(int[] mediaMensalTemperatura) {
        int somaTotal = 0;
        for (int i = 0; i < mediaMensalTemperatura.length; i++) {
            somaTotal += mediaMensalTemperatura[i];
        }

        return somaTotal / mediaMensalTemperatura.length;
    }

    public static int[] alterarValorTemperaturas(int[] mediaTemperaturaMensal, int mediaTemperaturaAnual) {
        int[] values = new int[mediaTemperaturaMensal.length];

        for (int i = 0; i < mediaTemperaturaMensal.length; i++) {
            if (mediaTemperaturaMensal[i] < mediaTemperaturaAnual) {
                values[i] = -1;
            } else if (mediaTemperaturaMensal[i] == mediaTemperaturaAnual) {
                values[i] = 0;
            } else {
                values[i] = 1;
            }
        }
        return values;
    }

    public static void imprimeTemperaturaMensal(int[] temperaturasMensais, int mediaTemperaturaAnual) {
        System.out.println("Média Anual Temperatura: " + mediaTemperaturaAnual);

        for (int i = 0; i < temperaturasMensais.length; i++) {
            String temp = "abaixo";
            if (temperaturasMensais[i] == 0) {
                temp = "igual";
            } else if (temperaturasMensais[i] == 1) {
                temp = "acima";
            }

            System.out.println("Mês " + (i + 1) + " está " + temp + " da média anual!");
        }
    }
}
