package aparatos;

public class Main {
    public static void main(String[] args) {
        Kettle kettle = new Kettle("0X234fg", 1.5);
        kettle.on();
        System.out.println("La tetera está encendida: " + kettle.on);
        kettle.off();
        System.out.println("La tetera está encendida: " + kettle.on);
    }
}
