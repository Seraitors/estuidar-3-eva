package ediciongrafica;

public class Lapiz extends Herramienta implements Dibujable{
    public Lapiz(int grosor, String color) {
        super(grosor, color);
    }

    public void dibujarRecta() {
        System.out.println("dibujando una recta con el lápiz");
    }

    public void dibujarCurva() {
        System.out.println("dibujando una curva con el lápiz");
    }

    public void dibujarLibre() {
        System.out.println("dibujo libre con el lápiz");
    }
}
