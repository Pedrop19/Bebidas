public class Agua_mineral extends Producto {

    private String origen;

    public Agua_mineral(int id, int cant_litro, double precio, String marca,
            String origen) {
        super(id, cant_litro, precio, marca);
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    @Override
    public String toString() {
        return "agua_mineral [" + super.toString() + ", origen: " + origen + "]";
    }

}
