 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SNU.geometryUtil;

import java.util.Scanner;

/**
 *
 * @author Vishal
 */
public class Triangle extends GeometricObject{

    private Point a, b, c;
    private double sideAB, sideBC, sideAC;
    private double area;
    private double perimeter;
    
    public Triangle(){
        this.a = new Point(0,0);
        this.b = new Point(0,0);
        this.c = new Point(0,0);
    }

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void setFromUser() {
        double x1, y1, x2, y2, x3, y3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the x1: ");
        x1 = scanner.nextDouble();
        System.out.println("Enter the y1: ");
        y1 = scanner.nextDouble();
        System.out.println("Enter the x2: ");
        x2 = scanner.nextDouble();
        System.out.println("Enter the y2: ");
        y2 = scanner.nextDouble();
        System.out.println("Enter the x3: ");
        x3 = scanner.nextDouble();
        System.out.println("Enter the y3: ");
        y3 = scanner.nextDouble();
        this.a = new Point(x1,y1);
        this.b = new Point(x2,y2);
        this.c = new Point(x3,y3);
    }

    public double area() {
        this.area = Triangle.calculateArea(this);
        return area;
    }
    
    public static double calculateArea(Triangle triangle){
        return Math.abs(0.5 * ((triangle.a.getX() - triangle.c.getX()) * (triangle.b.getY() - triangle.a.getY()) - (triangle.a.getX() - triangle.b.getX()) * (triangle.c.getY() - triangle.a.getY())));
    }
    
    public boolean pointIsInside(Point p){
        return ((Triangle.calculateArea(new Triangle(p, this.a, this.b))+Triangle.calculateArea(new Triangle(p, this.a, this.c))+Triangle.calculateArea(new Triangle(p, this.b, this.c)))==this.area());
    }
    
    public double perimeter(){
        this.perimeter = sideAB + sideBC + sideAC;
        return perimeter;
    }
    
    public double getSideAB(){
        this.sideAB = Point.distance(a, b);
        return sideAB;
    }
    
    public double getSideBC(){
        this.sideBC = Point.distance(b, c);
        return sideBC;
    }
    
    public double getSideAC(){
        this.sideAC = Point.distance(a, c);
        return sideAC;
    }
    
    @Override
    public double costOfPainting(GeometricObject g) {
        return super.costOfPainting(g); //To change body of generated methods, choose Tools | Templates.
    }

}
