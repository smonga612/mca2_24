import javax.swing.*;
class myframe extends JFrame
{
myframe()
{
setVisible(true);
setSize(800,600);
setLayout(null);
}

 void designForm()
{
JRadioButton jbr1=new JRadioButton("Test");
JButton jb1=new JButton("Ok");
jb1.setBounds(100,100,130,50);
jbr1.setBounds(100,200,130,50);

add(jb1);
add(jbr1);

}
}


class testframe
{
public static void main(String args[])
{
myframe mf1=new myframe();
mf1.designForm();
}
}
