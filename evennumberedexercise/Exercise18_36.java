import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exercise18_36 extends JApplet {
  public Exercise18_36() {
    add(new View());
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Exercise18_36");    
    JApplet applet = new Exercise18_36();
    frame.add(applet);
    frame.setSize(210, 220);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
    
  class View extends JPanel {
    private Vertex[] vertices = new Vertex[3]; 

    View() {
      // Create three initial vertices for the triangle
      vertices[0] = new Vertex(20, 20);
      vertices[1] = new Vertex(120, 20);
      vertices[2] = new Vertex(50, 100);
      
      addMouseMotionListener(new MouseMotionAdapter() {
        public void mouseDragged(MouseEvent e) {
          Vertex v = getContainingVertex(e.getPoint());
          
          if (v != null) {
            // Add a vertex
            v.x = e.getX(); v.y = e.getY();
            repaint();
          }         
        }
        
        public void mouseMoved(MouseEvent e) {
          Vertex v = getContainingVertex(e.getPoint());
          
          if (v != null) {
            // Set a cross-hair cursor
            setCursor(crossHairCursor);
          } 
          else {
            // Set the default cursor
            setCursor(defaultCursor);            
          }
        }
      });
    }
    
    Cursor crossHairCursor = new Cursor(Cursor.CROSSHAIR_CURSOR);
    Cursor defaultCursor = new Cursor(Cursor.DEFAULT_CURSOR);
    
    Vertex getContainingVertex(Point p) {
      for (int i = 0; i < vertices.length; i++)
        if (vertices[i].contains(p))
          return vertices[i];
      
      return null;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      
      double a = Vertex.getDistance(vertices[2], vertices[1]);
      double b = Vertex.getDistance(vertices[0], vertices[2]);
      double c = Vertex.getDistance(vertices[0], vertices[1]);     
      double[] angle = new double[3];
      angle[0] = Math.acos((a * a - b * b - c * c) / (-2 * b * c));
      angle[1] = Math.acos((b * b - a * a - c * c) / (-2 * a * c));
      angle[2] = Math.acos((c * c - b * b - a * a) / (-2 * a * b));
            
      // Display vertices
      for (int i = 0; i < vertices.length; i++) {
        g.fillOval(vertices[i].x - Vertex.RADIUS / 4, 
            vertices[i].y - Vertex.RADIUS / 4, 2 * Vertex.RADIUS / 4, 2 * Vertex.RADIUS / 4);
        // Get the angle at vertex i
        g.drawString((int)(Math.toDegrees(angle[i])) + " ", vertices[i].x , vertices[i].y);
      }    
        
      // Draw a triangle
      Polygon p = new Polygon();
      p.addPoint(vertices[0].x, vertices[0].y);
      p.addPoint(vertices[1].x, vertices[1].y);
      p.addPoint(vertices[2].x, vertices[2].y);     
      // g.setColor(Color.ORANGE);
      // g.fillPolygon(p);
      g.setColor(Color.BLACK);
      g.drawPolygon(p);
    }
  }
  
  static class Vertex {
    final static int RADIUS = 10;
    int x, y;
    
    public Vertex() {
    }
    
    public Vertex(int x, int y) {
      this.x = x;
      this.y = y;
    }
    
    public Vertex(Point p) {
      this(p.x, p.y);
    }

    public int getX() {
      return x;
    }
    
    public void setX(int x) {
      this.x = x;
    }
    
    public int getY() {
      return y;
    }
    
    public void setY(int y) {
      this.y = y;
    }
    
    public boolean equals(Object o) {
      Vertex c = (Vertex)o;
      return c.getX() == x && c.getY() == y; 
    }
    
    public double getDistance(Vertex c) {
      return getDistance(x, y, c.x, c.y);
    }
    
    public static double getDistance(Vertex c1, Vertex c2) {
      return getDistance(c1.x, c1.y, c2.x, c2.y);
    }
    
    public static double getDistance(double x1, double y1, double x2, double y2) {
      return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }
    
    public boolean contains(Point p) {
      return getDistance(x, y, p.x, p.y) <= RADIUS;
    }
  }
}
