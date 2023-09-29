public class Producto {
    
    private int id;
    private int cant_litro;
    private double precio;
    private String marca;
    
    public Producto(int id, int cant_litro, double precio, String marca) {
        this.id = id;
        this.cant_litro = cant_litro;
        this.precio = precio;
        this.marca = marca;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCant_litro() {
        return cant_litro;
    }
    public void setCant_litro(int cant_litro) {
        this.cant_litro = cant_litro;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    @Override
    public String toString() {
        return "id: " + id + ", cant_litro: " + cant_litro + ", precio: " + precio + ", marca: " + marca;
    }
}
