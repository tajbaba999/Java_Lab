import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class ToolTipAndFileExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tooltip and File Example");

        // Create a text field and add it to the frame
        JTextField textField = new JTextField();
        frame.add(textField, BorderLayout.NORTH);

        // Create a button and add it to the frame
        JButton button = new JButton("Save");
        frame.add(button, BorderLayout.SOUTH);

        // Add a tooltip to the button
        button.setToolTipText("Click to save the contents of the text field to a file.");

        // Set the frame size and make it visible
        frame.setSize(400, 100);
        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create a file chooser dialog
                JFileChooser fileChooser = new JFileChooser();

                // Show the dialog and wait for the user to select a file
                int result = fileChooser.showSaveDialog(frame);

                if (result == JFileChooser.APPROVE_OPTION) {
                    // Get the selected file
                    File file = fileChooser.getSelectedFile();

                    try {
                        // Open a file writer and write the contents of the text field to the file
                        FileWriter writer = new FileWriter(file);
                        writer.write(textField.getText());
                        writer.close();

                        // Show a success message
                        JOptionPane.showMessageDialog(frame, "File saved successfully.");
                    } catch (IOException ex) {
                        // Show an error message if the file couldn't be saved
                        JOptionPane.showMessageDialog(frame, "Error saving file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
    }
}