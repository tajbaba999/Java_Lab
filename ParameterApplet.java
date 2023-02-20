import java.applet.*;
import java.awt.*;
public class ParameterApplet extends Applet {
 public void init() {
 }
 public void paint(Graphics g) {
 g.drawString("Name: "+getParameter("name"),50,25);
 g.drawString("Age: "+getParameter("age"),50,50);
g.drawString("Phone number: "+getParameter("number"),50,75);
 }
/*<html>
<body>
 <applet code="Parameterapplet.class" width="300" height="300">
 <param name="name" value="Samrath reddy">
 <param name="age" value="19">
 <param name="number" value="798*****90">
 </applet>
</body>
</html>
*/
}