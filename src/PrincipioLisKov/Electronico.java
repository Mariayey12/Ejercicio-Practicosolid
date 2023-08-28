package PrincipioLisKov;

public class Electronico extends  Producto implements ICalculableDescuento {
    private String marca;
    private double porcentajeDescuento;
    private String Hp;
    public Electronico(String nombre, double precio, int cantidadDisponible, String Hp, double porcentajeDescuento) {
        super(nombre, precio, cantidadDisponible);
        this.marca = marca;
        this.porcentajeDescuento=porcentajeDescuento;
        this.Hp=Hp;


    }

    @Override
    public double calcularDescuento() {
        // Simulamos una lógica de cálculo de descuento realista
        if (marca != null && marca.equals("HP")) {
            if (getCantidadDisponible() > 5) {
                return getPrecio() * porcentajeDescuento / 100;
            } else {
                return 0.0;
            }
        } else {
            return 0.0;
        }
    }
    public double calcularPrecio() {
        double descuento = calcularDescuento();
        double precioFinal = getPrecio() - descuento;
        return precioFinal;
    }
}
