    package gradedlab4;

    import java.awt.*;
    import java.awt.event.*;
    import javax.swing.*;

    public class GradedLab4 extends JFrame {

        stringPanel panel;
        int fontsize;
        int height;
        int r, g, b;

        GradedLab4(String title) {
            super(title);
            r = 0;
            g = 0;
            b = 0;
            fontsize = 50;
            height = 100;
            panel = new stringPanel();
            add(panel);
            setSize(500, 500);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);

        }

        class stringPanel extends JPanel {

            stringPanel() {
                addKeyListener(new KeyAdapter() {
                    public void keyPressed(KeyEvent e) {

                        switch (e.getKeyCode()) {
                            case KeyEvent.VK_UP:
                                System.out.println("up");
                                height--;
                                break;
                            case KeyEvent.VK_DOWN:
                                System.out.println("down");
                                height++;
                                break;
                            case KeyEvent.VK_LEFT:
                                System.out.println("left");
                                updateRGB(1);
                                fontsize++;
                                break;
                            case KeyEvent.VK_RIGHT:
                                System.out.println("right");
                                updateRGB(0);
                                fontsize--;
                                break;
                            default:
                                System.out.println(e.getKeyCode());
                        }
                        repaint();
                    }
                });

                setFocusable(true);
                setAutoRequestFocus(true);

            }

            void updateRGB(int i) {
                if (i == 0) {
                    if (r >=255) {
                        r = 255;
                        g = 255;
                        b = 255;
                        System.out.println(r + " " + g + " " + b);
                    } else {
                        r++;
                        g++;
                        b++;
                        System.out.println(r + " " + g + " " + b);
                    }
                } else if (i == 1) {
                    if (r <= 0) {
                        r = 0;
                        g = 0;
                        b = 0;
                        System.out.println(r + " " + g + " " + b);
                    } else {
                        r--;
                        g--;
                        b--;
                        System.out.println(r + " " + g + " " + b);
                    }
                }
            }

            @Override
            protected void paintComponent(Graphics G) {
                super.paintComponent(G); //To change body of generated methods, choose Tools | Templates
                G.setFont(new Font("TimesRoman", Font.PLAIN, fontsize));
                G.setColor(new Color(r, g, b));
                G.drawString("Hello World", 100, height);
            }

        }

        public static void main(String[] args) {
            JFrame frame = new GradedLab4("graded lab 4");
            frame.setVisible(true);
        }

    }
