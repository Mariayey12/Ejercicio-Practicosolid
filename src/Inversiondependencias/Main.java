package Inversiondependencias;

public class Main {
    public static void main(String[] args) {
        INotificador notificador = new NotificadorEmail();
        Pedido pedido = new Pedido(notificador);
        Producto producto1 = new Producto("Producto 1", 100);
        Producto producto2 = new Producto("Producto 2", 200);
        pedido.agregarProducto(producto1);
        pedido.agregarProducto(producto2);
        pedido.realizarPedido();
    }
}
