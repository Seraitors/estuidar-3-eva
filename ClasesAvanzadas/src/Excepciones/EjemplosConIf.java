package Excepciones;

import java.util.ArrayList;
import java.util.Scanner;

public class EjemplosConIf {

    public static void main(String[] args) {
        //  int []pepe = new int[5];
    String [] array = {"uno","dos","tres"};
                int pos=3;
                if (array.length>3){
                    System.out.println(pos);
                    }else {
                    System.out.println("te has salido del arry ");
                }


        System.out.println();
            // dividir por 0 --> puedo evitar la excepcion con un if
        int numerador =5;
        int denominador =0;
            if (denominador!=0){

                System.out.println(numerador/denominador);
            }else {
                System.out.println("no se puede dividir por 0");
            }

        // no concuerda el tipo de dato comn la entrada por teclado
        Scanner sc  = new Scanner(System.in);

        int entero = sc.nextInt();




    }


}
