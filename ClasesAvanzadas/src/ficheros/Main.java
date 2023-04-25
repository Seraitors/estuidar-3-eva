package ficheros;

public class Main {
    public static void main(String[] args) {
        // creamos un objeto de tipo fichero y un objeto de tipo imagen
        Fichero fichero = new Fichero("Main.java");
        Imagen imagen = new Imagen("foto.jpg", 400, 600, new byte[]{100});
        System.out.println(fichero.getInfoFichero());
        System.out.println(imagen.getInfoFichero());
    }
}
