class A
{
static void display()
{
System.out.println("Inside A Display");

}
}

class B extends A
{
static void display()
{
System.out.println("Inside B Display");
}
void disp()
{
super.display();
}
}

class testm
{
public static void main(String args[])
{
B b1=new B();
b1.display();
((A)b1).display();


}




}

