package interfaces;

public interface Interfaz {
//    Una interfaz puede contener:
//            • Constantes (public static final); son implícitamente public, final,
//    y static, y deben inicializarse. Por lo tanto, son esencialmente constantes.
    int CONSTANTE = 0;

//• Métodos abstractos sin implementación (aquí la palabra clave abstract no es
//            necesaria). Se indica solamente la signatura.
    public abstract void metodoAbstracto();

//• Métodos por defecto (con implementación) llevan la palabra clave default.
    public default void metodoPorDefecto() {
        System.out.println("Soy un método por defecto. Sirvo para ampliar la funcionalidad de futuras clases.");
        System.out.println("Llamada al método privado: ");
        metodoPrivado();
    }

//            • Métodos privados con implementación (llevan la palabra clave private). Si no pones private no te deja
    private void metodoPrivado() {
        System.out.println("Soy un método privado. Sirvo, normalmente, para ser llamado desde otro método y así" +
                "mejorar la legibilidad del código.");
    }
//            • Métodos estáticos con implementación (llevan la palabra clave static).
    public static void metodoEstatico() {
        System.out.println("Soy un método estático. No soy llamado desde un objeto, sino con el nombre de la interfaz");


    }
}
