package PrincipioLisKov;

public class Main {

    public static void main(String[] args) {

        Electronico electronico = new Electronico("Laptop", 1000, 10, "HP", 10.0);
        Ropa ropa = new Ropa("Camiseta", 20, 50, "M");
        Libro libro = new Libro("Mi Libro", 15, 30, "Autor  Anónimo");
        Producto[] productos = {electronico, ropa, libro};

        for (Producto producto : productos) {
            System.out.println("Nombre del Producto: " + producto.getNombre());
            System.out.println("Precio del Producto: " + producto.getPrecio());
           System.out.println("Cantidad Disponible: " + producto.getCantidadDisponible());

            if (producto instanceof Ropa) {
                Ropa ropaProducto = (Ropa) producto;
                System.out.println("Talla: " + ropaProducto.mostrarTalla());
            } else if (producto instanceof Libro) {
                Libro libroProducto = (Libro) producto;
                System.out.println("Autor: " + libroProducto.obtenerAutor());
            } else if (producto instanceof Electronico) {
                Electronico electronicoProducto = (Electronico) producto;
                System.out.println("Marca: " + electronicoProducto.calcularPrecio());
            }

        }
    }

}
