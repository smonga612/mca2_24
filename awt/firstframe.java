import java.awt.*;

class myframe extends Frame
{
myframe(String title)
{
setVisible(true);
setSize(600,400);
setTitle(title);
setLayout(null);
setBackground(Color.RED);
setForeground(Color.WHITE);
}
void designForm()
{
Label l1=new Label("Enter the name");
Label l2=new Label("Enter the Mobile Number");
l1.setBounds(100,100,120,50);
l2.setBounds(100,150,150,50);

add(l1);
add(l2);
}



}

class testframe 
{
public static void main(String args[])
{
myframe m1=new myframe("First Frame");
m1.designForm();

myframe m2=new myframe("Second Frame");
m2.designForm();


myframe m3=new myframe("Third Frame");
m3.designForm();


myframe m4=new myframe("Fourth Frame");
m4.designForm();

}
}