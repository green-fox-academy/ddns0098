import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        Random rand = new Random();
        int x = rand.nextInt(WIDTH);
        int y = rand.nextInt(HEIGHT);
        drawLinesEverywhere(graphics, x, y);


    }

    private static void drawLinesEverywhere(Graphics graphics, int x, int y) {
        graphics.drawLine(x,y,WIDTH/2,HEIGHT/2);
        for (int i = 0; i < WIDTH/20; i++) {
            graphics.drawLine(i*20,0,WIDTH/2,HEIGHT/2);
            graphics.drawLine(i*20,HEIGHT,WIDTH/2,HEIGHT/2);
        }
        for (int i = 0; i < HEIGHT/20 +1; i++) {
            graphics.drawLine(0,i*20,WIDTH/2,HEIGHT/2);
            graphics.drawLine(WIDTH,i*20,WIDTH/2,HEIGHT/2);
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