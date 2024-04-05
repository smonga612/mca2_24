class A
{
static int x;
static 
{
x=18;
System.out.println("Inside static block-1");
}
/*
A(int x)
{
System.out.println("Inside constructor");

this.x=x;
}*/
void display()
{
System.out.println(x);
}

static 
{
System.out.println("Inside static block-2");
}

}

class statblock
{

public static void main(String args[])
{
A a1=new A();
a1.display();
}
static 
{
System.out.println("Inside main-static block");
}

}