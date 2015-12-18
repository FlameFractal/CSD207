/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitar;

import java.awt.*;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.media.j3d.Clip;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
















public class Guitar extends JFrame {

    Guitar() {
        setSize(500, 500);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout());
        this.add(new GString() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });
        this.add(new GString());
        this.add(new GString());
        this.add(new GString());
        this.add(new GString());
    }

    public static void main(String[] args) {

        Guitar gibson = new Guitar();
        gibson.setLayout(new GridLayout(5, 1, 0, 20));
        gibson.setVisible(true);

    }

}























class GString extends JPanel implements MouseListener {

    @Override
    protected void paintComponent(Graphics g) {
        this.setBackground(Color.red);
        g.drawLine(this.getX(), this.getHeight() / 2, this.getWidth(), (this.getHeight()) / 2);
        repaint();

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
