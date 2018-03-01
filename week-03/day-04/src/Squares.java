import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Squares {
  private static void mainDraw(Graphics graphics) {
    // https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/recursion/drawing/graphic.png

    //graphics.drawRect(WIDTH/2- WIDTH/4, HEIGHT/2 - HEIGHT/4, WIDTH/3, HEIGHT/3);

    int n = 1;
    int size = WIDTH/3;
    int x = size;
    int y = size;
    magicMethod(graphics, n, size, x, y);
  }

  private static void magicMethod(Graphics graphics, int n, int size, int x, int y) {
    if (n > 10) {
      return;
    } else {
      //Top
      graphics.drawRect(x, y-size,size, size);
      magicMethod(graphics, n+1, size/3, x+size/3, y-size+size/3);
      //Bottom
      graphics.drawRect(x, y+size,size, size);
      magicMethod(graphics, n+1, size/3, x+size/3, y+size+size/3);
      //Left
      graphics.drawRect(x-size, y,size, size);
      magicMethod(graphics, n+1, size/3, x-size+size/3, y+size/3);
      //Right
      graphics.drawRect(x+size, y,size, size);
      magicMethod(graphics, n+1, size/3, x+size+size/3, y+size/3);
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