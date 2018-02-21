import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Horizontal {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a 50 long horizontal line from that point.
        // Draw 3 lines with that function. Use loop for that.
        drawRandomHorizontalLines(graphics, WIDTH, HEIGHT);


    }

    private static void drawRandomHorizontalLines(Graphics graphics, int width, int height) {
        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            int x = rand.nextInt(width);
            int y = rand.nextInt(height);
            graphics.setColor(new Color(rand.nextInt(255), rand.nextInt(255),rand.nextInt(255)));
            graphics.drawLine(x, y, x+50,y);
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