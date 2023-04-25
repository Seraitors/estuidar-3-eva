package EjerClasesPorMi.ejercicio12;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Libros> libros = new ArrayList<>();

        Libros libros1 = new Libros( "Manolo","37344",505);
        Libros libros2 = new Libros( "pepe","344",505);
        Libros libros3 = new Libros( "valen","7344",505);


        libros.add(libros1);
        libros.add(libros2);
        libros.add(libros3);
        libros1.prestar();



     cuentaPrestada(libros);



    }

    public static  int cuentaPrestada( ArrayList <Libros> libros){

        int prestados =0;

        for (Libros libreria: libros) {
            if (libreria.prestado == true) {
                prestados++ ;
            }
        }
        System.out.println(prestados);
        return prestados;
    }



}
