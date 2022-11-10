package br.edu.univas;

public class StartApp2 {

    public static void main(String[] args) {
        String aluno1 = "João";
        String aluno2 = "Maria";

        if (aluno1 == aluno2) {
            System.out.println("É igual!!!");
        } else {
            System.out.println("Não é igual :(");
        }

        //
        aluno1 = "João";
        aluno2 = "João";

        if (aluno1 == aluno2) {
            System.out.println("É igual!!!");
        } else {
            System.out.println("Não é igual :(");
        }

        //
        aluno1 = "João";
        aluno2 = aluno1;

        if (aluno1 == aluno2) {
            System.out.println("É igual!!!");
        } else {
            System.out.println("Não é igual :(");
        }

        //
        aluno1 = new String("João");
        aluno2 = new String("João");

        if (aluno1 == aluno2) {
            System.out.println("É igual!!!");
        } else {
            System.out.println("Não é igual :(");
        }

        //
        if (aluno1.equals(aluno2)) {
            System.out.println("É igual!!!");
        } else {
            System.out.println("Não é igual :(");
        }
    }
}
