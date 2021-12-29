import javax.swing.JButton;

public class ButtonThingy extends JButton {
    ButtonThingy(String name, int x, int y, int width, int height) {
        super(name);
        setBounds(x, y, width, height);        
    }
}
