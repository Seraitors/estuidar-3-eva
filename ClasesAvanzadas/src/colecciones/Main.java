package colecciones;

public class Main {

    public static void main(String[] args) {
        Contenedor<Integer> numero =new Contenedor<>();
        numero.guardan(123);

        System.out.println(numero.extraer());

        // creamos un contenedor para guardar un String



        Contenedor<String> texto = new Contenedor<>();


        texto.guardan("hola");


        System.out.println(texto.extraer());
    }
}
