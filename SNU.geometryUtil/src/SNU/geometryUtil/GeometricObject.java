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
public abstract class GeometricObject implements Comparable {

    public abstract double area();

    public abstract double perimeter();

    public double costOfPainting(GeometricObject g) {
        return g.area() * 100;
    }

    @Override
    public int compareTo(Object o) {
        if (this.area() > ((GeometricObject) o).area()) {
            return 1;
        } else if (this.area() < ((GeometricObject) o).area()) {
            return -1;
        } else {
            return 0;
        }
    }

    public Comparable max(Comparable o1, Comparable o2) {
        if (o1.compareTo(o2) > 0) {
            return o1;
        }
        return o2;
    }

}
