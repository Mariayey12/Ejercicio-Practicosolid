package PrincSegregacionInterfaces;

class RevistaImpl implements Revista {
    private String editorial;
    private int numero;
    private boolean prestada;

    public RevistaImpl(String editorial, int numero) {
        this.editorial = editorial;
        this.numero = numero;
        this.prestada = false;
    }

    @Override
    public void prestar() {
        if (!prestada) {
            System.out.println("La revista ha sido prestada.");
            prestada = true;
        } else {
            System.out.println("La revista ya ha sido prestada anteriormente.");
        }
    }


    @Override
    public void devolver() {
        if (prestada) {
            System.out.println("La revista ha sido devuelta.");
            prestada = false;
        } else {
            System.out.println("La revista ya está en la biblioteca.");
        }


    }

    @Override
    public String obtenerInformacion() {
        return "Revista - Editorial: " + editorial + ", Número: " + numero;
    }

    @Override
    public String obtenerEditorial() {
        return editorial;
    }

    @Override
    public int obtenerNumero() {
        return numero;
    }


}


