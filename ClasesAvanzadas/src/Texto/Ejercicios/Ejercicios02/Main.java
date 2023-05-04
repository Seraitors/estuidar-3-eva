package Texto.Ejercicios.Ejercicios02;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Ejercicio02 de r¡texto


       String raiz = "ClasesAvanzadas\\src\\Texto\\Ejercicios\\Ejercicios02\\";

        String nombreFichero=raiz +"Restaurantes.csv";

        File file = new File(nombreFichero);

        System.out.println(file.exists());

        Scanner lector = null;
        try {
             lector = new Scanner(file);
             lector.nextLine();
             while (lector.hasNext()){

                 String linea = lector.nextLine();

                 //System.out.println(linea);
                 //para coger los campos por separados hacemos un split

                 String[] atributos= linea.split(",");

                 System.out.println(Arrays.toString(atributos));
                 //at

             }



        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("error");

        } catch (NullPointerException a ){
            System.out.println(a.getMessage());
            a.printStackTrace();

        }
        finally {
            //assert lector != null;
            lector.close();

        }


    }
}
