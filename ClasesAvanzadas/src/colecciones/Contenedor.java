package colecciones;

public class Contenedor <T>{//T= cualquier tipo de dato

    private  T  objeto;


    public Contenedor( ) {

    }


    // hago un seter a mi manera


    public  void  guardan (T objeto){

        this.objeto =objeto;
    }


    // hago un getter
    public  T extraer (){
        return  objeto;
    }



}
