import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//<applet code="Reversing" width=500 height=500 ></applet>
public class Reversing extends Applet implements KeyListener{
	TextField t1;
	Label l1;
	public void init(){
		l1=new Label("enter a number");
		t1=new TextField(10);
		add(l1);add(t1);
		t1.addKeyListener(this);
	}
	public void keyPressed(KeyEvent k){
		StringBuffer r;
		if(k.getKeyChar()=='r'){
			r=new StringBuffer(t1.getText());
			showStatus(r.reverse().toString());
		}
	}
	public void keyTyped(KeyEvent k){}
	public void keyReleased(KeyEvent k){
		showStatus(" ");
	}
	public void paint(Graphics g){}
}
			
