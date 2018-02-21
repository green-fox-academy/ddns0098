import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.
        Random rand = new Random();
        int goalSize = rand.nextInt(WIDTH);
        int size = WIDTH;
        do {
            Color color = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
            drawSquare(graphics, size, color);
            size--;
        } while (size > goalSize);

    }

    private static void drawSquare(Graphics graphics, int size, Color color) {
        graphics.setColor(color);
        graphics.fillRect(WIDTH/2-size/2,HEIGHT/2-size/2, size,size);
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