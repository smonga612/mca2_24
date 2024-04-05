class A
{
int a;
void show()
{
System.out.println("Inside A's show");
}

}

class B extends A
{
int b;
void show()
{
System.out.println("Inside B's show");
}
}

class testprg
{
public static void main(String args[])
{
B b1=new B();
b1.show();
}
}



