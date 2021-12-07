// imports
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Key2 extends JFrame implements KeyListener {
  // declare a few variables we will use later
  static int xpos = 150;
  static int ypos = 150;
  int vel = 2;

  Key2() {
    // add a key listener
    addKeyListener(this);
    // set the size
    setSize(300, 300);
    // make it so there is no layout manager
    setLayout(null);
    // make the window visible
    setVisible(true);
  }

  public static void main(String[] args) {
    new Key2();
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

  public void keyPressed(KeyEvent e) {
    // arrow key events
    // (0, 0) is the top left corner
    
    // if the up arrow is pressed, decrement `ypos` 
    if (e.getKeyCode() == KeyEvent.VK_UP) {
      ypos -= vel;
    }
    
    // if the down arrow is pressed, increment `ypos`
    if (e.getKeyCode() == KeyEvent.VK_DOWN) {
      ypos += vel;
    }
    
    // if the left arrow is pressed, decrement `xpos`
    if (e.getKeyCode() == KeyEvent.VK_LEFT) {
      xpos -= vel;
    }
    
    // if the right arrow is pressed, increment `xpos`
    if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
      xpos += vel;
    }
    
    // repaint the square
    repaint();
  }

  // these functions are not used, they're only here so Java doesn't scream at me
  public void keyReleased(KeyEvent e) {}
  public void keyTyped(KeyEvent e) {}

}
