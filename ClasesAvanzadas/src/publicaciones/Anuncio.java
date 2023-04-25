package publicaciones;

import java.time.LocalDate;

public class Anuncio extends Publicacion{

    LocalDate fechaCaducidad;

    public Anuncio(String texto, String encabezado, LocalDate fechaPublicacion, LocalDate fechaCaducidad) {
        super(texto, encabezado, fechaPublicacion);
        this.fechaCaducidad = fechaCaducidad;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
}
