class A
{
int a;
static int b;
A()
{
a=1;
b=1;
}
void incr()
{
a++;
b++;
}



int geta()
{
return(a);
}
int getb()
{
return(b);
}

}


class stattest
{
public static void main(String args[])
{
A a1=new A();
A a2=new A();
A a3=new A();

a1.incr();
a2.incr();
System.out.println(a1.geta()+" "+a1.getb());
System.out.println(a2.geta()+" "+a2.getb());
System.out.println(a3.geta()+" "+a3.getb());



}



}