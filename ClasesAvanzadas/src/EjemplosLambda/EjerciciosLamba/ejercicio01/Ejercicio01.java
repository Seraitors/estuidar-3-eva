package EjemplosLambda.EjerciciosLamba.ejercicio01;

import java.util.Arrays;

public class Ejercicio01 {

    public static void main(String[] args) {

        int resultado = determinarSigno(-30);
        System.out.println(resultado);
        System.out.println(print("hola"));
        System.out.println(Arrays.toString((getPrimeroYÚltimo( new int []{-4,5,7,9,2}))));
    }
    public static int determinarSigno(int num) {
        if (num > 0) {
            return 1;
        } else if (num < 0) {
            return -1;
        } else {
            return 0;
        }
    }
    public static String print(String arg) {
        return "\"" + arg + "\"";
    }
    public static int[] getPrimeroYÚltimo(int[] array) {
        return new int[]{array[0], array[array.length-1]};
    }
}

