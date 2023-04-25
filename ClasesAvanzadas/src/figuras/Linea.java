package figuras;

public class Linea {
    public final int DIMENSIONES = 1;
    Punto puntoInicio;
    Punto puntoFin;

    public Linea(Punto puntoInicio, Punto puntoFin) {
        this.puntoInicio = puntoInicio;
        this.puntoFin = puntoFin;
    }

    public double calcularLongitud() {
        double d = Math.sqrt(Math.pow(puntoFin.x- puntoInicio.x , 2)+ Math.pow(puntoFin.y- puntoInicio.y , 2));
        return d;
    }

    @Override
    public String toString() {
        return puntoInicio.toString() + " - " + puntoFin.toString();
    }

    public void dibujarLinea() {
        for (int i = 0; i < calcularLongitud(); i++) {
            System.out.print("*");
        }
    }
}
