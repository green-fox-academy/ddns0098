import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Pyramid {
    static int down = 17;
    static int sideWays = 10;
    static int nPoints = 3;

    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Draw 3 lines with that function. Use loop for that.
        int x = WIDTH / 2;
        int y = HEIGHT / 6;



        int xFirstPoints[] = {x, x - sideWays, x + sideWays};
        int yFirstPoints[] = {y, y + down, y + down};
        graphics.drawPolygon(xFirstPoints, yFirstPoints, nPoints);

        int counter = 2;
        for (int i = 0; i < 21; i++) {
            int firstTriangleX = x - (i+1) * sideWays;
            int firstTriangleY = y + (i+1) * down;
            drawColumns(graphics, firstTriangleX, firstTriangleY, counter, i);
            counter++;
        }
    }

    public static void drawColumns(Graphics graphics, int x, int y, int counter, int i) {
        for (int j = 0; j < counter; j++) {
            int xPoints[] = {x + j * sideWays * 2, x - (j+1) * sideWays + (j * sideWays * 3), x + (j+1) * sideWays + (j * sideWays)};
            int yPoints[] = {y, y + down, y + down};
            graphics.drawPolygon(xPoints, yPoints, nPoints);
        }
    }

    // Don't touch the code below
    static int WIDTH = 800;
    static int HEIGHT = 800;

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