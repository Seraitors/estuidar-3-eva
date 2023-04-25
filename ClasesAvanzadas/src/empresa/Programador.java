package empresa;

import java.time.LocalDate;
import java.util.Arrays;

public class Programador extends Empleado{
    private String[] lenguajes;

    public Programador(int añoNacimiento, String dirección, String nombre, String id, LocalDate fechaInicio, Long salario, String[] lenguajes) {
        super(añoNacimiento, dirección, nombre, id, fechaInicio, salario);
        this.lenguajes = lenguajes;
    }

    public String[] getLenguajes() {
        return lenguajes;
    }

    public void setLenguajes(String[] lenguajes) {
        this.lenguajes = lenguajes;
    }

    @Override
    public String toString() {
        String cadena = "Datos del empleado\n" + "* nombre: " + getNombre()
                + "\n* dirección: " + getDirección() + "\n* año de nacimiento: " + getAñoNacimiento()
                + "\n* fecha de inicio: " + getFechaInicio() + "\n* salario: " + getSalario() + " €"
                + "\n* lenguajes: " + Arrays.toString(lenguajes);

        return cadena;
    }

// Escribe un método que permita añadir un lenguaje al programador.
    public void añadirLenguaje(String lenguaje) {
        String[] nuevoArray = new String[lenguajes.length + 1]; // creamos un array nuevo, de tamaño igual al que tenemos ya como atributo, más el lenguaje que añadimos
        // rellenamos las primeras posiciones de este array con las que ya tenemos en el otro
        for (int i = 0; i < lenguajes.length; i++) {
            nuevoArray[i] = lenguajes[i];
        }
        // y en la última posición metemos el string que nos llega por parámetro con este método
        nuevoArray[nuevoArray.length - 1] = lenguaje;
        // por último, asignamos este array nuevo al atributo lenguajes, que también es un array de String
        lenguajes = nuevoArray.clone(); // el método clone() hace una copia del array
    }


}
