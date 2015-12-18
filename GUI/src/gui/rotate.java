package gui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class rotate extends JPanel {

    int cx, cy, side, radius, delta;
    Timer timer;
    int flag;
    
    rotate panel;
    
    
    

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        cx = getWidth() / 2;
        cy = getHeight() / 2;
        radius = (int) (side / Math.sqrt(2));
        
        panel=this;
        
        int angle1=135, angle2=45, angle3=315, angle4=225;

        int x1 = cx + (int) (radius * Math.cos(Math.toRadians(angle1 + delta)));
        int y1 = cy + (int) (radius * Math.sin(Math.toRadians(angle1 + delta)));

        int x2 = cx + (int) (radius * Math.cos(Math.toRadians(angle2 + delta)));
        int y2 = cy + (int) (radius * Math.sin(Math.toRadians(angle2 + delta)));

        int x3 = cx + (int) (radius * Math.cos(Math.toRadians(angle3 + delta)));
        int y3 = cy + (int) (radius * Math.sin(Math.toRadians(angle3 + delta)));

        int x4 = cx + (int) (radius * Math.cos(Math.toRadians(angle4 + delta)));
        int y4 = cy + (int) (radius * Math.sin(Math.toRadians(angle4 + delta)));

        
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x4, y4);
        g.drawLine(x4, y4, x1, y1);


    }

    rotate() {
        delta = 0;
        side = 100;
        flag=1;
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e); //To change body of generated methods, choose Tools | Templates.
                switch(e.getKeyCode()){
                    case KeyEvent.VK_RIGHT: delta = delta + 10;
                        break;
                    case KeyEvent.VK_LEFT: delta = delta - 10;
                        break;
                    case KeyEvent.VK_UP: side = side + 10;
                        break;
                    case KeyEvent.VK_DOWN: side = side - 10;
                }
                System.out.println(e.getKeyCode());
                repaint();
            }
        });
        setFocusable(true);
        setRequestFocusEnabled(true);
        
        
        addMouseMotionListener(new MouseAdapter() {

            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseEntered(e); //To change body of generated methods, choose Tools | Templates.
                panel.requestFocus();
            }
            
        });
        
        
        
        
        
        timer = new Timer(0,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if(side<getHeight() && flag==1){
                    side = side + 1;
                    if(side==getHeight())
                        flag=0;
                }
                    
                else{
                    side = side - 1;
                    if(side==0)
                        flag=1;
                }
                repaint();
            }
        });
        timer.start();
    }
    
    
    
    
    
    
    
    
static int clicks=0;
    public static void main(String[] args) {
        JFrame frame = new JFrame("lalala");
        frame.setLayout(new GridLayout(3, 3));
        Color c = new Color(WIDTH, WIDTH, WIDTH);
        rotate[] panels = new rotate[9];
        for(int i=0;i<9;i++){
            panels[i] = new rotate();
            panels[i].setFocusable(true);
            panels[i].setRequestFocusEnabled(true);
            frame.add(panels[i]);
            
        }
        
       
        frame.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e) {
                    clicks++;
                    frame.setTitle(String.valueOf(clicks));
                }

        });

        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }

}
