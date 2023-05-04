package colecciones.Ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ejercicio04 {
    public static void main(String[] args) {

        List<Integer> listaNumeros=new ArrayList<>();


        for (int i = 0; i <100 ; i++) {

            listaNumeros.add((int) (Math.random()*10+1));

        }
        // antes de imprimir vamops a ordenar

         listaNumeros.sort((n1,n2) -> n1 -n2);
        //listaNumeros.forEach(n-> System.out.print( n + " "));

        Iterator<Integer> buscador = listaNumeros.iterator();

        while (buscador.hasNext()){

            Integer numero = buscador.next();
            if (numero ==5){
                buscador.remove();
            }
        }
        listaNumeros.forEach( n -> System.out.print(n + " "));



    }
}
