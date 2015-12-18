/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SNU.geometryUtil;

/**
 *
 * @author Vishal
 */
public class Rectangle extends GeometricObject{

    private final double side1;
    private final double side2;
    private final double area;
    private final double perimeter;

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;

        this.area = side1 * side2;
        this.perimeter = 2 * (side1 + side2);
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double area() {
        return area;
    }

    public double perimeter() {
        return perimeter;
    }

    @Override
    public double costOfPainting(GeometricObject g) {
        return super.costOfPainting(g); //To change body of generated methods, choose Tools | Templates.
    }
}
