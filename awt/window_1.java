import java.awt.*;
import java.awt.event.*;
class myframe extends Frame implements WindowListener,KeyListener
{
Label l1;
TextField tf1,tf2;
myframe()
{
setVisible(true);
setSize(800,600);
setLayout(null);
l1=new Label("Enter the name");
tf1=new TextField();
tf2=new TextField();

}
public void windowDeactivated(WindowEvent we)
{
System.out.println("Inside window deactivated");
}

public void windowActivated(WindowEvent we)
{
System.out.println("Inside window activated");
}

public void windowIconified(WindowEvent we)
{
System.out.println("Inside window iconified");
}

public void windowDeiconified(WindowEvent we)
{
System.out.println("Inside window deiconified");
}

public void windowClosing(WindowEvent we)
{
System.out.println("Inside window closing");
dispose();
}

public void windowClosed(WindowEvent we)
{
System.out.println("Inside window closed");
}
public void windowOpened(WindowEvent we)
{
System.out.println("Inside window open");
}
public void keyReleased(KeyEvent ke)
{
String s=tf1.getText();
tf1.setText(s.toUpperCase());
tf1.setCaretPosition(s.length());

System.out.println("Inside key Released");
}

public void keyPressed(KeyEvent ke)
{
//String s=tf1.getText();
//tf1.setText(s.toUpperCase());
//tf1.setCaretPosition(s.length());



System.out.println("Inside key Pressed");
}

public void keyTyped(KeyEvent ke)
{
String s=tf1.getText();
tf1.setText(s.toUpperCase());
tf1.setCaretPosition(s.length());
tf2.setText(tf1.getText());
tf2.setCaretPosition(s.length());

System.out.println("Inside key Typed");
}




void designform()
{
addWindowListener(this);
l1.setBounds(100,100,100,30);
tf1.setBounds(250,100,100,30);
tf2.setBounds(250,50,100,30);
add(l1);
add(tf1);
add(tf2);
tf1.addKeyListener(this);
}
}
class testframe
{
public static void main(String args[])
{

myframe m1=new myframe();
m1.designform();
}



}