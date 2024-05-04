import java.awt.*;
import java.awt.event.*;
class myframe extends Frame implements ActionListener
{
Label l1,l2,l3;
TextField tf1,tf2;
Button b1,b2;

myframe()
{

setVisible(true);
setLayout(null);
setSize(800,600);
}
void designform()
{
l1=new Label("Enter number-1");
l2=new Label("Enter number-2");
l3=new Label("Result is ");
tf1=new TextField();
tf2=new TextField();
b1=new Button("Add");
b2=new Button("Sub");

l1.setBounds(100,100,100,30);
tf1.setBounds(200,100,100,30);
l2.setBounds(100,150,100,30);
tf2.setBounds(200,150,100,30);
b1.setBounds(100,300,50,30);
b2.setBounds(150,300,50,30);

l3.setBounds(100,350,100,30);

b1.addActionListener(this);
b2.addActionListener(this);

add(l1);
add(tf1);
add(l2);
add(tf2);
add(l3);
add(b1);
add(b2);



}

public void actionPerformed(ActionEvent ae)
{
int a,b,c;
a=Integer.parseInt(tf1.getText());
b=Integer.parseInt(tf2.getText());
if(ae.getActionCommand()=="Add")
{
c=a+b;
}
else
{
c=a-b;
}
l3.setText("Result is "+c);

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