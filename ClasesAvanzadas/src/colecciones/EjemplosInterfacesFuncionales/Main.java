package colecciones.EjemplosInterfacesFuncionales;

import colecciones.EjemploComparator.Socio;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main  {
    public static void main(String[] args) {

        Predicate<Integer> ejemplosPredicado = (año) -> {
            return 1991 <= año && año   <= 1996;

        };

        boolean esMilleian = ejemplosPredicado.test( 1991);
        System.out.println(esMilleian);

        boolean esMilleian2= ejemplosPredicado.test(1992);



        Socio socio1 = new colecciones.EjemploComparator.Socio(1, "valen", LocalDate.of(2001, 2, 10));
        Socio socio2 = new colecciones.EjemploComparator.Socio(2, "Clau", LocalDate.of(2002, 1, 16));
        Socio socio3 = new colecciones.EjemploComparator.Socio(3, "Javier", LocalDate.of(1996, 10, 16));
        Socio socio4 = new colecciones.EjemploComparator.Socio(4, "Victor", LocalDate.of(1997, 5, 10));

        ArrayList<Socio> socios = new ArrayList<>();

        socios.add(socio1);
        socios.add(socio2);
        socios.add(socio3);
        socios.add(socio4);


        socios.removeIf( (Socio socio) ->  socio.getNombre().startsWith("V"));
        for (Socio socio:socios) {
            System.out.println(socio);
        }

        //predicados
        Function<Double, Double > cuadrado = (Double numero )-> { return numero*numero;};
        System.out.printf("%.2f" , cuadrado.apply(2.2));
        System.out.println();

        Function<String,Integer> longitudCedena =cadena -> cadena.length();
        System.out.println(longitudCedena.apply("aitor"));

        // mapa

        Map<String,Integer > mapa=new HashMap<>();
        mapa.put("66666B",LocalDate.of(1991,12,31).getYear());


        mapa.put("perico",50044);
        mapa.put("albacete",544);
        mapa.put("ete",1544);
       // Consumer

        Consumer<String> consumidor = (nombre) ->{
            System.out.println("Buenas tardes , " + nombre);
        };
        Scanner sc = new Scanner(System.in);
        consumidor.accept( sc.nextLine());


        //imprimimos socios
        socios.forEach((socio) ->{
            System.out.println(socio);
        });


        // supplier
        Supplier<Integer> numeroAleatorio=()->{ return (int)(Math.random()*100 ) +1;};

        for (int i = 0; i <5 ; i++) {
            System.out.println(numeroAleatorio.get());

        }


    }
}
