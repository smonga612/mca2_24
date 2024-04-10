class testprg
{
public static void main(String args[])
{
int a=0;
int b=0;

int c=0,d=0,e=0;

try
{
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
c=a+b;
d=a*b;
e=a/b;
}
catch(ArithmeticException ae)
{
System.out.println("Sorry it can't be divide because demoninator value is 0");
}
catch(ArrayIndexOutOfBoundsException ae)
{
System.out.println("Value is missing ...");
}


System.out.println("Addition : "+c);
System.out.println("Multiplication : "+d);
System.out.println("Division : "+e);

}
}