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
public class Circle extends GeometricObject {

    private double radius;
    private Point centre;
    private double area;
    private double circumference;
    
    
    
    public Circle(){
        radius = 0;
        centre = new Point(0,0);  
    }

    public Circle(double r) {
        radius = r;
        centre = new Point(0,0);
    }

    public Circle(double r, Point centre) {
        radius = r;
        this.centre = centre;
        area = Math.PI * radius * radius;
        circumference = 2 * Math.PI * radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public void setCentre(Point centre){
        this.centre = centre;
    }
    
    public void setFromUser(){
        double x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        this.setRadius(scanner.nextDouble());
        System.out.println("Enter the x coordinate of the centre of the circle: ");
        x=scanner.nextDouble();
        System.out.println("Enter the y coordinate of the centre of the circle: ");
        y=scanner.nextDouble();
        this.setCentre(new Point(x,y));
    }
    
    public boolean pointIsInside(Point p){
        return Math.pow(p.getX(), 2) + Math.pow(p.getY(), 2) <= Math.pow(this.radius, 2);
    }

    public double area() {
        this.area = area = Math.PI * radius * radius;
        return area;
    }
    public double perimeter() {
        this.circumference = circumference = 2 * Math.PI * radius;
        return circumference;
    }
    
    public Point getCentre(){
        return centre;
    }

    

}