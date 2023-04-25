package ficheros;

public class Imagen extends Fichero{
    protected int width;
    protected int height;
    protected byte[] contenido;

    public Imagen(String nombreCompleto, int width, int height, byte[] contenido) {
        super(nombreCompleto);
        this.width = width;
        this.height = height;
        this.contenido = contenido;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public byte[] getContenido() {
        return contenido;
    }

    public void setContenido(byte[] contenido) {
        this.contenido = contenido;
    }

    @Override
    protected String getInfoFichero() {
        return String.format("Imagen: %s, width: %d, height: %d", nombreCompleto, width, height);
    }
}
