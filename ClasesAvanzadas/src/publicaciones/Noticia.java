package publicaciones;

import java.time.LocalDate;

public class Noticia extends Publicacion{
    private String fuente;


    public Noticia(String texto, String encabezado, LocalDate fechaPublicacion, String fuente) {
        super(texto, encabezado, fechaPublicacion);
        this.fuente = fuente;
    }
}
