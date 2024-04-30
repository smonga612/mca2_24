import java.awt.*;
import java.awt.event.*;

class myframe extends Frame implements MouseListener,MouseMotionListener
{
myframe()
{
setVisible(true);
setSize(800,600);
setTitle("Mouse Listener");
}

public void mouseExited(MouseEvent me)
{
System.out.println("Inside mouse Exited");
setBackground(Color.WHITE);
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

System.out.println("Inside mouse moved");
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