import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class gui02 {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setTitle("JFrame title goes here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420, 420);

        ImageIcon image = new ImageIcon("SwingBroCode/download.png");
        frame.setIconImage(image.getImage()); // set icon BEFORE visible

        frame.setVisible(true);
    }
}