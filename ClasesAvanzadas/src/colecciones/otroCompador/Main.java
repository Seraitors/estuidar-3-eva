package colecciones.otroCompador;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Socio socio1 = new Socio(1, "valen", LocalDate.of(2001, 2, 10));
        Socio socio2 = new Socio(2, "Clau", LocalDate.of(2002, 1, 16));
        Socio socio3 = new Socio(3, "Javier", LocalDate.of(1996, 10, 16));
        Socio socio4 = new Socio(4, "Victor", LocalDate.of(1997, 5, 10));

        ArrayList<Socio> socios = new ArrayList<>();

        socios.add(socio1);
        socios.add(socio2);
        socios.add(socio3);
        socios.add(socio4);

        System.out.println("segun entran en el arralist");
        imprimirsocios(socios);




        Comparator  comparafechaN= new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Socio socio11 = (Socio) o1;
                Socio socio22 = (Socio) o2;
                if (socio11.fNacimiento.isBefore(socio22.fNacimiento)){
                    return 0;
                }else {
                    return 0;
                }





            }
        };





    }


    public static  void imprimirsocios(ArrayList<Socio> socios){
        for (Socio elemento: socios) {
            System.out.println(elemento);
        }
    }



}

