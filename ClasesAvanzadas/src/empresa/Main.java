package empresa;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Programador programador = new Programador(1990, "Melancolía s/n", "Currito", "00000005X",LocalDate.now(), 20000L, new String[]{"Java", "Javascript", "Python"});
        programador.setNombre("A. Arenal");
        programador.setAñoNacimiento(1985);
        programador.setDirección("Pobladura del Valle, S/N");
        programador.setFechaInicio(LocalDate.of(2017, 3, 8)); // si queremos poner el día actual escribiríamos LocalDate.now()
        //programador.setFechaInicio(LocalDate.parse("2017-3-8")); // también lo podemos poner así
        String[] lenguajes = {"Java", "JavaScript", "Python"};
        programador.setLenguajes(lenguajes);

        /*System.out.println(programador.getNombre() +
                 " - " + programador.getDirección() +
                 " - " + programador.getAñoNacimiento() +
                " - " + programador.getFechaInicio() +
                " - " + Arrays.toString(programador.getLenguajes()));
*/
        // Creamos un objeto de cada clase e invocamos toString
        Persona p = new Persona(2015, "Leganitos, 5", "Juanita", "00000001X");
        Empleado e = new Empleado(2000, "Fuencisla, 6", "Jaimita","00000002X", LocalDate.of(2022, 9, 1), 30000L);
        Cliente c = new Cliente(1999, "Alcalá 13", "Jorgita",  "00000003X",true, "1-2023"); // OJO QUE EN EL VIDEO ESTÁ DIFERENTE
        Manager m = new Manager(1995, "13 Rue del Percebe", "Gilito", "00000004X",LocalDate.of(2019, 1, 1), 50000L, true);

//        System.out.println(p.toString()); // si no he implementado explícitamente el método toString() no puedo poner sólo el nombre del objeto
//        System.out.println(e);
//        System.out.println(c);
//        System.out.println(m);

        // comprobamos si el método añadirLenguaje funciona
        System.out.println(Arrays.toString(programador.getLenguajes()) + " (lenguajes antes de añadir un lenguaje)");
        programador.añadirLenguaje("Ruby");
        System.out.println(Arrays.toString(programador.getLenguajes()) + " (lenguajes después de añadir un lenguaje)");

        // 3) Realiza una prueba comparando entre sí personas con igual id y con distinto id.
        Persona otraPersona = new Persona(2005, "Calle Cita, 5",  "X", "11111111A");
        Persona otraPersonaMas = new Persona(2008, "Calle Cita, 8", "Z" , "11111111A");
        // ahora vamos a comparar personas
        System.out.println("\n** Comparamos p con otraPersona **");
        System.out.println("¿Son p y otraPersona iguales? " + p.equals(otraPersona));
        System.out.println("\n ** Ahora comparamos dos personas con igual id"); // observa que sólo tienen igual el id
        System.out.println("¿Son otraPersona y otraPersonamas la misma persona? " + otraPersona.equals(otraPersonaMas));
    }
    
}
