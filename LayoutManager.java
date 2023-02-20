// import java.awt.BorderLayout;
// import javax.swing.BoxLayout;
// import javax.swing.GroupLayout;
// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JPanel;
// import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;


public class LayoutManager {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Layout manager:");
        JPanel panle = new JPanel();

        BorderLayout borderlayout = new BorderLayout();
        panle.setLayout(borderlayout);
        JButton button1 = new JButton("Button 1");
        panle.add(button1, borderlayout.NORTH);
        JButton button2 = new JButton("Button 2");
        panle.add(button2, borderlayout.SOUTH);

        // GridLayout girdlayout = new GridLayout(2,2);
        GridLayout gridLayout = new GridLayout(2,2);
        JPanel buttonpanel = new JPanel();
        JButton button3 = new JButton("Button 3");
        buttonpanel.add(button3);
        panle.add(buttonpanel, borderlayout.CENTER);
        buttonpanel.add(new JButton("Button 4"));
        panle.add(new JButton("Button 5"));
        panle.add(buttonpanel);

        frame.add(panle);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


      }
}
