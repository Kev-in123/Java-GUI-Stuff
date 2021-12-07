// imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mouse2 extends JFrame implements MouseMotionListener {
  // declare a few variables we will use later
  static int xpos = 150;
  static int ypos = 150;
  int vel = 2;

  Mouse2() {
    // add a mouse motion listener
    addMouseMotionListener(this);
    // set the size
    setSize(300, 300);
    // make it so there is no layout manager
    setLayout(null);
    // make the window visible
    setVisible(true);
  }

  public static void main(String[] args) {
    new Mouse2();
  }

  // paint function to draw the square
  @Override
  public void paint(Graphics g) {
    // we don't want to draw a line
    super.paint(g);
    // set the colour
    g.setColor(Color.RED);
    // render the rectangle
    g.fillRect(xpos, ypos, 30, 30);
  }

  // find the distance between two points
  public double get_distance(double x1, double y1, double x2, double y2) {
    return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
  }

  // called when the mouse is moved
  public void mouseMoved(MouseEvent e) {
    // get the x and y position of the mouse
    double mouseX = e.getX();
    double mouseY = e.getY();
    // get the distance between the mouse and the square
    // if the distance is 50 or less, move the square away from the mouse
    if (get_distance(mouseX, mouseY, xpos, ypos) <= 50) {
      if (mouseX > xpos) {
        xpos--;
      } else {
        xpos++;
      }
      if (mouseY > ypos) {
        ypos--;
      } else {
        ypos++;
      }
    }
    // repaint the square
    repaint();
  }

  // called when the mouse is dragged
  public void mouseDragged(MouseEvent e) {
  }

}