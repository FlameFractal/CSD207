package Drivers;

import SNU.geometryUtil.Circle;
import SNU.geometryUtil.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class CirclePanel extends JPanel {

    Point p;
    Circle c;
    int x, y, diameter, mouseX, mouseY;
    String message;
    int counter;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Circle - Inside or not?");
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.add(new CirclePanel());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public CirclePanel() {
        message = "ha";
        counter=0;
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e); //To change body of generated methods, choose Tools | Templates.
                x = 100;
                y = 100;
                diameter = 50;
                mouseX = e.getX();
                mouseY = e.getY();
                p = new Point(mouseX - (x + diameter / 2), mouseY - (y + diameter / 2));
                System.out.println(mouseX + " " + mouseY);
                System.out.println(p.isInside(c));
                message = "true";
                message = String.valueOf(p.isInside(c));
                counter++;
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        if(counter%80==0)
        super.paintComponent(g);
        g.drawOval(x, y, diameter, diameter);
        c = new Circle(diameter / 2);
        g.drawString(message, mouseX, mouseY);

    }
}
