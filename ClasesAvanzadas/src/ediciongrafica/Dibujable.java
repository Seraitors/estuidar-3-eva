package ediciongrafica;

public interface Dibujable {

    // métodos abstractos (en el caso de las interfaces no hace falta
    // poner la palabra clave abstract)
    public void dibujarRecta();

    public void dibujarCurva();

    public void dibujarLibre();
}
