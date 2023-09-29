import java.util.LinkedList;

public class Estanteria {

    private int id;
    private int capacidad;
    private LinkedList<Producto> productos;

    public Estanteria(int id, int capacidad) {
        this.id = id;
        this.productos = new LinkedList<Producto>();
        this.capacidad = capacidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LinkedList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(LinkedList<Producto> productos) {
        this.productos = productos;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void addProducto(Producto p) {
        if (productos.size() < capacidad)
            productos.add(p);
    }

    public void removeProducto(Producto p) {
        productos.remove(p);
    }

    @Override
    public String toString() {
        return "Estanteria [id=" + id + ", productos=" + productos + "]";
    }

}
