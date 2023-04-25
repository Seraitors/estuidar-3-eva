package ediciongrafica;

public class Pincel extends Herramienta implements Dibujable{
    public Pincel(int grosor, String color) {
        super(grosor, color);
    }

    // tiene los mismos métodos
    public void dibujarRecta() {
        System.out.println("dibujando una recta con el pincel");
    }

    public void dibujarCurva() {
        System.out.println("dibujando una curva con el pincel");
    }

    public void dibujarLibre() {
        System.out.println("dibujo libre con el pincel");
    }
}
