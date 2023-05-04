package Texto.Ejercicios.Ejercicio01;

import java.io.File;
import java.util.Scanner;

public class Ejercicio01 {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);



        String ruta = sc.nextLine();

        File file = new File(ruta);


        boolean exixte = file.exists();
        if (exixte){
            System.out.println(" El fichero exixte");
            System.out.println(file.getAbsolutePath());

            if (file.isDirectory()){

                System.out.println(" es una carptea");
            }else {
                System.out.println("mas concreto un fichero");

                System.out.println("\nNombre" + file.getName());
                System.out.println("\nTamaño" + file.getUsableSpace());
                System.out.println("\nPermisos" );
                String permisos = "";
                if (file.canRead()){
                    permisos = "r";
                }else {
                    permisos = "-";
                }

                if (file.canWrite()){

                    permisos = permisos + "w";
                }else {
                    permisos = permisos + "-";
                }
                if (file.canExecute()){
                    permisos = permisos+ "x";
                }else {
                    permisos = permisos + "-";
                }
                System.out.println(permisos);


            }

        }else{
            System.out.println(" no existe");
        }
    }

}
