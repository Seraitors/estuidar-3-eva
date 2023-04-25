package EjerClasesPorMi.ejercicio12;

public class Libros  extends  Publicacion implements  Prestable{

    public  boolean prestado;


    public Libros(String titulo, String codigo, int añoPublicacion) {
        super(titulo, codigo, añoPublicacion);
        this.prestado=false;
    }






    public  boolean estaprestado(){


        return prestado;
    }

    public  void prestar (){
        prestado=true;
    }

    @Override
    public void prestado() {

    }

    public  void devolver(){
        prestado=false;
    }

    public  int añoPublicaccion(){

        return  añoPublicaccion();
    }



    public  String codigo(){
        return codigo;
    }



    @Override
    public String toString() {
        return "Libros{" +
                "prestado=" + prestado +
                ", titulo='" + titulo + '\'' +
                ", codigo='" + codigo + '\'' +
                ", añoPublicacion=" + añoPublicacion +
                '}';
    }
}
