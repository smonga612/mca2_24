import java.applet.*;
import java.awt.Graphics;
import java.awt.*;

public class firstapp extends Applet
{
public void init()
{
System.out.println("Inside init");
}
public void start()
{
System.out.println("Inside start");
}
public void stop()
{
System.out.println("Inside stop");
}
public void destroy()
{
System.out.println("Inside destroyed");
}
public void paint(Graphics g) 
{
Color c=new Color(100,0,0);
System.out.println("Inside paint");
for(int i=10;i<=400;i+=10)
{
g.setColor(c);
g.drawString("hello",10+i,45);
try
{
Thread.sleep(100);
Color c1=new Color(255,255,255);

g.setColor(c1);
g.drawString("hello",10+i,45);

}
catch(Exception e)
{
}
}
}
}

