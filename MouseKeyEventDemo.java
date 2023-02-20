import java.awt.*;
import java.awt.event.*;
public class MouseKeyEventDemo extends Frame implements MouseListener,KeyListener {
private TextField MouseX;
private TextField MouseY;
private TextField Input;
private TextArea Display;
private Label xl,yl;
public MouseKeyEventDemo() {
setBackground(Color.yellow);
setForeground(Color.red);
setLayout(new FlowLayout());
xl=new Label("X-Click: ");
MouseX = new TextField(20);
yl=new Label("Y-Click: ");
MouseY = new TextField(20);
Input = new TextField(20);
Display = new TextArea(5,30);
Font fo = new Font("Serif", Font.ITALIC, 20); //Optional
xl.setFont(fo); //Optional
MouseX.setFont(fo); //Optional
yl.setFont(fo); //Optional
MouseY.setFont(fo); //Optional
MouseX.setEditable(false);
MouseY.setEditable(false);
Display.setEditable(false);
add(xl);
add(MouseX);
add(yl);
add(MouseY);
add(new Label("Enter any text:"));
add(Input);
add(Display);
addMouseListener(this);
Input.addKeyListener(this);
setTitle("Mouse, Key Event Demo");
setSize(350, 100);
setVisible(true);
}
@Override
public void mouseClicked(MouseEvent evt) {
MouseX.setText(evt.getX() + "");
MouseY.setText(evt.getY() + "");
Graphics g=getGraphics();
g.setColor(Color.RED);
g.fillOval(evt.getX(),evt.getY(),30,30);
}
@Override
public void keyTyped(KeyEvent evt) {
Display.append("You have typed " + evt.getKeyChar() + "\n"); }
@Override public void keyPressed(KeyEvent evt) { }
@Override public void keyReleased(KeyEvent evt) { }
@Override public void mousePressed(MouseEvent evt) { }
@Override public void mouseReleased(MouseEvent evt) { }
@Override public void mouseEntered(MouseEvent evt) { }
@Override public void mouseExited(MouseEvent evt) { }
public static void main(String[] args) {
new MouseKeyEventDemo();
}
}