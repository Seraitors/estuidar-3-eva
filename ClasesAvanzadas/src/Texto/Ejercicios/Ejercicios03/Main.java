package Texto.Ejercicios.Ejercicios03;

import interfaces.herenciamultiple.F;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String raiz = "ClasesAvanzadas\\src\\Texto\\Ejercicios\\Ejercicios03\\";
        String nombreFichero = raiz + "nombres.csv";

        File file = new File(nombreFichero);


        //System.out.println(file.exists());

        // lo que queremos hacer es escribir
        //FileWriter es para escribir
        FileWriter escritor= null;
        try {
             escritor = new FileWriter(file , true); // true -> te va añadiendo false -> sobreescribe
            // ya puedo escribri
            escritor.write("\njorge explicame mates");
            Scanner sc = new Scanner(System.in);
            String nombre = sc.nextLine();
            String appellido = sc.nextLine();
            String linea = "\n"+ nombre + "|" + appellido ;
                escritor.write(linea);



        } catch (IOException e) {
            //throw new RuntimeException(e);
            System.out.println("Excepcion de netrads ay salida ");
        }finally {
            try {
                escritor.close();
            } catch (IOException e) {
                // throw new RuntimeException(e);
                System.out.println("Error al cerrar el objeto. ");

                e.printStackTrace();
            }
        }


    }
}
