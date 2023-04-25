package EjemplosStream;

import EjerClasesPorMi.ejercicio12.Libros;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Transaccion t1 = new Transaccion(1,"alvarez", LocalDate.now(),1000,"madrid");
        Transaccion t2 = new Transaccion(2,"pepe", LocalDate.now(),10070,"barceloma");
        Transaccion t3 = new Transaccion(3,"perico", LocalDate.now(),100,"londres");

        List< Transaccion> transacciones=new ArrayList<>();
        transacciones.add(t1);
        transacciones.add(t2);
        transacciones.add(t3);


        // stream a partir de una lista
        double totalLondres=transacciones.stream()
                .filter((transaccion)-> transaccion.getCiudad().equals("londres"))
                .mapToDouble(transaccion-> transaccion.getPrecio())
                .sum();
        System.out.println(totalLondres);

            //stream a partir de un array


        System.out.println("Stream a partir de una array ");

        String[] frutas = {"mora","naranja","platano","pera","fresa","uva"};
      Arrays.stream(frutas)
                .filter(fruta ->fruta.length() >5)

        .forEach(f -> System.out.println(f) );
        //b
     long numeroDeFrutas= Stream.of(frutas).count();
        System.out.println(numeroDeFrutas);


        //filtrar
            List<Integer> numeros =new ArrayList<>();
        for (int i = 0; i <100 ; i++) {

            numeros.add((int) (Math.random() *101-100));
        }
        for (int i = 0; i <numeros.size() ; i++) {
            System.out.print(numeros.get(i));
            if (i %  20==0){
                System.out.println();
            }
        }



        //filtramos los numeros
        numeros.stream()
                .filter(n-> n %3 == 0 )
                .forEach(n -> System.out.println(n +" "));

       long multiplos3= numeros.stream()
                .filter(n-> n %3==0)
               .count();
        System.out.println("Multiplos de 3:" + multiplos3);



    }
}
