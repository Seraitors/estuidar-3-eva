package interfaces.ejemplometodopordefecto;

interface Mover {
    void pasoAdelante();
    void giraIzquierda();
    void giraDerecha();
    /*

    Ahora, de repente, después de haber hecho lo anterior,
     decides que los personajes deberían poder darse la vuelta. Eso
implica que necesitas añadir el método darseVuelta a la interfaz Mover. Puedes
implementar el método para todas las clases que implementan la interfaz, pero otra
forma es declarar un método default en la interfaz, y así te evitas el tener que
implementarlo clase por clase.
     */

    // puedo escribir eso como método abstracto --> pero eso me obliga a desarrollarlo en la clase, y eso a veces es complicado
    //void darseVuelta();

    // en este caso viene bien un método por defecto: lo declaro sólo en la interfaz,
    // y los objetos de la clase que la implementen podrán utilizarlo
    default void darseVuelta() {
        System.out.println("Soy un método por defecto. Estoy implementado sólo en la interfaz");
    }
}