package PrincipioOLID;

public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado( double lado) {
        this.lado= lado;

    }
    //@Override
    public  double CalcularArea(){
        return  lado * lado;
    }
}
