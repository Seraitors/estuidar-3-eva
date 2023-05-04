package Binarios.Ejemplos.ejemploOutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class EjemploOutput {

    public static void main(String[] args) {

        // creamos la lista
        List <Alumno> alumnos = new ArrayList<>();
        alumnos.add( new Alumno(1,"aitor","aula de cia","651247"));
        alumnos.add( new Alumno(2,"jorge","aula de cia","65465547"));
        alumnos.add( new Alumno(3,"toño","aula de cia","6552127"));
        alumnos.add( new Alumno(4,"xabiMalo","aula de cia","655141247"));
        alumnos.add( new Alumno(5,"Jason","aula de cia","651635247"));

        // 1) ruta / nombre del dichero

        String ruta = "C:\\Users\\1daw\\Desktop\\TerceraEvaluacion-master\\ClasesAvanzadas\\src\\Binarios\\Ejemplos\\ejemploOutput\\Alumno.dat";
        // 2) Objeto fileOutputStream
        FileOutputStream flujosalida=null;
        ObjectOutputStream escritor= null;
        try {
            flujosalida = new FileOutputStream(ruta);
            //3) Objeto ObjectuOutputStream
             escritor = new ObjectOutputStream(flujosalida);
                escritor.writeObject( alumnos);



        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            System.out.println("ruta incorrecta");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
        // a la hora de salida hay qu ecerrarlo en onder  primerop el de abajo y luego el de arriba es como un arbol primero lo de abajo y luego arriba
            try {
                escritor.close();
                flujosalida.close();



            } catch (IOException e) {
                //throw new RuntimeException(e);
                System.out.println("problema al cerrar el flujo de salida ");
            }
        }


    }




}
