class A
{
int a;
void setA(int x)
{
a=x;
}
int getA()
{
return(a);
}

static void show()
{

System.out.println("Inside A show");
}
}


class B extends A
{
 int b=10;
void setB(int x)
{
b=x;
}
int getB()
{
return(b);
}

void show()
{
super.show();
System.out.println("Inside B show");
}

}

class testprg
{
public static void main(String args[])
{
B b1=new B();
b1.setA(3);
b1.setB(4);
System.out.println(b1.getA()+" "+b1.getB());
b1.show();

}




}
