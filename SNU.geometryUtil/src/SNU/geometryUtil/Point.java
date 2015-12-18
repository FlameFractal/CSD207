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
public class Point extends GeometricObject implements Colorable{

    private double x;
    private double y;
    
    
    
    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public boolean isInside(Triangle t){
        return t.pointIsInside(this);
    }
    
    public boolean isInside(Circle c){
        return c.pointIsInside(this);
    }
    
    public void setX(double x){
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }
    
    public void setFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the x: ");
        this.setX(scanner.nextDouble());
        System.out.println("Enter the y: ");
        this.setY(scanner.nextDouble());
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public static double distance(Point a, Point b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    @Override
    public double area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double perimeter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void howToColor() {
        System.out.println("Dot with a coloured pen");
    }

    @Override
    public double costOfPainting(GeometricObject g) {
        return super.costOfPainting(g); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
