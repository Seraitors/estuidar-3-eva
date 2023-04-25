package sobrecarga;

public class Main {
    public static void main(String[] args) {
        // creamos un objeto de cada y llamamos a los métodos
        Superclase sc = new Superclase();
        System.out.println("** Llamamos al método de la superclase**");
        sc.método();
        Subclase sub = new Subclase();
        System.out.println("** Llamamos al método sobreescrito en la subclase **");
        sub.método();
        System.out.println("** Llamamos al método sobrecargado en la subclase **");
        sub.método("Este soy yo ");
    }
}
