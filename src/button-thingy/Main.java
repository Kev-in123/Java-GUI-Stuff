import javax.swing.*;

public class Main extends JFrame {
    Main() {
        setTitle("Custom Button");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        add(new ButtonThingy("Button", 10, 10, 100, 50));
    }
    public static void main(String[] args) {
        new Main();
    }
}