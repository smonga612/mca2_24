//Single Level Inheritance

class A
{
int a;
A()
{
System.out.println("Inside A's default constructor");
a=10;
}
A(int a)
{
System.out.println("Inside A's parameter constructor");
this.a=a*10;
}


void setA(int a)
{
this.a=a;
}
int getA()
{
System.out.println("Value of a is ");
return(a);
}

}

class B extends A
{
int b;
B()
{
System.out.println("Inside B's default constructor");
b=20;
}

B(int b)
{

System.out.println("Inside B's paramter constructor");
this.b=b;
}
int getB()
{

return(b);
}
}

class C extends B
{
int c;
C()
{
System.out.println("Inside C's default constructor");
c=30;
}

C(int c)
{
System.out.println("Inside C's paramter constructor");
this.c=c;
}
int getC()
{

return(c);
}
}



class inhjava
{
public static void main(String args[])
{
C c1=new C(5);
System.out.println(c1.getA());
System.out.println(c1.getB());
System.out.println(c1.getC());


}
}