package figuras;

import java.util.ArrayList;

public class Rectángulo extends Figura2D{
    Punto p1;
    Punto p2;
    Punto p3;
    Punto p4;

    public Rectángulo(Punto p1, Punto p2, Punto p3, Punto p4) {
        super(4);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    @Override
    protected ArrayList<Linea> crearLíneas() {
        // creamos las cuatro líneas del triángulo a partir de los puntos
        Linea linea1 = new Linea(p1, p2);
        Linea linea2 = new Linea(p2, p3);
        Linea linea3 = new Linea(p1, p3);
        Linea linea4 = new Linea(p1, p3);
        // las metemos en un arraylist
        ArrayList<Linea> lineas = new ArrayList<>();
        lineas.add(linea1);
        lineas.add(linea2);
        lineas.add(linea3);
        lineas.add(linea4);
        // el método devuelve el arraylist de lineas
        return lineas;
    }

    @Override
    protected double calcularPerímetro() {
        // el perímetro de cualuquier figura geométrica es la suma de sus lados
        // llamamos al método crear líneas para recuperar las líneas del rectángulo
        ArrayList<Linea> lineas = crearLíneas();
        // sumamos las líneas que contiene
        double perimetro = 0;
        for (int i = 0; i < lineas.size(); i++) {
            perimetro += lineas.get(i).calcularLongitud();
        }
        // el método devuelve el perímetro del triángulo
        return perimetro;
    }

    @Override
    protected double calcularÁrea() {
        // en realidad habría que comprobar que los cuatro puntos forman un rectángulo; aquí vamos a suponer que es así
        // los lados tienen que ser iguales 2 a 2
        ArrayList<Linea> lineas = crearLíneas();
        double base = lineas.get(0).calcularLongitud(); // podemos coger, por ejemplo, la primera línea como base
        // tenemos que buscar la otra línea de distinta longitud, y esa será la altura
        double altura = 0;
        for (int i = 1; i < lineas.size(); i++) {
            if (lineas.get(i).calcularLongitud() != base) {
                altura = lineas.get(i).calcularLongitud();
            }
        }
        double area = base * altura;
        return area;
    }

    @Override
    public String toString() {
        // Podemos personalizar el método toString() así:
        return "Rectángulo: " +
                "\n  * p1=" + p1 +
                "\n  * p2=" + p2 +
                "\n  * p3=" + p3 +
                "\n  * p4=" + p4 +
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
        cuadrante[(int) p4.x][(int) p4.y] = "x";
        for (int i = 0; i < cuadrante.length; i++) {
            for (int j = 0; j < cuadrante[i].length; j++) {
                System.out.print(cuadrante[i][j] + " ");
            }
            System.out.println();
        }
    }
}
