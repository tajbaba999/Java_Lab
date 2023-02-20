import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingDemo extends JFrame implements ActionListener {
    private JLabel label;
    private JTextField textField;

    public SwingDemo() {
        super("Swing Demo");

        // create label
        label = new JLabel("Enter some text:");

        // create text field
        textField = new JTextField(20);

        // create button
        JButton button = new JButton("Display Text");
        button.addActionListener(this);

        // add widgets to content pane
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(label);
        c.add(textField);
        c.add(button);

        // set window properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // display text in label
        label.setText(textField.getText());
    }

    public static void main(String[] args) {
        new SwingDemo();
    }
}