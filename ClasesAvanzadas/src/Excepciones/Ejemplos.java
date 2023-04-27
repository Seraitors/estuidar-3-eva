package Excepciones;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejemplos {

    public static void main(String[] args) {

    String [] array = {"uno","dos","tres"};

        int []pepe = new int[5];

        System.out.println();

        int numerador =5;
        int denominador =0;

        //System.out.println(numerador/denominador);

        // no concuerda el tipo de dato comn la entrada por teclado
        Scanner sc  = new Scanner(System.in);

        int entero = sc.nextInt();


      ArrayList<Integer> integer = new ArrayList<>();

        for (int i = 0; i <10 ; i++) {
            integer.add(i);
        }

        integer.get(11);



    }


}
