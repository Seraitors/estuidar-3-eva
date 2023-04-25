package mitologia;

public class Main {
    public static void main(String[] args) {
        // hacemos lo de antes
        AnimalMitologico a = new AnimalMitologico();
        AnimalMitologico q = new Quimera();
        AnimalMitologico d = new Dragon();

        // creamos un array y guardamos en él estos objetos
        AnimalMitologico[] animalMitologicos = new AnimalMitologico[3];
        animalMitologicos[0] = a;
        animalMitologicos[1] = q;
        animalMitologicos[2] = d;

        for (AnimalMitologico elemento: animalMitologicos) {
            elemento.hola();
        }
    }
}
