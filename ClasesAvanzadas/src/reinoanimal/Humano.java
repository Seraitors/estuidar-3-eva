package reinoanimal;

public class Humano extends Mamifero{
    // voy a hacer lo mismo que en Gato, pero más rápido


    @Override
    public boolean nadar() {
        return false;
    }

    @Override
    public String saludar() {
        return "hola";
    }



}
