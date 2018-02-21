import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        /*int gap = 20;
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                if (i%2 == 0) {
                    graphics.drawRect(i*gap,j*gap,gap,gap);
                    if (j%2==0) {
                        graphics.fillRect(i * gap, j * gap, gap, gap);
                    }
                }else {
                        graphics.drawRect(i*gap,j*gap,gap,gap);
                        if (j%2!=0) {
                            graphics.fillRect(i * gap, j * gap, gap, gap);
                        }
                }

            }
        }*/
        int gap = WIDTH/8;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    graphics.setColor(Color.white);
                    graphics.fillRect(i * gap, j * gap, gap, gap);
                    if (j % 2 == 0) {
                        graphics.setColor(Color.black);
                        graphics.fillRect(i * gap, j * gap, gap, gap);
                    }
                } else {
                    graphics.setColor(Color.white);
                    graphics.fillRect(i * gap, j * gap, gap, gap);
                    if (j % 2 != 0) {
                        graphics.setColor(Color.black);
                        graphics.fillRect(i * gap, j * gap, gap, gap);
                    }
                }

            }
        }

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}