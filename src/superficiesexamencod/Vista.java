/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficiesexamencod;

/**
 *
 * @author FOLFO
 */
public class Vista {
    public static void imprimir(Modelo contenedor) {
        if (contenedor.getShapeType().equalsIgnoreCase("Cuadrado")) {
            System.out.println("El area de tu cuadrado es: " + contenedor.getSquareArea());
        }
        if (contenedor.getShapeType().equalsIgnoreCase("Rectangulo")) {
            System.out.println("El area de tu rectangulo es: " + contenedor.getRectangleArea());
        }
        if (contenedor.getShapeType().equalsIgnoreCase("Triangulo")) {
            System.out.println("El area de tu triangulo es: " + contenedor.getTriangleArea());
        }
        if (contenedor.getShapeType().equalsIgnoreCase("Circulo")) {
            System.out.println("El area de tu circulo es:" + contenedor.getCircleArea());
        }

    }
}
