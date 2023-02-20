import javax.swing.*;
import java.awt.*;

public class LayoutManagerExample {
    public static void main(String[] args) {
        // Create a new frame and set its size
        JFrame frame = new JFrame("Layout Manager Example");
        frame.setSize(400, 400);

        // Create a new panel and set its layout to BorderLayout
        JPanel panel1 = new JPanel(new BorderLayout());

        // Create a label and add it to the panel at the top (north) position
        JLabel label1 = new JLabel("This is a BorderLayout example.");
        panel1.add(label1, BorderLayout.NORTH);

        // Create a button and add it to the panel at the center position
        JButton button1 = new JButton("Click me!");
        panel1.add(button1, BorderLayout.CENTER);

        // Create a new panel and set its layout to GridLayout
        JPanel panel2 = new JPanel(new GridLayout(2, 2));

        // Create four buttons and add them to the panel
        JButton button2 = new JButton("Button 1");
        JButton button3 = new JButton("Button 2");
        JButton button4 = new JButton("Button 3");
        JButton button5 = new JButton("Button 4");
        panel2.add(button2);
        panel2.add(button3);
        panel2.add(button4);
        panel2.add(button5);

        // Create a new panel and set its layout to FlowLayout
        JPanel panel3 = new JPanel(new FlowLayout());

        // Create a label and add it to the panel
        JLabel label2 = new JLabel("This is a FlowLayout example.");
        panel3.add(label2);

        // Create a button and add it to the panel
        JButton button6 = new JButton("Click me too!");
        panel3.add(button6);

        // Add the panels to the frame
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.CENTER);
        frame.add(panel3, BorderLayout.SOUTH);

        // Make the frame visible
        frame.setVisible(true);
    }
}