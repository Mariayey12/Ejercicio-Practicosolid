package PrincipioLisKov;
// Clase derivada Libro
public class Libro extends Producto{
    private String autor;
    public Libro(String nombre, double precio, int cantidadDisponible, String s) {
        super(nombre, precio, cantidadDisponible);
    }

    public String obtenerAutor() {
        return autor;
    }
}
