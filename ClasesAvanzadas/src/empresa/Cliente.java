package empresa;

public class Cliente extends Persona{
    private boolean gold;
    private String idContrato;

    public Cliente(int añoNacimiento, String dirección, String nombre, String id, boolean gold, String idContrato) {
        super(añoNacimiento, dirección, nombre, id);
        this.gold = gold;
        this.idContrato = idContrato;
    }

    public boolean isGold() {
        return gold;
    }

    public void setGold(boolean gold) {
        this.gold = gold;
    }

    public String getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(String idContrato) {
        this.idContrato = idContrato;
    }

    @Override
    public String toString() {
        String cadena = "Datos del empleado\n" + "* nombre: " + getNombre()
                + "\n* dirección: " + getDirección() + "\n* año de nacimiento: " + getAñoNacimiento();
        // si tiene tarjeta oro lo ponemos
        String tieneGold; // OJO, QUE ESTO EN EL VIDEO ESTÁ MAL
        if (gold==true) {
            tieneGold = "\n: Tarjeta Oro: SÍ";
        } else {
            tieneGold = "\n: Tarjeta Oro: NO";
        }
        cadena = cadena +  tieneGold +
              "\n* Nº de contrato: " + idContrato;

        return cadena;
    }
}
