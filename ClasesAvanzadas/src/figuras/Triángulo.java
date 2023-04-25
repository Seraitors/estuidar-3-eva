package figuras;

import java.util.ArrayList;

public class Triángulo extends Figura2D{
    Punto p1;
    Punto p2;
    Punto p3;

    public Triángulo(Punto p1, Punto p2, Punto p3) {
        super(3);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Triángulo(ArrayList<Punto> puntos) {
        super(3);
        this.p1 = puntos.get(0);
        this.p2 = puntos.get(1);
        this.p3 = puntos.get(2);
    }

    @Override
    protected ArrayList<Linea> crearLíneas() {
        // creamos las tres líneas del triángulo a partir de los puntos
       Linea linea1 = new Linea(p1, p2);
       Linea linea2 = new Linea(p2, p3);
       Linea linea3 = new Linea(p1, p3);
       //las metemos en un arraylist
        ArrayList<Linea> lineas = new ArrayList<>();
        lineas.add(linea1);
        lineas.add(linea2);
        lineas.add(linea3);
        // el método devuelve el arraylist de lineas
        return lineas;
    }

    @Override
    protected double calcularPerímetro() {
        // el perímetro de cualuquier figura geométrica es la suma de sus lados
        // llamamos al método crear líneas para recuperar las líneas del triángulo
        ArrayList<Linea> lineas = crearLíneas();
        // sumamos las líneas que contiene
        double perimetro = lineas.get(0).calcularLongitud() + lineas.get(1).calcularLongitud() + lineas.get(2).calcularLongitud();
        // el método devuelve el perímetro del triángulo
        return perimetro;
    }

    @Override
    protected double calcularÁrea() {
        // el área de un triángulo se puede calcular de muchas formas. Yo voy a utilizar esta:
        // http://serbal.pntic.mec.es/lbac0014/Trigonometria/area.htm#:~:text=El%20%C3%A1rea%20de%20un%20tri%C3%A1ngulo,el%20seno%20del%20%C3%A1ngulo%20comprendido.
        // Y para calcular el seno: https://codigo--java.blogspot.com/2013/06/java-basico-046-funcion-calculando-seno.html (por ejemplo)
        ArrayList<Linea> lineas = crearLíneas();
        double a = lineas.get(0).calcularLongitud();
        double b = lineas.get(1).calcularLongitud();
        double c = lineas.get(2).calcularLongitud();
        double area = (a * b * Math.sin(c)) / 2;
        return area;
    }

    @Override
    public String toString() {
        // Podemos personalizar el método toString() así:
        return "Triángulo: " +
                "\n  * p1=" + p1 +
                "\n  * p2=" + p2 +
                "\n  * p3=" + p3 +
                "\n  Perímetro = " + (Math.round(calcularPerímetro() * 100.0) / 100.0)  + // cómo redondear a dos decimales:
                "\n  Área = " + (Math.round(calcularÁrea() * 100.0) / 100.0) ;  // https://www.delftstack.com/es/howto/java/how-to-round-a-double-to-two-decimal-places-in-java/?utm_content=cmp-true
    }

    @Override
    protected void dibujarFigura() {
        String[][] cuadrante = new String[5][5];
        // coordenada x --> fila
        // coordenada y --> columna
        for (int i = 0; i < cuadrante.length; i++) {
            for (int j = 0; j < cuadrante[i].length; j++) {
                cuadrante[i][j] = " ";
            }
        }
        cuadrante[(int) p1.x][(int) p1.y] = "x";
        cuadrante[(int) p2.x][(int) p2.y] = "x";
        cuadrante[(int) p3.x][(int) p3.y] = "x";
        for (int i = 0; i < cuadrante.length; i++) {
            for (int j = 0; j < cuadrante[i].length; j++) {
                    System.out.print(cuadrante[i][j] + " ");
            }
            System.out.println();
        }
    }
}
