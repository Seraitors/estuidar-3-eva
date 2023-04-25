package EjemplosStream;

import java.time.LocalDate;

public class Transaccion {
    private  int idTransacion;
    private  String nombre;
    private LocalDate fecha;
    private  double precio;
        private  String ciudad;

    public Transaccion(int idTransacion, String nombre, LocalDate fecha, double precio, String ciudad) {
        this.idTransacion = idTransacion;
        this.nombre = nombre;
        this.fecha = fecha;
        this.precio = precio;
        this.ciudad = ciudad;
    }

    public int getIdTransacion() {
        return idTransacion;
    }

    public void setIdTransacion(int idTransacion) {
        this.idTransacion = idTransacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Transaccion{" +
                "idTransacion=" + idTransacion +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", precio=" + precio +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
