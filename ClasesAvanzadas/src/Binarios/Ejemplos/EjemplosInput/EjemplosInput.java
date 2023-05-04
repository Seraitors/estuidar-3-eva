package Binarios.Ejemplos.EjemplosInput;

import Binarios.Ejemplos.ejemploOutput.Alumno;
import org.w3c.dom.ls.LSInput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EjemplosInput {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\1daw\\Desktop\\TerceraEvaluacion-master\\ClasesAvanzadas\\src\\Binarios\\Ejemplos\\ejemploOutput\\Alumno.dat";

        FileInputStream fileOutputStream= null;
        ObjectInputStream lecotr= null;


        try {
            //este es el fileInputStream
            fileOutputStream = new FileInputStream(ruta);
                //3 objeto objectinputStream

            lecotr= new ObjectInputStream(fileOutputStream);

            // como hemso guardado una lista  la vamso a recuperar
            List<Alumno> alumnos = (List<Alumno>) lecotr.readObject();
            alumnos.forEach(System.out::println);


        } catch (FileNotFoundException e) {
            System.out.println("eeoror");
            //throw new RuntimeException(e);
        } catch (IOException e) {
            //throw new RuntimeException(e);
            System.out.println("errores");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            //  throw new RuntimeException(e);
            System.out.println("no encuentr al aclase alumno ");

        }


    }
}
