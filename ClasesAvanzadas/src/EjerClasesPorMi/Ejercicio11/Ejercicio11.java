package EjerClasesPorMi.Ejercicio11;

public class Ejercicio11 implements Interfaces {
        int a ;
    @Override
    public boolean esmayor(Object b) {
        if (b instanceof Integer ){
            if (a > ( int) b ){
                return  true;
            }

        }
        return false;
    }

    @Override
    public boolean esmmenor(Object b) {
        if (b instanceof Integer ){
            if (a < ( int) b ){
                return  true;
            }
        }else {
            System.out.println("Esto que has metido esta mal");
        }

        return false;
    }

    @Override
    public boolean esigual(Object b) {
        if (b instanceof Integer ){
            if (a == ( int) b ){
                return  true;
            }
        }
        return false;
    }
}
