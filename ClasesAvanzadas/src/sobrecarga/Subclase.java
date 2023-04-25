package sobrecarga;

public class Subclase extends Superclase{
    // sobreescribimos el método


    @Override
    public void método() {
       // super.método();
        System.out.println("Subclase: el método se sobreescribe");
    }

    // ahora lo sobrecargamos --> mismo nombre pero metemos un parámetro
    public void método(String s) {
        // super.método();
        System.out.println(s + " - método sobrecargamos");
    }
}
