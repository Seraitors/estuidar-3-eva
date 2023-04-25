package reinoanimal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Mamifero m = new Mamifero(); // una vez que hemos convertido Mamifero en clase abstracta no podemos instanciarla
        //System.out.println(m.saludar()); // devuelve un String, debemos imprimirlo
        Gato g = new Gato("Garfield", 5);
        //System.out.println(g.saludar());
        Humano h = new Humano();
        //System.out.println(h.saludar());
        // en general si tiene que elegir entre dos métodos, elige el que esté "más próximo" (el más específico)
        // :)
        // si no lo imprimimos malamente vamos a ver nada


        // Crea un arraylist de mamíferos con un mamífero, un gato y un humano. Recórrelo de forma que todos saluden.
        //Mamifero mg = new Gato();
        Mamifero mh = new Humano();
        // necesitamos un arraylist :)
        ArrayList<Mamifero> mamiferos = new ArrayList<>();
        //mamiferos.add(m);
        //mamiferos.add(mg);
        mamiferos.add(mh);
        for (Mamifero elemento: mamiferos) {
            //System.out.println(elemento.saludar());
        }

        // objeto.getClass() -> devuelve un String con la ruta completa de la clase a la que pertenece
        // ejemplo: queremos saber a qué clase pertenece uno de los objetos anteriores
        //System.out.println("mg: " + mg.getClass());
        System.out.println("mh: " + mh.getClass());
        //System.out.println("m: " + m.getClass());
        System.out.println("g: " + g.getClass());
        System.out.println("h: " + h.getClass());

        // objeto instanceof Clase -> es un boolean indicando si el objeto es una instancia de la Clase
        // ejemplo: vamos a preguntar si uno de los anteriores objeto es una instancia de cualquiera de las clases
        System.out.println("mg es una instancia de Gato: ");
        //System.out.print(mg instanceof Gato);
        System.out.println("\nmg es una instancia de Humano: ");
        //System.out.print(mg instanceof Humano);
        System.out.println("\nmg es una instancia de Mamifero: ");
        //System.out.print(mg instanceof Mamifero);
    }
}
