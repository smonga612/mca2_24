import java.awt.*;
import java.awt.event.*;

class myframe extends Frame implements MouseListener,MouseMotionListener
{
Label l1;
myframe()
{

setVisible(true);
setSize(800,600);
setTitle("Mouse Listener");
setLayout(null);
l1=new Label();
l1.setBounds(100,100,50,30);
add(l1);
l1.setText("hello");

}

public void mouseExited(MouseEvent me)
{
System.out.println("Inside mouse Exited");
setBackground(Color.WHITE);
l1.setBounds(100+me.getX(),100+me.getY(),50,30);
}

public void mouseEntered(MouseEvent me)
{
setBackground(Color.RED);
System.out.println("Inside mouse Entered");

}
public void mouseReleased(MouseEvent me)
{

System.out.println("Inside mouse Released");
}

public void mousePressed(MouseEvent me)
{
System.out.println("Inside mouse pressed");
}

public void mouseClicked(MouseEvent me)
{
setBackground(Color.BLUE);

System.out.println("Inside mouse clicked");
}

public void mouseMoved(MouseEvent me)
{
setBackground(Color.GREEN);
String s=me.getX()+","+me.getY();
l1.setText(s);

System.out.println("Inside mouse moved "+s);
}

public void mouseDragged(MouseEvent me)
{
setBackground(Color.YELLOW);

System.out.println("Inside mouse dragged");
}



void designform()
{
addMouseListener(this);
addMouseMotionListener(this);

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