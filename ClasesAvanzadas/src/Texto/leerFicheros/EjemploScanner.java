package Texto.leerFicheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjemploScanner {
    public static void main(String[] args) {

        String ruta = "ClasesAvanzadas\\src\\Texto\\leerFicheros\\";

        String archivo = ruta+"HolaMundo.java";
        // con esa ruta creo un file

        File fHolaM= new File(archivo);
        if (fHolaM.exists()){
            System.out.println("Existe");
        }
                Scanner lector=null;
        try {// esto me lo hace cuando quiero intentar el scanner
            lector = new Scanner(fHolaM);
            while (lector.hasNext()){// si no comprobamos que hay en el siguiente liena antes de leerlo puede saltar un error (ENd of file)
                    String linea = lector.nextLine();
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
           // throw new RuntimeException(e);
            System.out.println("Fichero no encontrado");
            System.out.println("lo que esta sbuscando esta "+ fHolaM.getAbsolutePath());
        }finally {
            lector.close();
        }

    }


}
