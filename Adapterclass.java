import java.awt.*;
import java.awt.event.*;

import org.w3c.dom.Text;

public class Adapterclass extends KeyAdapter {
    private static final String text = null;
    Label l;
    TextArea area;
    Frame f;

    Adapterclass(){
        f = new Frame("Key Adapter");
        l = new Label();
        l.setBounds(20, 50, 200, 20);
        area = new TextArea();
        area.setBounds(20, 80, 300,300);
        f.add(l);
        f.add(area);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

    }

    public void keyReleased(KeyEvent e){
        String str = area.getText();
        String[] words = text.split("\\s");

        l.setText("Words"+words.length+" Characters :"+text.length());
    }
    
    public static void main(String[] args) {
        new Adapterclass();
    }
}
