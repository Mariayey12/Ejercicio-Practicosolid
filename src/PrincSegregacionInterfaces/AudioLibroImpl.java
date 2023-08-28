package PrincSegregacionInterfaces;

class AudioLibroImpl  implements AudioLibro {
    private String narrador;
    private int duracion;
    private boolean prestado;

    public AudioLibroImpl(String narrador, int duracion) {
        this.narrador = narrador;
        this.duracion = duracion;
        this.prestado = false;
    }
    @Override
    public String obtenerNarrador() {
        return narrador;
    }

    @Override
    public int obtenerDuracion() {
        return duracion;
    }

    @Override
    public void prestar() {

        if (!prestado) {
            System.out.println("El audiolibro ha sido prestado.");
            prestado = true;
        } else {
            System.out.println("El audiolibro ya ha sido prestado anteriormente.");
        }

    }

    @Override
    public void devolver() {
        if (prestado) {
            System.out.println("El audiolibro ha sido devuelto.");
            prestado = false;
        } else {
            System.out.println("El audiolibro ya está en la biblioteca.");
        }

    }

    @Override
    public String obtenerInformacion() {
        return "AudioLibro - Narrador: " + narrador + ", Duración: " + duracion + " minutos";
    }


}