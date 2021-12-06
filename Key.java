//imports
import java.awt.event.*;
import javax.swing.*;

public class Key extends JFrame implements KeyListener {

  Key() {
    // add a key listener
    addKeyListener(this);
    // set the size
    setSize(300, 300);
    // make it so there is no layout manager
    setLayout(null);
    // make the window visible
    setVisible(true);
  }

  // called when a key is pressed
  public void keyPressed(KeyEvent e) {
    // arrow key events
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      System.out.println("Up Arrow Pressed");
    }
    if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      System.out.println("Down Arrow Pressed");
    }
    if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      System.out.println("Left Arrow Pressed");
    }
    if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      System.out.println("Right Arrow Pressed");
    }
  }

  // called when a key is released
  public void keyReleased(KeyEvent e) {
  }

  // called when a key is typed
  public void keyTyped(KeyEvent e) {
  }

  public static void main(String[] args) {
    new Key();
  }
}
