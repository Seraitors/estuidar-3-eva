package colecciones.Ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double numeros = 0;

        List<Double> positivos = new ArrayList<>();
        List<Double> negativos = new ArrayList<>();


            do {
                System.out.println("Numeros: ");
                numeros=sc.nextDouble();

                if (numeros !=0){// para que el cero no se guarde en el array
                    if (numeros>0){
                        positivos.add(numeros);
                    }else {
                        negativos.add(numeros);
                    }
                }
            }while (numeros !=0);

        System.out.println("Positivos" );
        positivos.forEach(n -> System.out.print( n + " "));

//        double suma =0;
//
//        for ( double elemento :positivos
//             ) {
//            suma = suma + elemento;
//        }
        positivos.stream()
                        .reduce(0.0,(a,b) -> a +b );

        System.out.println();
        System.out.println("nEGATIVOS :" );
            negativos.forEach(n -> System.out.print( n + " "));

            positivos.removeIf(n ->n  > 10 || n <-10);
            negativos.removeIf(n ->n  > 10 || n <-10);

        System.out.println(positivos);
        System.out.println(numeros);
    }
}
