package Texto.escribirFicheros;

import interfaces.herenciamultiple.F;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploEscribir {
    public static void main(String[] args) {

        String ruta = "ClasesAvanzadas\\src\\Texto\\escribirFicheros\\";

        String archivo = ruta+"fichero.txt";

        File file = new File(archivo);
        // creamos un objeto escrito con FileWriter y le indicamos si queremos append o añadir
        FileWriter escritor = null;
        try {
            escritor = new FileWriter(file,true);// como no tengo bucle for si pongo true añado peor si pongo false sobreescribo
            escritor.write(" \nEstoy escribiendo en mi fichero. \n");
        } catch (IOException e) {
           // throw new RuntimeException(e);
            System.out.println("Excepcion E/S");

        }finally {
            try {
                escritor.close();
            } catch (IOException e) {
               // throw new RuntimeException(e);
                System.out.println("error");
            }
        }


    }
}
