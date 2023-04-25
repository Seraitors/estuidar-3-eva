package interfaces;

public class Main {
    public static void main(String[] args) {
        Clase clase = new Clase();
        clase.metodoAbstracto();
        clase.metodoPorDefecto(); // el método por defecto no hace falta sobreescribirlo en la clase que implementa la interfaz; puede ser llamado desde un objeto creado a partir de esa clase
        Interfaz.metodoEstatico(); // los métodos estáticos se invocan con la interfaz, no con un objeto
    }
}
