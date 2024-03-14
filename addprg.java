class A
{
public static void main(String args[])
{
int a,sum=0;

for (int i=0;i<args.length;i++)
{
a=Integer.parseInt(args[i]);
sum=sum+a;
}
System.out.println("Sum is "+sum);


}
}