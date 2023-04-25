package empresa;

import java.time.LocalDate;

public class Manager extends Empleado{
    private boolean sonrisa;

    public Manager(int añoNacimiento, String dirección, String nombre, String id, LocalDate fechaInicio, Long salario, boolean sonrisa) {
        super(añoNacimiento, dirección, nombre, id, fechaInicio, salario);
        this.sonrisa = sonrisa;
    }

    public boolean isSonrisa() {
        return sonrisa;
    }

    public void setSonrisa(boolean sonrisa) {
        this.sonrisa = sonrisa;
    }

    @Override
    public String toString() {
        String cadena = getNombre() + getDirección();
        if (sonrisa) {
            cadena = cadena + " :)";
        } else {
            cadena = cadena + ":(";
        }
        return cadena;
    }
}
