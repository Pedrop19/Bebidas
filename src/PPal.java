import java.util.LinkedList;

public class PPal {
    public static void main(String[] args) {

        //BEBIDAS
        Agua_mineral agua_mineral_01 = new Agua_mineral(0, 1, 20, "Fontvella", "Su casa");
        Agua_mineral agua_mineral_02 = new Agua_mineral(1, 2, 2, "Aquabona", "Tenerife");
        Bebida_azucarada bebida_azucarada_01 = new Bebida_azucarada(0, 2, 5, "Coca Cola", 5, false);
        Bebida_azucarada bebida_azucarada_02 = new Bebida_azucarada(1, 2, 2, "Fanta", 5, true);
        Bebida_azucarada bebida_azucarada_03 = new Bebida_azucarada(2, 2, 2, "Fanta Limón", 5, true);
        Bebida_azucarada bebida_azucarada_04 = new Bebida_azucarada(3, 1, 3, "Fanta", 5, true);

        //ESTANTERIAS
        Estanteria estanteria_01 = new Estanteria(0, 20);
        Estanteria estanteria_02 = new Estanteria(1, 20);

        //ALMACENES
        Almacen almacen_01 = new Almacen();

        //PRUEBAS
        estanteria_01.addProducto(agua_mineral_01);
        estanteria_02.addProducto(agua_mineral_02);
        estanteria_01.addProducto(bebida_azucarada_01);
        estanteria_02.addProducto(bebida_azucarada_02);
        estanteria_01.addProducto(bebida_azucarada_03);
        almacen_01.agregrarEstanteria(estanteria_01);
        almacen_01.agregrarEstanteria(estanteria_02);
        System.out.println("PRECIO ESTANTERIA");
        System.out.println(almacen_01.precioEstanteria(0));
        System.out.println("PRECIO MARCA");
        System.out.println(almacen_01.precioMarca("Fanta"));    
        almacen_01.agregarProducto(bebida_azucarada_04);
        System.out.println("PRECIO TOTAL");
        System.out.println(almacen_01.precioTotal());
        almacen_01.imprimir();
        almacen_01.removeProducto(3);
    }
}
