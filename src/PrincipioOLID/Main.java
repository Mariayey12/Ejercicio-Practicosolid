package PrincipioOLID;

import PrincipioOLID.Cuadrado;
import PrincipioOLID.GetorFigura;

public class Main {
     public static void main(String[] args) {
         Rectangulo rectangulo = new Rectangulo( 5, 10 );
         Cuadrado cuadrado= new Cuadrado(5);
         GetorFigura getorFigura = new GetorFigura();

         double areaRectangulo = getorFigura.obtenerAreafigura(rectangulo);
         double areaCuadrado = getorFigura.obtenerAreafigura(cuadrado);
         System.out.println("El area del rectangulo es:" + areaRectangulo);
         System.out.println("El area del cuadrado es:" + areaCuadrado);


    }

}