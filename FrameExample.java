
import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class FrameExample extends JFrame implements ActionListener {
	JButton show, clear;
    JTextField message;

    FrameExample() {
        show = new JButton("SHOW");
        show.setBounds(100, 200, 100, 50);
        clear = new JButton("CLEAR");
        clear.setBounds(300, 200, 100, 50);
        message = new JTextField("hello programer");
        message.setBounds(100, 300, 300, 50);
        add(message);
        add(clear);
        add(show);
        show.addActionListener(this);
        clear.addActionListener(this); // Add action listener to the clear button
        setLayout(null);
        setSize(600, 600);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FrameExample();
    }

    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if (o == show) {
            message.setText("It's lonely on top");
        } else if (o == clear) {
            message.setText(""); // Set text to empty string to clear the text field
        }
    }
}