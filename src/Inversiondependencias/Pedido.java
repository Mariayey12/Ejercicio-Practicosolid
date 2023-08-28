package Inversiondependencias;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Producto> productos;
    private INotificador notificador; // Inyección de dependencias

    public Pedido(INotificador notificador) {
        this.productos = new ArrayList<>();
        this.notificador = notificador;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void realizarPedido() {
        try {
            // Lógica para realizar el pedido

            System.out.println("Procesando el pedido...");

            // Calcular el total del pedido
            double total = calcularTotal();
            System.out.println("Total del pedido: " + total);

            // Simulamos que el pedido se ha realizado y actualizado el estado

            // Enviar notificación al realizar el pedido
            String mensaje = "¡Tu pedido ha sido realizado! Total: " + total;
            notificador.enviarNotificacion(mensaje);

        } catch (Exception e) {
            System.out.println("Error al procesar el pedido: " + e.getMessage());
        }
    }
}
