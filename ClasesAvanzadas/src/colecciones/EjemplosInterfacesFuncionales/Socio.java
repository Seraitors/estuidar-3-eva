package colecciones.EjemplosInterfacesFuncionales;

import java.time.LocalDate;

public class Socio {


    int idSocio;
    String nombre;
    LocalDate dNacimiento;


    public Socio(int idSocio, String nombre, LocalDate dNacimiento) {
        this.idSocio = idSocio;
        this.nombre = nombre;
        this.dNacimiento = dNacimiento;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "idSocio=" + idSocio +
                ", nombre='" + nombre + '\'' +
                ", dNacimiento=" + dNacimiento +
                '}';
    }
}
