import java.awt.*;
import java.applet.*;

public class simpleapplet extends Applet{
	public void paint(Graphics g){
		g.drawString("Hello Applet",20,20);
	}
}
/* <applet code="simpleapplet.class" height=400 width=400></applet>*/