import java.applet.*;
import java.awt.*;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingWidgets extends JFrame{
    SwingWidgets(){
        setLayout(new FlowLayout());
        JTextArea text = new JTextArea(5, 20);
        add(text);
    // add(new JScrollPane(text));
    JTextField field = new JTextField(20);
    add(field);
    JPasswordField pass = new JPasswordField(10);
    add(pass);
    JCheckBox check = new JCheckBox("check box");
    add(check);
     JRadioButton button = new JRadioButton("Radio Button");
     add(button);
     JRadioButton button2 = new JRadioButton("Radio Button-2");
     add(button2);
    //  ButtonGroup radiobuttongroup = new ButtonGroup();
    //  radiobuttongroup.add(button);
    //  radiobuttongroup.add(button2);
     JLabel label = new JLabel("Done");
     add(label);
    }
    public static void main(String[] args) {
        SwingWidgets sc = new SwingWidgets();
        sc.setTitle("Swing components");
        sc.setSize(400, 200);
        // sc.setLocationRelativeTo(null);
        // sc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sc.setVisible(true);
    }

}
