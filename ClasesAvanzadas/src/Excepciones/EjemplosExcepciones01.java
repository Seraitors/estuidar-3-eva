package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemplosExcepciones01 {

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

        int numerador =5;
        int denominador =0;
        Scanner sc  = new Scanner(System.in);

        try {
            System.out.println(array[3]);


            System.out.println(numerador/denominador);
            int entero = sc.nextInt();
            System.out.println("Has introducidoo este numero " + entero);


        }catch (ArrayIndexOutOfBoundsException error1){
            System.out.println("aqui hay un erorr del array");
        }catch (ArithmeticException erro2){
            System.out.println("otro error");
        }catch (InputMismatchException error3){
            System.out.println("otro error de scaner");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



            //si salta la excepcion se creara el objeto excepcion1
            //exception1.printStackTrace();
            //System.out.println(exception1.getMessage() );




        // no concuerda el tipo de dato comn la entrada por teclado

















        }






        }









