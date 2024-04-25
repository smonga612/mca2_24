import java.awt.*;
import java.applet.*;

public class firstapplet extends Applet
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

public void paint(Graphics g)
{
System.out.println("Inside paint");
Font f=new Font("Arial",Font.BOLD,20);
Color c=new Color(200,0,0);
Color c1=new Color(255,255,255);
//setBackground(Color.BLUE);
g.setFont(f);
g.setColor(c);


for(int i=10;i<=300;i+=10)
{
g.setColor(c);

g.drawString("Welcome to Java Applet",50+i,100);
try
{
Thread.sleep(100);
g.setColor(c1);

g.drawString("Welcome to Java Applet",50+i,100);

}
catch(Exception e)
{
}
}

for(int i=10;i<300;i+=10)
{
g.setColor(c);

g.drawString("Welcome to Java Applet",350-i,100);
try
{
Thread.sleep(100);
g.setColor(c1);

g.drawString("Welcome to Java Applet",350-i,100);

}
catch(Exception e)
{
}
}


//g.setColor(c1);

//g.drawString("Welcome to Java Class",120,200);

//g.drawOval(250,200,150,150);
//g.fillOval(250,200,150,150);

//g.fillRect(250,250,200,200);
//Color c2=new Color(0,0,255);
//g.setColor(c2);
//g.drawString("Welcome",260,280);

//g.drawLine(300,100,400,100);
//g.drawArc(300,250,100,100,0,-180);
//g.fillArc(300,250,100,100,0,180);
//g.setColor(c1);
//g.fillArc(300,250,100,100,0,-180);



}

public void destroy()
{
System.out.println("Inside destroy");
}






}