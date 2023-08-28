package PrincipioLisKov;

public class Ropa extends Producto {
    private String talla;
    public Ropa(String nombre, double precio, int cantidadDisponible, String talla) {
        super(nombre, precio, cantidadDisponible);
    }
    public String mostrarTalla() {
        return talla;
    }
}
