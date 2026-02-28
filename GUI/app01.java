import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Multiple Fields GUI");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(3, 2, 10, 10)); // rows, cols, gaps

        frame.add(new JLabel("Email:"));
        frame.add(new JTextField());

        frame.add(new JLabel("Password:"));
        frame.add(new JTextField());

        frame.add(new JLabel("Phone:"));
        frame.add(new JTextField());

        frame.setVisible(true);
    }
}