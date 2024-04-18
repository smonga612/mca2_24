class ithread extends Thread
{
String name;

ithread(String name)
{
this.name=name;
}
public void run()
{
for(int i=1;i<=10;i++)
{
System.out.println("Value of i for "+name+ " thread is "+i);
}

}


}


class jthread extends Thread
{
String name;

jthread(String name)
{
this.name=name;
}
public void run()
{
for(int j=10;j>0;j--)
{
System.out.println("Value of j for "+name+ " thread is "+j);
}

}


}



class testthread
{
public static void main(String args[])
{
ithread t1=new ithread("t1");
t1.start();
jthread t2=new jthread("t2");
t2.start();


}
}