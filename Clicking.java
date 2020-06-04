import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="Clicking" width=400 height=400></applet>
*/
public class Clicking extends Applet{
	String msg="";
	public void init(){
		addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent me){
				showStatus("mouse Clicked");msg="Welcome"; repaint();
				
			}
			public void mouseReleased(MouseEvent me){
				showStatus("mouse released");msg="Goodbye"; repaint();
			}});
	}
	public void paint(Graphics g){
		g.drawString(msg,20,20);
	}
}


