package figuras;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Puntos:
        System.out.println("*** Puntos ***");
        Punto p1 = new Punto(1, 0);
        Punto p2 = new Punto(0, 1);
        Punto p3 = new Punto(2, 2);
        Punto p4 = new Punto(3, 1);
        // Crea un ArrayList de puntos y añade los puntos que has creado.
        ArrayList<Punto> puntos = new ArrayList<>();
        puntos.add(p1);
        puntos.add(p2);
        puntos.add(p3);
        puntos.add(p4);
        //Muestra las coordenadas de los cuatro puntos./
        for (Punto elemento: puntos) {
            System.out.println(elemento.toString());
        }

        System.out.println("\n*** Líneas ***");
        Linea linea1 = new Linea(p1, p2);
        Linea linea2 = new Linea(p2, p3);
        Linea linea3 = new Linea(p3, p4);
        Linea linea4 = new Linea(p4, p1);
        System.out.printf("\nLinea 1: %.2f", linea1.calcularLongitud());
        System.out.printf("\nLinea 2: %.2f", linea2.calcularLongitud());
        System.out.printf("\nLinea 3: %.2f", linea3.calcularLongitud());
        System.out.printf("\nLinea 4: %.2f", linea4.calcularLongitud());
        System.out.println("\n" + linea1);
        linea1.dibujarLinea();

        System.out.println();

        // creamos un triángulo pasándole el arraylist de puntos
        // (utilizará solamente los tres primeros)
        Triángulo triángulo = new Triángulo(puntos);
        System.out.println(triángulo);
        System.out.println();
        triángulo.dibujarFigura();

        // creamos un rectángulo
        Rectángulo rectángulo = new Rectángulo(p1, p2, p3, p4);
        System.out.println(rectángulo);
        rectángulo.dibujarFigura();
    }
}
