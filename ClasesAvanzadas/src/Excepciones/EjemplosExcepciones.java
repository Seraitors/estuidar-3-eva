package Excepciones;

import interfaces.herenciamultiple.E;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemplosExcepciones {

    public static void main(String[] args) {

        // int []pepe = new int[5];

        //1) try {}--> aqui metemos el codigo que puede fallar
        // 2) catch(TipoDeExcepcion nombreQueQuieras) {}---> cuando salta una excepcion , "se viene aqui"
        //cuando salta una excecpcion "se viene aqui"
        //lo que pones dentro de las llaves es lo que quiero que haga
        // en caso de que se produzca esa excepcion
        //normalmente , un mensaje

        //3) (Opcionalmente)finnaly {}--> lo que pongas aqui se ejucta siempre
        // si no ha saltado ninguna excepcion , del trysal aqui
        // si a saltado , depues del catch sigue por aqui

        String [] array = {"uno","dos","tres"};

        try {
            System.out.println(array[3]);
        }catch (ArrayIndexOutOfBoundsException exception1){
            //si salta la excepcion se creara el objeto excepcion1
            //exception1.printStackTrace();
            //System.out.println(exception1.getMessage() );
            System.out.println("te has salido del array ");
        } catch (Exception e){
            System.out.println("excepcion inexperada ");
            System.out.println(e.getMessage());
        } finally
        {
            System.out.println("esto se ejuca si o si ");
        }
        int numerador =5;
        int denominador =0;



        // no concuerda el tipo de dato comn la entrada por teclado

        try {
            System.out.println(numerador/denominador);

        }catch (ArithmeticException e){
            System.out.println("Por que no se puede dividir por 0");
        }catch (Exception a){

            System.out.println(a.getMessage());
        }

        Scanner sc  = new Scanner(System.in);



        try {
            System.out.println("introduc un numero");
            int entero = sc.nextInt();
            System.out.println("Has introducidoo este numero " + entero);
        }catch (InputMismatchException exception3){
            System.out.println("Lo que has introducido no es un numero");
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }






        }








}
