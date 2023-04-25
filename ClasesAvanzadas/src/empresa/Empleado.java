package empresa;

import java.time.LocalDate;

public class Empleado extends Persona{
    private LocalDate fechaInicio;
    private Long salario;

    public Empleado(int añoNacimiento, String dirección, String nombre, String id, LocalDate fechaInicio, Long salario) {
        super(añoNacimiento, dirección, nombre, id);
        this.fechaInicio = fechaInicio;
        this.salario = salario;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Long getSalario() {
        return salario;
    }

    public void setSalario(Long salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        String cadena = "Datos del empleado\n" + "* nombre: " + getNombre()
                + "\n* dirección: " + getDirección() + "\n* año de nacimiento: " + getAñoNacimiento()
                + "\n* fecha de inicio: " + fechaInicio + "\n* salario: " + salario + " €";

        return cadena;
    }
}
