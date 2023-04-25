package aparatos;

public class Kettle extends Aparato{
    protected double capacidad;

    public Kettle(String serialNumber, double capacidad) {
        super(serialNumber);
        this.capacidad = capacidad;
    }

    // es en este nivel donde queremos (arbitrariamente, podría haber sido también en la superclase)
    // desarrollar los métodos de la interfaz, así que los sobreescribimos desde la superclase

    @Override
    public void on() {
        encender(true); // el método encender lo heredamos implícitamente de Aparato
    }

    @Override
    public void off() {
        encender(false);
    }
}
