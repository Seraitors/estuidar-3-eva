package colecciones.EjemploComparator;

import java.time.LocalDate;

public class Socio {


    int idSocio;
    String   nombre;
    LocalDate fNacimiento;

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(LocalDate fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public Socio(int idSocio, String nombre, LocalDate fNacimiento) {
        this.idSocio = idSocio;
        this.nombre = nombre;
        this.fNacimiento = fNacimiento;
    }


    @Override
    public String toString() {
        return  "Socio " + idSocio + ": " + nombre + " (" + fNacimiento + " )";
    }



}
