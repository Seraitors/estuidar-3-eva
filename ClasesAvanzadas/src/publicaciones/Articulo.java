package publicaciones;

import java.time.LocalDate;

public class Articulo extends Publicacion{
    private String autor;

    public Articulo(String texto, String encabezado, LocalDate fechaPublicacion, String autor) {
        super(texto, encabezado, fechaPublicacion);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
