import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
  static int WIDTH = 800;
  static int HEIGHT = 800;

  static int down = 35;
  static int sideWays = 10;
  static int nPoints = 6;

  static double x1 = WIDTH / 2 - sideWays;
  static double y1 = HEIGHT / 3 - down / 2;

  static double xFirstPoints[] = {x1, x1 - sideWays, x1, x1 + sideWays * 2, x1 + sideWays * 3, x1 + sideWays * 2};
  static double yFirstPoints[] = {y1, y1 + down / 2, y1 + down, y1 + down, y1 + down / 2, y1};

  public static void mainDraw(Graphics graphics) {
    // Create a line drawing function that takes 2 parameters:
    // The x and y coordinates of the line's starting point
    // and draws a line from that point to the center of the canvas.
    // Draw 3 lines with that function. Use loop for that.



    drawMainLine(graphics);
    drawRightSide(graphics);
    drawLeftSide(graphics);

  }

  private static void drawLeftSide(Graphics graphics) {
    int counter = 6;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < counter; j++) {
        graphics.drawPolygon(modifyXIntFirstPointsToLeftSide(i,xFirstPoints),modifyIntYFirstPointsToTheSides(i,j,yFirstPoints), nPoints);
      }
      counter--;
    }
  }

  private static int[] modifyXIntFirstPointsToLeftSide(int i, double[] xFirstPoints) {
    int[] modifyIntXFirstPoints = castXFirstPoints(xFirstPoints);
    for (int j = 0; j < modifyIntXFirstPoints.length; j++) {
      modifyIntXFirstPoints[j] -= (i+1)*(sideWays*3);
    }
    return modifyIntXFirstPoints;
  }


  private static void drawRightSide(Graphics graphics) {
    int counter = 6;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < counter; j++) {
        graphics.drawPolygon(modifyXIntFirstPointsToRightSide(i,xFirstPoints),modifyIntYFirstPointsToTheSides(i,j,yFirstPoints), nPoints);
      }
      counter--;
    }
  }

  private static void drawMainLine(Graphics graphics) {
    for (int i = 0; i < 7; i++) {
      graphics.drawPolygon(castXFirstPoints(xFirstPoints), modifyIntYFirstPoints(i, yFirstPoints), nPoints);
    }
  }

  private static int[] modifyIntYFirstPoints(int i, double[] yFirstPoints) {
    int[] modifyIntYFirstPoints = castYFirstPoints(yFirstPoints);
    for (int j = 0; j < modifyIntYFirstPoints.length; j++) {
      modifyIntYFirstPoints[j] += i*down;
    }
    return modifyIntYFirstPoints;
  }

  private static int[] modifyXIntFirstPointsToRightSide(int i, double[] xFirstPoints) {
    int[] modifyIntXFirstPoints = castXFirstPoints(xFirstPoints);
    for (int j = 0; j < modifyIntXFirstPoints.length; j++) {
      modifyIntXFirstPoints[j] += (i+1)*(sideWays*3);
    }
    return modifyIntXFirstPoints;
  }

  private static int[] modifyIntYFirstPointsToTheSides(int i, int j, double[] yFirstPoints) {
    int[] modifyIntYFirstPoints = castYFirstPoints(yFirstPoints);
    for (int k = 0; k < modifyIntYFirstPoints.length; k++) {
      if (j == 0) {
        modifyIntYFirstPoints[k] += (j + i +1) * (down / 2);
      } else {
        modifyIntYFirstPoints[k] += (i - 1) * down/2 + ((j +1) * down);
      }
    }
    return modifyIntYFirstPoints;
  }

  private static int[] castYFirstPoints(double[] yFirstPoints) {
    int[] intYFirstPoints = new int[yFirstPoints.length];
    for (int i = 0; i < yFirstPoints.length; i++) {
      intYFirstPoints[i] = (int) yFirstPoints[i];
    }
    return intYFirstPoints;
  }

  private static int[] castXFirstPoints(double[] xFirstPoints) {
    int[] intXFirstPoints = new int[xFirstPoints.length];
    for (int i = 0; i < xFirstPoints.length; i++) {
      intXFirstPoints[i] = (int) xFirstPoints[i];
    }
    return intXFirstPoints;
  }

  // Don't touch the code below


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