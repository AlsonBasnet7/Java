import javax.swing.*;

public class App {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Multiple Fields GUI");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // absolute positioning

        int labelX = 50;
        int labelY = 50;
        int labelWidth = 100;
        int labelHeight = 30;

        int fieldX = labelX + labelWidth + 20;
        int fieldY = labelY;
        int fieldWidth = 200;
        int fieldHeight = 30;

        int verticalGap = 50;

        // Row 1
        JLabel label1 = new JLabel("Email:");
        label1.setBounds(labelX, labelY, labelWidth, labelHeight);
        frame.add(label1);

        JTextField field1 = new JTextField();
        field1.setBounds(fieldX, fieldY, fieldWidth, fieldHeight);
        frame.add(field1);

        // Row 2
        labelY += verticalGap;
        fieldY += verticalGap;

        JLabel label2 = new JLabel("Password:");
        label2.setBounds(labelX, labelY, labelWidth, labelHeight);
        frame.add(label2);

        JTextField field2 = new JTextField();
        field2.setBounds(fieldX, fieldY, fieldWidth, fieldHeight);
        frame.add(field2);

        // Row 3
        labelY += verticalGap;
        fieldY += verticalGap;

        JLabel label3 = new JLabel("Phone:");
        label3.setBounds(labelX, labelY, labelWidth, labelHeight);
        frame.add(label3);

        JTextField field3 = new JTextField();
        field3.setBounds(fieldX, fieldY, fieldWidth, fieldHeight);
        frame.add(field3);

        frame.setVisible(true);
    }
}