/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applets;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Vishal
 */
public class Applets extends JPanel {

    Polygon polygon;

    public Applets() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.add(new Applets());
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        polygon = new Polygon();
        polygon.addPoint(70, 40);
        polygon.addPoint(45, 80);
        polygon.addPoint(65, 15);
        polygon.addPoint(68, 20);
        g.drawPolygon(polygon);
        //g.drawRect(10, 20, 50, 100);
        //To change body of generated methods, choose Tools | Templates.
    }

}
