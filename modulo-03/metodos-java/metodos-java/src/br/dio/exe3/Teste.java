package br.dio.exe3;

public class Teste {
    public static void main (String [] args) {
        String a = verifica(20);
    }

    public String verifica(int idade) {
       if (idade > 18) {
            return "Maior de idade";
        } else {
            return "Menor de idade";
        }
    }
}
