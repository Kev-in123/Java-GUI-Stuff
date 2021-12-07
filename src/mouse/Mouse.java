//imports
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mouse extends JFrame implements MouseListener {

  Mouse() {
    // add a listener
    addMouseListener(this);
    // set the size
    setSize(255, 255);
    // make it so there is no layout manager
    setLayout(null);
    // make the window visible
    setVisible(true);
  }

  // called when a button on the mouse is pressed
  public void mousePressed(MouseEvent e) {
    Graphics g = getGraphics();
    Color c = new Color(e.getY(), e.getY(), e.getX());
    g.setColor(c);
    g.fillOval(e.getX(), e.getY(), 30, 30);
  }

  // called when the mouse is in the window
  public void mouseEntered(MouseEvent e) {
  }

  // called when the mouse left the window
  public void mouseExited(MouseEvent e) {
  }

  // called when a button on the mouse is clicked
  public void mouseClicked(MouseEvent e) {
  }

  // called when a button on the mouse is released
  public void mouseReleased(MouseEvent e) {
  }

  public static void main(String[] args) {
    new Mouse();
  }
}
