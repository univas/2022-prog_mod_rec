package br.edu.univas;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        String[] listaJogadoresArtilheiros = new String[10];
        int[] golsMarcados = new int[10];
        String[] selecoesDosJogadoresArtilheiros = new String[10];

        String[] selecoes = new String[10];
        int[] totalGolsPorSelecao = new int[10];

        leituraDadosArtilharia(listaJogadoresArtilheiros, golsMarcados, selecoesDosJogadoresArtilheiros);
        agrupaGolsPorSelecao(selecoesDosJogadoresArtilheiros, golsMarcados, selecoes, totalGolsPorSelecao);
        apresentaDados(selecoes, totalGolsPorSelecao);
    }

    public static void leituraDadosArtilharia(String[] listaJogadoresArtilheiros, int[] golsMarcados, String[] selecoesDosJogadoresArtilheiros) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome do jogador: ");
            listaJogadoresArtilheiros[i] = scanner.nextLine();
            System.out.println("Digite a quantidade de gols marcados: ");
            golsMarcados[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite a qual seleção ele joga:");
            selecoesDosJogadoresArtilheiros[i] = scanner.nextLine();
        }
    }

    public static void agrupaGolsPorSelecao(String[] selecoesArtilharia, int[] golsMarcadosArtilharia, 
            String[] selecoes, int[] totalGolsPorSelecao) {
        int indiceSelecoes = 0;

        for (int i = 0; i < 10; i++) {
            String selecaoAtual = selecoesArtilharia[i];

            if (!jaComputouGolsDaSelecao(selecoes, selecaoAtual)) {
                int totalGols = calcularGolsPorSelecao(selecoesArtilharia, golsMarcadosArtilharia, selecaoAtual);
                totalGolsPorSelecao[indiceSelecoes] = totalGols;
                selecoes[indiceSelecoes] = selecaoAtual;
                indiceSelecoes++;
            }
        }
    }

    public static int calcularGolsPorSelecao(String[] selecoesArtilharia, int[] golsMarcadosArtilharia, String selecaoAtual) {
        int totalGols = 0;

        for (int i = 0; i < 10; i++) {
            if (selecoesArtilharia[i].equals(selecaoAtual)) {
                totalGols += golsMarcadosArtilharia[i];
            }
        }
        return totalGols;
    }

    public static boolean jaComputouGolsDaSelecao(String[] selecoes, String selecaoAtual) {
        for (int i = 0; i < 10; i++) {
            if (selecaoAtual.equals(selecoes[i])) {
                return true;
            }
        }
        return false;
    }

    public static void apresentaDados(String[] selecoes, int[] totalGolsPorSelecao) {
        for (int i = 0; i < 10; i++) {
            if (selecoes[i] != null) {
                System.out.println(selecoes[i] + " - " + totalGolsPorSelecao[i]);
            }
        }
    }
}
