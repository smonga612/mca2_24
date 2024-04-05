class A
{
protected int a;
void  setA(int a)
{
this.a=a;
}
}

class B extends A
{
int b;
void setB(int b)
{
this.b=b;
}
int getA()
{
return(a);
}

int getB()
{
return(b);
}

}


class testprg
{
public static void main(String args[])
{
B b1=new B();
b1.setA(2);
b1.setB(12);

System.out.println(b1.getA()+" "+b1.getB());
System.out.println(b1.a);

}



}