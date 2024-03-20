class A
{
int a;
static int b;
A(int a,int b)
{
this.a=a;
this.b=b;
}

void print()
{
System.out.println("A="+a+" "+"B=" +b);
}

static void display()
{
System.out.println("B=" +b);
}
}

class statmethod
{
public static void main(String args[])
{
//A a1=new A(2,3);
//a1.print();
A.display();

}
}
