package empresa;

public class Persona {
    private int añoNacimiento;
    private String dirección;
    private String nombre;

    private String id;

    public Persona(int añoNacimiento, String dirección, String nombre, String id) {
        this.añoNacimiento = añoNacimiento;
        this.dirección = dirección;
        this.nombre = nombre;
        this.id = id;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /*
    2) Sobreescribe el método equals() de la clase Object para que cuando queramos comparar personas lo que hagamos realmente sea comparar sus atributos id
     */

    @Override
    public boolean equals(Object obj) {
        // el método equals de Object recibe genéricamente un Object (cualquier objeto), pero nosotros vamos a trabajar
        // solamente con el tipo persona; la persona que recibiremos será otra diferente a la de "this" (este) objeto
        Persona otraPersona = (Persona) obj;
        boolean iguales;
        if (this.id.equals(otraPersona.id)) { // aquí comparamos el id de esta persona con el de la persona introducida por parámetro
            iguales = true; // si las dos personas tienen el mismo id, consideramos que son la misma persona
        } else {
            iguales = false;
        }
        return iguales;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "añoNacimiento=" + añoNacimiento +
                ", dirección='" + dirección + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
