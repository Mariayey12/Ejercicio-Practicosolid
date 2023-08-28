package PrincSegregacionInterfaces;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de los recursos bibliotecarios
        Libro libro = new LibroImpl("Autor del Libro", "123456789");
        Revista revista = new RevistaImpl("Editorial de la Revista", 5);
        AudioLibro audioLibro = new AudioLibroImpl("Narrador del AudioLibro", 120);

        // Realizar operaciones en los recursos
        libro.prestar();
        revista.devolver();
        audioLibro.prestar();

        // Obtener información de los recursos
        System.out.println("Información del Libro: " + libro.obtenerInformacion());
        System.out.println("Información de la Revista: " + revista.obtenerInformacion());
        System.out.println("Información del AudioLibro: " + audioLibro.obtenerInformacion());

        // Obtener detalles específicos de cada tipo de recurso
        if (libro instanceof Libro) {
            Libro libroRec = (Libro) libro;
            System.out.println("Autor del Libro: " + libroRec.obtenerAutor());
        }

        if (revista instanceof Revista) {
            Revista revistaRec = (Revista) revista;
            System.out.println("Editorial de la Revista: " + revistaRec.obtenerEditorial());
        }

        if (audioLibro instanceof AudioLibro) {
            AudioLibro audioLibroRec = (AudioLibro) audioLibro;
            System.out.println("Narrador del AudioLibro: " + audioLibroRec.obtenerNarrador());
        }
    }
}

