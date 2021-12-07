import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Key2 extends JFrame implements KeyListener {
  static int xpos = 150;
  static int ypos = 150;
  int vel = 2;

  Key2() {
    addKeyListener(this);
    setSize(300, 300);
    setLayout(null);
    setVisible(true);
  }

  public static void main(String[] args) {
    new Key2();
  }

  @Override
  public void paint(Graphics g) {
    super.paint(g);
    g.setColor(Color.RED);
    g.fillRect(xpos, ypos, 30, 30);
  }

  public void keyPressed(KeyEvent e) {
    // arrow key events
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      ypos -= vel;
    }
    if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      ypos += vel;
    }
    if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      xpos -= vel;
    }
    if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      xpos += vel;
    }
    repaint();
  }

  public void keyReleased(KeyEvent e) {}

  public void keyTyped(KeyEvent e) {}

}