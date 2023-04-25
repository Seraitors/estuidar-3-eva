package aparatos;

public class Aparato implements Funcionalidad{
    protected String serialNumber;
    protected boolean on;

    public Aparato(String serialNumber) { // el constructor no recibe el atributo on porque por defecto está false (apagado)
        this.serialNumber = serialNumber;
    }

    protected void encender(boolean on) { // esto en realidad es un setter del atributo on
        this.on = on;
    }

    @Override
    public void on() { // estamos obligados a poner aquí como mínimo esto, porque son métodos abstractos en la interfaz

    }

    @Override
    public void off() {

    }
}
