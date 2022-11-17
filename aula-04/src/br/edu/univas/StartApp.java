package br.edu.univas;

public class StartApp {

    public static void main(String[] args) {
        imprimeNumeroAte10(1);
        imprimeString("BrasilHexa!!!");
    }

    public static void imprimeNumeroAte10(int numero) {
        System.out.println(numero);
        numero++;
        if (numero < 11) {
            imprimeNumeroAte10(numero);
        }
    }

    public static void imprimeString(String conteudo) {
        System.out.println(conteudo);
        int length = conteudo.length();
        if (length > 1) {
            conteudo = conteudo.substring(0, length - 1);
            imprimeString(conteudo);
        }
    }
}
