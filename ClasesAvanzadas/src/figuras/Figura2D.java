package figuras;

import java.util.ArrayList;

public abstract class Figura2D {
    public final int DIMENSIONES = 2; // es una constante
    int lados;

    public Figura2D(int lados) {
        this.lados = lados;
    }

    public String nombreFigura() {
        return null;
    }

    protected abstract ArrayList<Linea> crearLíneas();

    protected abstract double calcularPerímetro();

    protected abstract double calcularÁrea();

    // este no está en el diagrama, pero why not
    protected abstract void dibujarFigura();
}
