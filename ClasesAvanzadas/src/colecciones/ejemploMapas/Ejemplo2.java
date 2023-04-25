package colecciones.ejemploMapas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ejemplo2 {
    public static void main(String[] args) {

        // formas d erecorrer un mapa

       HashMap<Integer, String> map = generarMapa();
        // recorriendo el conjunto de claves:keySet()
        for (Integer clave:map.keySet()) {// keyset es el conjunto de cosas
            System.out.println(" clave "+ clave + " valor " +  map.get(clave));
        }

        //con un intedador sobre el conjunto de claves (keyset)


        Iterator<Integer>integerIterator = map.keySet().iterator();
        while (integerIterator.hasNext()){
            Integer clave = integerIterator.next();
            // y ya con esa clave puedo recuperar el valor
            System.out.println("k" + clave + "v" + map.get(clave));
        }
        // con la entrada completa : Map.Entry

        for (Map.Entry entrada: map.entrySet()) {
            System.out.println(entrada.getKey() + " - " + entrada.getValue() );
        }

        // con Map.entry e iterator sobre el conjunto
        Iterator< Map.Entry< Integer,String>> entryIterator = map.entrySet().iterator();
        while (entryIterator.hasNext()){
            Map.Entry entrada = entryIterator.next();

            System.out.println(entrada.getKey() + " <>" +entrada.getValue());
        }

        // si quiero recorrer solo las claves :keySet

        System.out.println("claves "+ Arrays.toString( map.keySet().toArray()));



        // si quiero recorrer solo los valores

        System.out.println("valores" +Arrays.toString( map.values().toArray()) );
    }





    public static HashMap<Integer, String> generarMapa(){
        HashMap < Integer, String> mapa = new HashMap<>();

        mapa.put(1,"pepito");
        mapa.put(2,"manolo");
        mapa.put(3,"jorge");
        mapa.put(4,"cirsrge");
        return mapa;
    }
}
