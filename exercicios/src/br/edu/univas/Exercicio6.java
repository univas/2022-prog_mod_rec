package br.edu.univas;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        int[] weatherAverage = readWeatherAverage();
        int weatherYearAverage = calcWeatherYearAverage(weatherAverage);

        int[] weatherValues = changeWeatherValues(weatherAverage, weatherYearAverage);
        printMonthWeather(weatherValues, weatherYearAverage);
    }

    public static int[] readWeatherAverage() {
        int[] weatherAverage = new int[12];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 12; i++) {
            System.out.println("Por favor digite a média:");
            weatherAverage[i] = scanner.nextInt();
        }

        return weatherAverage;
    }

    public static int calcWeatherYearAverage(int[] weatherAverage) {
        int sum = 0;
        for (int i = 0; i < weatherAverage.length; i++) {
            sum += weatherAverage[i];
        }

        return sum / weatherAverage.length;
    }

    public static int[] changeWeatherValues(int[] weatherAverage, int weatherYearAverage) {
        int[] values = new int[weatherAverage.length];

        for (int i = 0; i < weatherAverage.length; i++) {
            if (weatherAverage[i] < weatherYearAverage) {
                values[i] = -1;
            } else if (weatherAverage[i] == weatherYearAverage) {
                values[i] = 0;
            } else {
                values[i] = 1;
            }
        }
        return values;
    }

    public static void printMonthWeather(int[] weatherValues, int weatherYearAverage) {
        System.out.println("Média Anual Temperatura: " + weatherYearAverage);

        for (int i = 0; i < weatherValues.length; i++) {
            String temp = "abaixo";
            if (weatherValues[i] == 0) {
                temp = "igual";
            } else if (weatherValues[i] == 1) {
                temp = "acima";
            }

            System.out.println("Mês " + (i + 1) + " está " + temp + " da média anual!");
        }
    }
}
