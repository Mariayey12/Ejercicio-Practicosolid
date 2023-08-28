package SegregacionInterface;

public class DiseñadorUI implements  Diseñador{
    private String nombre;
    private double salario;

    public DiseñadorUI(String nombre,double salario  ) {
        this.nombre= nombre;
        this.salario= salario;

    }

    @Override
    public void diseñarInterfaz() {

        System.out.println("Diseñador UI  diseñando Interfaz...");
        System.out.println("Diseñador UI  reviando   Interfaz...");
    }

    @Override
    public void revisarDiseño() {

    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }

    @Override
    public double calcularsalario() {
        return  salario;
    }
}
