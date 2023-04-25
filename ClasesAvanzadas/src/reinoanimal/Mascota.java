package reinoanimal;

/**
 * ejemplo de los apuntes
 */
public abstract class Mascota {
    protected String nombre;
    protected int edad;

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract boolean sociabiliza();
}
