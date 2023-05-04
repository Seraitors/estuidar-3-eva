package colecciones.Ejercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ejercicio03 {
    public static void main(String[] args) {

        List<Integer> listaNumeros=new ArrayList<>();


        for (int i = 0; i <20 ; i++) {

            listaNumeros.add((int) (Math.random()*10+1));

        }
        // antes de imprimir vamops a ordenar

        listaNumeros.sort((n1,n2) -> n1 -n2);
        listaNumeros.forEach(n-> System.out.print( n + " "));

        // se puede comn un set
        Set<Integer> conjuntoNumeros = new HashSet<>(listaNumeros);

        // Y esta es otra forma
       // Set<Integer> otraForma = new HashSet<>();
        //otraForma.addAll(listaNumeros);

        conjuntoNumeros.forEach(n -> System.out.print(n +" "));




    }
}
