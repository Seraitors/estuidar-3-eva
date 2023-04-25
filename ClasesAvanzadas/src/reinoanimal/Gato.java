package reinoanimal;

public class Gato extends Mascota{
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public boolean sociabiliza() {
        return false;
    }
    // podemos sobreescribir los métodos de la superclase


}
