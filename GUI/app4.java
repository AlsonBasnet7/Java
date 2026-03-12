public class app4 {
    
}
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;

public class design {
    public static void main(String[] args) {

        JFrame frame = new JFrame("SignUP");
        frame.setSize(800, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(40, 80, 420, 320);

        Border border = BorderFactory.createLineBorder(Color.BLACK);
        panel.setBorder(border);

        frame.add(panel);

        // Email Label
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(20, 20, 100, 30);
        panel.add(emailLabel);

        // Email TextField
        JTextField emailField = new JTextField();
        emailField.setBounds(150, 20, 200, 30);
        panel.add(emailField);

        // Gender Label
        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setBounds(20, 70, 100, 30);
        panel.add(genderLabel);

        // Male Radio Button
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(150, 70, 80, 30);
        panel.add(male);

        // Female Radio Button
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(250, 70, 100, 30);
        panel.add(female);

        // Button Group (to select only one gender)
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        // Place Label
        JLabel placeLabel = new JLabel("Place");
        placeLabel.setBounds(20, 120, 100, 30);
        panel.add(placeLabel);

        // ComboBox (Dropdown)
        String[] places = {"Dharan", "Itahari", "Biratnagar"};
        JComboBox<String> placeComboBox = new JComboBox<>(places);
        placeComboBox.setBounds(150, 120, 200, 30);
        panel.add(placeComboBox);

        // Address Label
        JLabel addressLabel = new JLabel("Address");
        addressLabel.setBounds(20, 170, 100, 30);
        panel.add(addressLabel);

        // Address TextArea
        JTextArea addressArea = new JTextArea();
        addressArea.setBounds(150, 170, 200, 60);
        panel.add(addressArea);

        // Submit Button
        JButton buttonName = new JButton("Submit");
        buttonName.setBounds(150, 250, 100, 30);
        panel.add(buttonName);

        frame.setVisible(true);
    }
}