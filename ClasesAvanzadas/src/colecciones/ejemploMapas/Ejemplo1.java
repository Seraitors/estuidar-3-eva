package colecciones.ejemploMapas;

import java.util.HashMap;

public class Ejemplo1 {
    public  static  void   main (){
        HashMap < Integer, String> mapa = new HashMap<>();

        mapa.put(1,"pepito");
        mapa.put(2,"manolo");
        mapa.put(3,"jorge");
        mapa.put(4,"cirsrge");

        System.out.println(mapa.get(3));// el numero es lña clabe nol aposicion
        System.out.println(mapa.get(2));

        if (mapa.containsKey(5)){
            System.out.println(mapa.get(5));
        }else {
            System.out.println("no existe la clave indiciada");
        }

        // eliminar una entrda
        if (mapa.containsKey(4)){
            mapa.remove(4);
        }
        if (mapa.containsKey(4)){
            System.out.println(mapa.get(4));
        }else {
            System.out.println("no hay nada");
        }
    }
}
