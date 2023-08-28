package PrincipioLisKov;
// Clase base Producto
public class Producto {
    private String nombre;
    private double precio;
    private int cantidadDisponible;

    public Producto( String nombre, double precio, int cantidadDisponible) {

        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

 public void AgregarAlCarrito(){
     // Implementación para agregar al carrito

     if (cantidadDisponible > 0) {
         System.out.println("Agregado al carrito: " + nombre);
         cantidadDisponible--;
     } else {
         System.out.println("No hay suficiente stock de " + nombre + " disponible.");
     }
 }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }
}








