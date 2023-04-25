package ficheros;

public class Fichero {
    protected String nombreCompleto;

    public Fichero(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void imprimeInfoFichero() {
        String info = this.getInfoFichero();
    }

    protected String getInfoFichero() {
        return "Fichero: " + nombreCompleto;
    }
}
