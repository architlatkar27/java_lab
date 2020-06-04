import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class LambdaEvent{
    public static void main(String args[]){
        JFrame jf=new JFrame("lambda eventlisteners testing");
        
        JLabel l=new JLabel("empty right now");
        jf.add(l);
        JButton b=new JButton("press me");
        jf.add(b);
        b.addActionListener(e->{
            if(e.getActionCommand().equals("press me"))
            l.setText("test successful");
        });
        
        jf.setSize(300,300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
   
}