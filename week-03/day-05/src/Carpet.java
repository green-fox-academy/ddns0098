import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Carpet {

  static int ITERATOR = 0;

  private static void mainDraw(Graphics graphics) {
    // https://github.com/greenfox-academy/teaching-materials/blob/master/workshop/recursion/drawing/graphic.png

    //graphics.drawRect(WIDTH/2- WIDTH/4, HEIGHT/2 - HEIGHT/4, WIDTH/3, HEIGHT/3);

    int n = 0;
    int size = WIDTH/3;
    int x = WIDTH/2;
    int y = HEIGHT/2;
    int iterator = 0;
    magicMethod(graphics, n, size, x, y, iterator);
  }

  private static void magicMethod(Graphics graphics, int n, int size, int x, int y, int iterator) {
    graphics.setColor(getRandomColor());

    if (n > 6) {

    } else if (iterator < ITERATOR) {
      Random random = new Random();
      //Middle
      graphics.fillRect(x, y,size, size);
      magicMethod(graphics, n+1, size/3, x+size/3, y+size/3, iterator+random.nextInt(20)+1);

      //Top
      magicMethod(graphics, n+1, size/3, x+size/3, y-size+size/3, iterator+random.nextInt(20)+1);

      //Bottom
      magicMethod(graphics, n+1, size/3, x+size/3, y+size+size/3, iterator+random.nextInt(20)+1);

      //Left
      magicMethod(graphics, n+1, size/3, x-size+size/3, y+size/3, iterator+random.nextInt(20)+1);

      //Right
      magicMethod(graphics, n+1, size/3, x+size+size - (size/3) * 2, y+size/3, iterator+random.nextInt(20)+1);

      //Top-right corner
      magicMethod(graphics, n+1, size/3, x+size+(size/3), y-size+size/3, iterator+random.nextInt(20)+1);

      //Top-left corner
      magicMethod(graphics, n+1, size/3, x-size+size/3, y-size+size/3, iterator+random.nextInt(20)+1);

      //Bottom-left corner
      magicMethod(graphics, n+1, size/3, x-size+size/3, y+size*2-(size/3) * 2, iterator+random.nextInt(20)+1);

      //Bottom-right corner
      magicMethod(graphics, n+1, size/3, x+size*2-(size/3) * 2, y+size*2-(size/3) * 2, iterator+random.nextInt(20)+1);
    }
  }

  // Don't touch the code below
  static int WIDTH = 729;
  static int HEIGHT = 729;

  public static void main(String[] args) throws InterruptedException {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel imagePanel = new ImagePanel();
    jFrame.add(imagePanel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);

    while(true) {
      imagePanel.repaint();
      ITERATOR ++;
      Thread.sleep(300);
    }
  }

  private static Color getRandomColor() {
    Random random = new Random();
    int r = random.nextInt(256);
    int g = random.nextInt(256);
    int b = random.nextInt(256);
    return new Color(r,g,b);
  }



  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}