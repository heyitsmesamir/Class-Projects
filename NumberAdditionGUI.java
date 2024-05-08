import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberAdditionGUI extends JFrame implements ActionListener {
    private JTextField num1Field, num2Field, sumField;
    private JButton addButton;

    public NumberAdditionGUI() {
        // Set up the JFrame
        setTitle("Number Addition");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window
        setLayout(new GridLayout(3, 2));

        // Create components
        JLabel num1Label = new JLabel("Number 1:");
        JLabel num2Label = new JLabel("Number 2:");
        JLabel sumLabel = new JLabel("Sum:");

        num1Field = new JTextField();
        num2Field = new JTextField();
        sumField = new JTextField();
        sumField.setEditable(false); // Make sumField read-only

        addButton = new JButton("Add");
        addButton.addActionListener(this);

        // Add components to the JFrame
        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(sumLabel);
        add(sumField);
        add(addButton);

        setVisible(true); // Make the GUI visible
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            try {
                // Parse the numbers from the text fields
                int num1 = Integer.parseInt(num1Field.getText());
                int num2 = Integer.parseInt(num2Field.getText());

                // Calculate the sum and display it in sumField
                int sum = num1 + num2;
                sumField.setText(Integer.toString(sum));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid integers.");
            }
        }
    }

    public static void main(String[] args) {
        // Create an instance of NumberAdditionGUI
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new NumberAdditionGUI();
            }
        });
    }
}
