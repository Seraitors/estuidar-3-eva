package EjemplosLambda;

public class EjemplosLanmba {
    public static void main(String[] args) {

        EjemplosLanmba ejemplosLanmba = new EjemplosLanmba();
        ejemplosLanmba .ejemplo1(12);
        Valida v1= n -> n % 2 !=0;

        System.out.println(v1.esImpar(5));

        DevuelvePo dp= () -> Math.PI;
    };


    public boolean ejemplo1(int n ){
        return  n %2 ==0;
    }
   // lo mismo perodiferente n -> n % 2 != 0;
    public boolean ejemplo2(Character c) {
        return c == 'y';
    }
    public double ejemplo3(double x, double y) {
        return x + y;
    }
    public int ejemplo4(int a, int b) {
        return a * a + b * b;
    }
    public int ejemplo5() {
        return 42;
    }
    public double ejemplo6() {
        return Math.PI;
    }

    public void ejemplo7(String s) {
        System.out.println(s);
    }
    public void ejemplo8() {
        System.out.println("Hola, mundo.");
    }




}
