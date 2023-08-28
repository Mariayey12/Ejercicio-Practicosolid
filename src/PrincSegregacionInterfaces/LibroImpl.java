package PrincSegregacionInterfaces;

class LibroImpl implements Libro {
    private String autor;
    private String isbn;
    private boolean prestado;

    public LibroImpl(String autor, String isbn) {
        this.autor = autor;
        this.isbn = isbn;
        this.prestado = false;
    }

    @Override
    public String obtenerAutor() {
        return autor;
    }

    @Override
    public String obtenerISBN() {
        return isbn;
    }

    @Override
    public void prestar() {
        if (!prestado) {
            System.out.println("El libro ha sido prestado.");
            prestado = true;
        } else {
            System.out.println("El libro ya ha sido prestado anteriormente.");
        }
    }

    @Override
    public void devolver() {
        if (prestado) {
            System.out.println("El libro ha sido devuelto.");
            prestado = false;
        } else {
            System.out.println("El libro ya está en la biblioteca.");
        }
    }

    @Override
    public String obtenerInformacion() {
        return "Libro - Autor: " + autor + ", ISBN: " + isbn;
    }


}


