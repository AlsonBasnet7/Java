import javax.swing.*;

public class gui01 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Title");

        // Load the image icon from the same folder as this class
        ImageIcon image = new ImageIcon(gui01.class.getResource("download.png"));

        // Debug: check if the image is being found
        System.out.println(gui01.class.getResource("download.png"));

        // Set the frame icon
        frame.setIconImage(image.getImage());

        frame.setSize(420, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}