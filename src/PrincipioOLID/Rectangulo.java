package PrincipioOLID;

import PrincipioOLID.Figura;

public class Rectangulo extends Figura {
    private double ancho;
    private double altura;

    public Rectangulo(double ancho, double altura ) {
        this.ancho=ancho;
        this.altura=altura;

    }

    @Override
    public double calcularArea (){

        return ancho * altura;
    }


}
