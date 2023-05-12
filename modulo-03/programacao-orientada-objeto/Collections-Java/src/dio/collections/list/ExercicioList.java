package dio.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<String> perguntas = new ArrayList<String>();

        System.out.print("Telefonou para a vítima? ");
        perguntas.add(input.next().toLowerCase());

        System.out.print("Esteve no local do crime? ");
        perguntas.add(input.next().toLowerCase());

        System.out.print("Mora perto da vítima? ");
        perguntas.add(input.next().toLowerCase());

        System.out.print("Devia para a vítima? ");
        perguntas.add(input.next().toLowerCase());

        System.out.print("Já trabalhou com a vítima? ");
        perguntas.add(input.next().toLowerCase());

        System.out.println("resultado: "+ resultado(perguntas));
    }

    public static String resultado (List list) {
        int cont = 0;
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String next = iterator.next();
            if(next.equals("sim")) cont++;
        }


        String resultado = "";

        switch (cont) {

            case  2:
                resultado = "Suspeito";
                break;
            case 3:
                resultado = "Cúmplice";
                break;
            case 4:
                resultado = "Cúmplice";
                break;
            case 5:
                resultado = "Assassino";
                break;
            default:
                resultado = "Inocente";
        }

        return resultado;
    }

}