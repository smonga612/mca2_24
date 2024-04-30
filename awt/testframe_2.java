import java.awt.*;

class myframe extends Frame
{

myframe()
{
setVisible(true);
setSize(800,600);
setLayout(null);
}

void designForm()
{
Label l1=new Label("Enter the name");
Label l2=new Label("Enter mobile number");
TextField tf1=new TextField();
TextField tf2=new TextField();

Button b1=new Button("Save");

Choice c1=new Choice();
List ll1=new List();


c1.add("C++");
c1.add("Java");
c1.add("Windows");

ll1.add("English");
ll1.add("Hindi");
ll1.add("French");



//add(l1);
//add(l2);
//add(tf1);
//add(tf2);
//add(b1);

//add(c1);
//add(ll1);

l1.setBounds(100,100,150,50);
l2.setBounds(100,150,150,50);

tf1.setBounds(200,100,250,40);
tf2.setBounds(200,150,250,40);

b1.setBounds(150,200,75,25);

c1.setBounds(200,300,100,25);
ll1.setBounds(300,300,100,100);

CheckboxGroup cbg=new CheckboxGroup();

Checkbox cb1=new Checkbox("C++",cbg,true);
Checkbox cb2=new Checkbox("Java",cbg,true);
Checkbox cb3=new Checkbox("Python",cbg,false);


cb1.setBounds(100,100,50,10);
cb2.setBounds(200,100,50,10);
cb3.setBounds(300,100,50,10);

add(cb1);
add(cb2);
add(cb3);






}



}

class testframe 
{
public static void main(String args[])
{
myframe m1=new myframe();
m1.designForm();

}
}

