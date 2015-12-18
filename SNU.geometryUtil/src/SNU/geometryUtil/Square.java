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
public class Square extends GeometricObject implements Colorable{

    final private double sideLength;
    final private double area;
    final private double perimeter;

    public Square(double sideLength) {
        this.sideLength = sideLength;
        this.area = Math.pow(sideLength, 2);
        this.perimeter = sideLength * 4;
    }

    public double area() {
        return area;
    }

    public double perimeter() {
        return perimeter;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    public void howToColor() {
        System.out.println("All 4 sides");
    }
    
    @Override
    public double costOfPainting(GeometricObject g) {
        return super.costOfPainting(g); //To change body of generated methods, choose Tools | Templates.
    }
}
