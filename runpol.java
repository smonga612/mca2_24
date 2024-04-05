class A
{
void display()
{
System.out.println("Inside A display");

}
void print()
{
}

}

class B extends A
{
void display()
{
System.out.println("Inside B display");

}

void print()
{
System.out.println("Inside B print");

}


}

class C extends A
{
void display()
{
System.out.println("Inside C display");

}

void print()
{
System.out.println("Inside C print");

}

}



class testm
{
public static void main(String args[])
{
A a1;
a1=new B();
a1.print();
a1=new C();
a1.print();


}

}

