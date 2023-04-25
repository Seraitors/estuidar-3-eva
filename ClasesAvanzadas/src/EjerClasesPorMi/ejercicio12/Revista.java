package EjerClasesPorMi.ejercicio12;

public class Revista extends  Publicacion{


    private  int numero;

    public Revista(String titulo, String codigo, int añoPublicacion, int numero) {
        super(titulo, codigo, añoPublicacion);
        this.numero=numero;
    }

    public int getNumero() {
        return numero;
    }


    public  int añoPublicacion(){

        return añoPublicacion();
    }


    public  String codigo(){
        return codigo;
    }


    @Override
    public String toString() {
        return "Revista{" +
                "numero=" + numero +
                ", titulo='" + titulo + '\'' +
                ", codigo='" + codigo + '\'' +
                ", añoPublicacion=" + añoPublicacion +
                '}';
    }
}
