package EjemplosStream.EjerciciosSteam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ejercicio01 {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i <20 ; i++) {
            lista.add((int)(Math.random()*15+1));
        }

        // con streams
        //1.a

        System.out.println("1.a");
            lista.stream()
                    .forEach((numero)-> System.out.print(numero + " "));

        //1.b
        System.out.println("\n\n1.b");
        lista.stream()
                .sorted() // lo ordenamos
                .forEach((numero)-> System.out.print(numero));

        //1.c

        System.out.println("\n1.c");

                lista.stream()
                        .sorted()
                        .distinct()
                        .forEach((numero-> System.out.print(numero)));

                //1.d
        System.out.println("\n 1.d");
        lista.stream()
                .filter(n -> n >=5)// para filtar si son mayores o iguales que 5
                .forEach((numero-> System.out.print(numero + " ")));

        //1.e

        System.out.println("\n 1.E");
        lista.stream()
                .filter(n -> n >=5)
                .sorted()// para filtar si son mayores o iguales que 5
                .forEach((numero-> System.out.print(numero + " ")));



        //1.f


        System.out.println("\n f");

        //NEW  ordenadr inversamente un steam


        lista.stream()
                .filter(n -> n >=5)
                //.sorted((n1,n2)->n2-n1)
                .sorted(Comparator.reverseOrder())
                .forEach((numero-> System.out.print(numero + " ")));

        //1g

        lista.stream()
                .reduce(0,(n1,n2)->n1+n2);


    }
    
}
