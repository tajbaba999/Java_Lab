import java.awt.event.*;
import javax.swing.*;
public class Adapterclass extends MouseAdapter {
 JLabel label;
 public static void main(String[] args) {
 JFrame frame=new JFrame("Adapter Class Example");
 JPanel panel=new JPanel();
 JLabel label=new JLabel("Hello, World!");
 panel.add(label);
 frame.add(panel);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.pack();
 frame.setVisible(true);
 Adapterclass example=new Adapterclass(label);
 panel.addMouseListener(example);
 }
//  public Adapterclass(JLabel label){this.label=label;}
 public void mouseEntered(MouseEvent e){label.setText("Wow,Mouse entered!!");}
 public void mouseExited(MouseEvent e){label.setText("Oops,Mouse exited!!");}
}
