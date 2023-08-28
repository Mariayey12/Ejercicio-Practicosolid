package Inversiondependencias;

import Inversiondependencias.INotificador;

class NotificadorEmail implements INotificador {
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando notificación por correo electrónico: " + mensaje);

        // Simulación de la lógica de envío de correo electrónico
        System.out.println("Correo electrónico enviado a: destinatario@example.com");
        System.out.println("Asunto: Notificación de pedido");
        System.out.println("Mensaje: " + mensaje);
        System.out.println("---- Correo electrónico enviado ----");
    }
}
