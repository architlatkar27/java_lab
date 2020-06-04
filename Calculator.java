import java.applet.*;
import java.awt.event.*;
import java.awt.*;
/*
<applet code="Calculator" width=800 height=800></applet>
*/
public class Calculator extends Applet implements ActionListener{
	Button b1,b2,b3,b4;
	Label l1,l2,l3;
	TextField t1,t2,t3;
	public void init(){
		setLayout(null);
		l1=new Label("operand 1"); add(l1);
		l1.setBounds(20,20,70,40);
		l2=new Label("opreand 2"); add(l2);
		l2.setBounds(20,60,70,80);
		l3=new Label("result "); add(l3);
		l3.setBounds(20,100,70,120);
		t1=new TextField(10); add(t1);
		t1.setBounds(80,20,200,40);
		t2=new TextField(10); add(t2);
		t2.setBounds(80,60,200,80);
		t3=new TextField(30); add(t3);
		t3.setBounds(80,100,200,120);
		b1=new Button("+"); add(b1);
		b2=new Button("-"); add(b2);
		b3=new Button("*"); add(b3);
		b4=new Button("/"); add(b4);
		b1.addActionListener(this);b1.setBounds(200,10,220,40);
		b2.addActionListener(this);b2.setBounds(200,50,220,80);
		b3.addActionListener(this);b3.setBounds(200,90,220,120);
		b4.addActionListener(this);b4.setBounds(200,130,220,170);
	}
	public void actionPerformed(ActionEvent ae){
		int res;
		String action=ae.getActionCommand();
		if(action.equals("+")){
			res=Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText());
			t3.setText(String.valueOf(res));
		}
		else if(action.equals("-")){
			res=Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText());
			t3.setText(String.valueOf(res));
		}
		else if(action.equals("*")){
			res=Integer.parseInt(t1.getText())*Integer.parseInt(t2.getText());
			t3.setText(String.valueOf(res));
		}
		else{
			if(t2.getText().equals("0")) t3.setText("divide by zero error");
			else{
				res=Integer.parseInt(t1.getText())/Integer.parseInt(t2.getText());
				t3.setText(String.valueOf(res));
			}
		}
	}
}
