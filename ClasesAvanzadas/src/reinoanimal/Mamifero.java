package reinoanimal;

/**
 * Vamos a hacer Mamifero clase abstracta
 */
abstract class Mamifero {

    // métodos abstractos:
    public abstract boolean nadar();

    // métodos no abstractos:
    public String saludar() {
        return "el mamífero te saluda";
    }

    // voy a crear un método que no pueda sobreescribirse en ninguna de las clases hijas
    public final void saludarSecretamente() {
        System.out.println("Hola. Sssshhhhh");
    }
}

