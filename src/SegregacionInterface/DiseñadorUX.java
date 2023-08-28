package SegregacionInterface;

public class DiseñadorUX implements  Diseñador{
    private String nombre;
    private double salario;

    public DiseñadorUX( String nombre, double salario ) {
        this.nombre=nombre;
        this.salario=salario;
        
    }

    @Override
    public void diseñarInterfaz() {


    }

    @Override
    public void revisarDiseño() {

    }

    @Override
    public String obtenerNombre() {
        return null;
    }

    @Override
    public double calcularsalario() {
        return 0;
    }
}
