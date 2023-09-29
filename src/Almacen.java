import java.util.LinkedList;
import java.util.Scanner;

public class Almacen {

    private LinkedList<Estanteria> estanterias;

    public Almacen() {
        this.estanterias = new LinkedList<Estanteria>();
    }

    public LinkedList<Estanteria> getEstanterias() {
        return estanterias;
    }

    public void setEstanterias(LinkedList<Estanteria> estanterias) {
        this.estanterias = estanterias;
    }

    @Override
    public String toString() {
        return "Almacen [estanterias=" + estanterias + "]";
    }

    public void agregrarEstanteria(Estanteria e) {
        estanterias.add(e);
    }

    public int tamanoProducto(int i){
        return estanterias.get(i).getProductos().size();
    }
    /*
     * Calcular el precio de todas las bebidas: calcula el precio total de todos los
     * productos del almacén.
     */
    public double precioTotal() {
        double preTo = 0;
        for (int i = 0; i < estanterias.size(); i++) {
            for (int j = 0; j < tamanoProducto(i); j++) {
                preTo += estanterias.get(i).getProductos().get(j).getPrecio();
            }
        }
        return preTo;
    }

    /*
     * Calcular el precio total de una marca de bebida: dada una marca, calcular el
     * precio total de esas bebidas.
     */
    public double precioMarca(String marca) {
        double preMa = 0;
        for (int i = 0; i < estanterias.size(); i++) {
            for (int j = 0; j < tamanoProducto(i); j++) {
                if (estanterias.get(i).getProductos().get(j).getMarca().equals(marca))
                    preMa += estanterias.get(i).getProductos().get(j).getPrecio();
            }
        }
        return preMa;
    }

    /*
     * Calcular el precio total de una estantería: dado un id de estantería,
     * calcular el precio total de esas bebidas.
     */
    public double precioEstanteria(int id_Estanteria) {
        double preEst = 0;
        for (int i = 0; i < estanterias.size(); i++) {
            if (estanterias.get(i).getId() == id_Estanteria) {
                for (int j = 0; j < tamanoProducto(id_Estanteria); j++) {
                    preEst += estanterias.get(id_Estanteria).getProductos().get(j).getPrecio();
                }
            }
        }
        return preEst;
    }

    /*
     * Agregar producto: pide el id de la estantería en la que se agrega, y si hay
     * capacidad se añade.
     */
    public void agregarProducto(Producto p) {
        Scanner numeros = new Scanner(System.in);
        System.out.println("Introduce el id de la estanteria: ");
        int id = numeros.nextInt();

        for (int i = 0; i < estanterias.size(); i++) {
            if (estanterias.get(i).getId() == id) {
                estanterias.get(id).addProducto(p);
                System.out.println("Producto " + p.getId() + " añadido correctamente");
            }
        }
    }

    /*
     * Eliminar un producto: dado un id de producto, comprobar que existe y
     * eliminarlo del almacén.
     */
    public void removeProducto(int id) {
        boolean existe = false;
        int i = 0;
        while (i < tamanoProducto(i) && !existe) {
            if (estanterias.get(i).getProductos().get(i).getId() == id) {
                estanterias.get(i).removeProducto(estanterias.get(i).getProductos().get(id));
                existe = true;
                System.out.println("Producto " + id + " eliminado correctamente");
            } else
                i++;
            if (!existe)
                System.out.println("El producto no existe");
        }
    }

    /* Mostrar información: mostrar para cada bebida toda su información */
    public void imprimir() {
        for (int i = 0; i < estanterias.size(); i++) {
            for (int j = 0; j < tamanoProducto(i); j++) {
                System.out.println(estanterias.get(i).getProductos().get(j).toString());
            }
        }
    }
}
