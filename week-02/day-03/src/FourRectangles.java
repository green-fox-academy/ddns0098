import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.

        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            graphics.setColor(new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
            int sizeX = rand.nextInt(WIDTH-10);
            int sizeY = rand.nextInt(HEIGHT-10);
            int x = rand.nextInt(WIDTH-sizeX);
            int y = rand.nextInt(HEIGHT-sizeY);
            graphics.drawRect(x,y,sizeX,sizeY);
        }

    }

    //    Don't touch the code below
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}