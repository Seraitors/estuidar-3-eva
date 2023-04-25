package interfaces.ejemplometodopordefecto;

public class Batman implements Mover{
    @Override
    public void pasoAdelante() {
        System.out.println("Paso adelante");
    }

    @Override
    public void giraIzquierda() {
        System.out.println("Gira izquierda");
    }

    @Override
    public void giraDerecha() {
        System.out.println("Gira derecha");
    }
}
