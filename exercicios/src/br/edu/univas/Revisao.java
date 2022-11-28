package br.edu.univas;

public class Revisao {

    public static void main(String[] args) {
        metodoSemRetorno("Rodrigo", 35,
                "123.123.123-11",
                "rodrigolfsi@gmail.com");

        metodoSemRetorno("Maria", 5,
                "123.123.123-19",
                "maria@gmail.com");

        String a1 = "A";
        String a2 = "B";
        String a3 = "C";
        int a4 = 10;
        metodoSemRetorno(a1, a4, a2, a3);
    }

    public static void metodoSemRetorno
            (String estudante, int idade,
             String cpf, String email) {

    }
}
