package Texto;

import java.io.File;
import java.io.IOException;

public class EjemplosFile {
    public static void main(String[] args) {

        String ruta = "ClasesAvanzadas\\src\\archivo.txt";
        File file = new File(ruta);// esto es la ruta en la qu estara el fichero

        System.out.println("vamos a ver los metodos que tiene File");
        System.out.println("Existe esto?" + file.exists());
        if (!file.exists()){// si el fichero no existe ,lo creamos
            try {
               boolean creado= file.createNewFile();
               if (creado){
                   System.out.println("el fichero se a creado en la ruta :" + file.getAbsolutePath());

               }
            } catch (IOException e) {
                //throw new RuntimeException(e);
                System.out.println("problema al crear el fichero");
                System.out.println(e.getMessage());
            }
        }
        System.out.println( " Es un fichero ?"+ file.isFile());
        System.out.println("es un directorio? " + file.isDirectory());
        System.out.println("dime la ruta: " + file.getAbsolutePath());

        System.out.println("Permisos: " );
        System.out.println(" * lectura "+ file.canRead());
        System.out.println(" * escritura "+ file.canWrite() );
        System.out.println(" * ejecucion " + file.canExecute());


        String ruta2 = "ClasesAvanzadas\\src\\archivo.txt";
        File file1 = new File(ruta2);
        if (file1.exists()){
            boolean eliminado =file1.delete();

            if (eliminado){

                System.out.println("el fichero" + ruta2 + "ha sido eliminado");
            }
        }



    }

    }
