package edu.jason.segundasemana;
public class MyClass {
    public static void main(String[] args) {
        /*
         * <-- Exemplo de variaveis ->
         * String myName = "Jason Santos";
         * int yearManifecture = 2022;
         * boolean isTrue = false;
         */
        String firstName = "Jason";
        String lastName = "Santos";

        String fullName = fullName(firstName, lastName);

        System.out.println(fullName);
    }

    public static String fullName(String firstName, String lastName) {
        return "Resultado do método: "+ firstName.concat(" ").concat(lastName);
    }
}
