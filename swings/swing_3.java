import javax.swing.*;
import java.awt.*;
class myframe extends JFrame
{
myframe()
{
setVisible(true);
setSize(800,600);
setLayout(null);
}
void designform()
{
JDialog jd1=new JDialog(this,"Test",true);
jd1.setVisible(true);
jd1.setSize(500,500);

JPanel jp2=new JPanel();
jp2.setBounds(300,100,250,250);
//add(jp2);

jp2.setBackground(Color.BLUE);
JPanel jp1=new JPanel();

jp1.setBounds(500,100,250,250);
jp1.setBackground(Color.RED);

//add(jp1);



JButton jb1=new JButton("OK");
jb1.setBounds(100,100,150,30);
jp1.add(jb1);

JButton jb2=new JButton("Cancel");
jb2.setBounds(250,100,150,30);
jp1.add(jb2);


JButton jb3=new JButton("Yes");
jb3.setBounds(100,300,150,30);
jp2.add(jb3);

JButton jb4=new JButton("No");
jb4.setBounds(250,300,150,30);
jp2.add(jb4);

JTextArea jt1=new JTextArea();
jt1.setBounds(10,10,800,600);
add(jt1);

}

}

class testframe
{
public static void main(String args[])
{
myframe mf=new myframe();
mf.designform();


}


}


